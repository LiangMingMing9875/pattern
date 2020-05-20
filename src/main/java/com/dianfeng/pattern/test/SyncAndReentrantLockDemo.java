package com.dianfeng.pattern.test;

import org.apache.commons.codec.binary.StringUtils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/15 15:08
 */
class ShareResource{
    private int number=1;//A:1 B:2 C:3
    private Lock lock=new ReentrantLock();
    private Condition c1=lock.newCondition();
    private Condition c2=lock.newCondition();
    private Condition c3=lock.newCondition();

//    public void print2(){
//        lock.lock();
//        try{
//            //判断
//            while (number!=1){
//                c1.await();
//            }
//            //干活
//            for (int i = 1; i <= 2; i++) {
//                System.out.print(Thread.currentThread().getName()+i+" \t");
//            }
//            System.out.println();
//            number=2;
//            //通知
//            c2.signal();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }
//    }
//
//    public void print5(){
//        lock.lock();
//        try{
//            //判断
//            while (number!=2){
//                c2.await();
//            }
//            //干活
//            for (int i = 1; i <= 5; i++) {
//                System.out.print(Thread.currentThread().getName()+i+" \t");
//            }
//            System.out.println();
//            number=3;
//            //通知
//            c3.signal();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }
//    }
//
//    public void print8(){
//        lock.lock();
//        try{
//            //判断
//            while (number!=3){
//                c3.await();
//            }
//            //干活
//            for (int i = 1; i <= 8; i++) {
//                System.out.print(Thread.currentThread().getName()+i+" \t");
//            }
//            System.out.println();
//            number=1;
//            //通知
//            c1.signal();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }
//    }

    public void print(String threadName){
        lock.lock();
        try{
            if(StringUtils.equals("A",threadName)){
                while (number!=1){
                    c1.await();
                }
                for (int i = 1; i <= 2; i++) {
                    System.out.print(Thread.currentThread().getName()+i+" \t");
                }
                System.out.println();
                number=2;
                //通知
                c2.signal();
            }

            if (StringUtils.equals("B",threadName)) {
                while (number!=2){
                    c2.await();
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.print(Thread.currentThread().getName()+i+" \t");
                }
                System.out.println();
                number=3;
                //通知
                c3.signal();
            }
            if (StringUtils.equals("C",threadName)) {
                while (number!=3){
                    c3.await();
                }
                for (int i = 1; i <= 8; i++) {
                    System.out.print(Thread.currentThread().getName()+i+" \t");
                }
                System.out.println();
                System.out.println("------------------------------------------");
                number=1;
                //通知
                c1.signal();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
           lock.unlock();
        }
    }


}
public class SyncAndReentrantLockDemo {

    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();
        new Thread(()->{
            for (int i = 1; i <=10; i++) {
                shareResource.print(Thread.currentThread().getName());
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i <=10; i++) {
                shareResource.print(Thread.currentThread().getName());
            }
        },"B").start();

        new Thread(()->{
            for (int i = 1; i <=10; i++) {
                shareResource.print(Thread.currentThread().getName());
            }
        },"C").start();
    }

}
