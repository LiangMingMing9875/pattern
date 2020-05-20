package com.dianfeng.pattern.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/14 12:54
 */
public class ABAAtomicTest {
    static AtomicStampedReference<Integer> atomicInteger=new AtomicStampedReference<>(100,1);
    public static void main(String[] args) {
        new Thread(()->{
            atomicInteger.compareAndSet(100,101,1,2);
            boolean result = atomicInteger.compareAndSet(101, 100,2,3);
            System.out.println("result:"+result+"\t"+Thread.currentThread().getName()+",atomicInteger="+atomicInteger.getReference());
        },"t1").start();
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Thread(()->{
            boolean result = atomicInteger.compareAndSet(100, 2020,1,2);
            System.out.println("result:"+result+"\t"+Thread.currentThread().getName()+",atomicInteger="+atomicInteger.getReference());
        },"t2").start();
    }
}
