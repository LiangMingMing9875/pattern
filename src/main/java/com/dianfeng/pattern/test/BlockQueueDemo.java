package com.dianfeng.pattern.test;


import org.springframework.util.StringUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/18 9:56
 */
public class BlockQueueDemo {
    public static void main(String[] args) {
//        queueOfferAndPoll();
        queueAddRemove();
    }

    private static void queueOfferAndPoll() {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        if(blockingQueue.size()==3){
            System.out.println("队列满了");
        }
        System.out.println(blockingQueue.offer("x"));

        //检测


        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        if(!StringUtils.isEmpty(blockingQueue.peek())){
            System.out.println(blockingQueue.poll());
        }else{
            System.out.println("队列空了");
        }
    }

    private static void queueAddRemove() {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
//        System.out.println(blockingQueue.add("x"));
//        System.out.println(blockingQueue.element());
        System.out.println(blockingQueue.remove("b"));
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
    }
}
