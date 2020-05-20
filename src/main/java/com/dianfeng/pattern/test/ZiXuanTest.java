package com.dianfeng.pattern.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/11 9:54
 */
public class ZiXuanTest {
    AtomicReference<Thread> threadAtomicReference=new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"\t come in");
        while (!threadAtomicReference.compareAndSet(null,thread)){
            //自旋
//            System.out.print("当前线程："+thread.getName()+"\t");
        }
    }

    public void myUnlock(){
        Thread thread = Thread.currentThread();
        threadAtomicReference.compareAndSet(thread, null);
        System.out.println(thread.getName()+"\t unlock");
    }

    public static void main(String[] args) {
        ZiXuanTest ziXuanTest=new ZiXuanTest();
        new Thread(()->{
            ziXuanTest.myLock();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ziXuanTest.myUnlock();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            ziXuanTest.myLock();
            ziXuanTest.myUnlock();
        },"B").start();
    }
}

