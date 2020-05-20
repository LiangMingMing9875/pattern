package com.dianfeng.pattern.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/11 11:15
 */
public class AtomicTest {
    static AtomicInteger atomicInteger=new AtomicInteger(5);

    public static void main(String[] args) {
//        System.out.println(atomicInteger.compareAndSet(5, 10)+",atomicInteger="+atomicInteger.get());

        new Thread(()->{
            atomicInteger.compareAndSet(5,100);
            atomicInteger.compareAndSet(100,101);
            boolean result = atomicInteger.compareAndSet(101, 100);
            System.out.println("result:"+result+"\t"+Thread.currentThread().getName()+",atomicInteger="+atomicInteger.get());
        },"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            boolean result = atomicInteger.compareAndSet(100, 2020);
            System.out.println("result:"+result+"\t"+Thread.currentThread().getName()+",atomicInteger="+atomicInteger.get());
        },"t2").start();
    }
}
