package com.dianfeng.pattern.test;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/18 10:56
 */
public class ContainerSafeDemo {
    public static void main(String[] args) throws InterruptedException {
//        copyOnWriteArrayList();
        //SyschronizedList();
        //synchronizedSet();
        //copyOnWriteArraySet();
//        synchronizedMap();
        concurrentHashMap();
    }

    private static void concurrentHashMap() throws InterruptedException {
        Map<String, Object> map = new ConcurrentHashMap<>();
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                map.put(UUID.randomUUID().toString().substring(0,8),new Object());
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(JSONObject.toJSON(map));
    }

    private static void synchronizedMap() throws InterruptedException {
        Map<String, Object> map = Collections.synchronizedMap(new HashMap<>());
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                map.put(UUID.randomUUID().toString().substring(0,8),new Object());
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(JSONObject.toJSON(map));
    }

    private static void copyOnWriteArraySet() throws InterruptedException {
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(set);
    }

    private static void synchronizedSet() throws InterruptedException {
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(set);
    }

    private static void copyOnWriteArrayList() throws InterruptedException {
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));

            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println(list);
    }

    private static void SyschronizedList() throws InterruptedException {
        List<String> strings = Collections.synchronizedList(new ArrayList<>());
        for (int i = 1; i <=3; i++) {
            new Thread(()->{
                strings.add(UUID.randomUUID().toString().substring(0,8));

            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println(strings);
    }
}
