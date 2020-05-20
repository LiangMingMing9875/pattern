package com.dianfeng.pattern.test;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/18 10:50
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        //unsafeArrayList();
        //unsafeSet();
        unsafeMap();
    }

    private static void unsafeMap() throws InterruptedException {
        Map<String, Object> map = new HashMap<>();
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                map.put(UUID.randomUUID().toString().substring(0,8),new Object());
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(JSONObject.toJSON(map));
    }

    private static void unsafeSet() throws InterruptedException {
        Set<String> set = new HashSet<>();
        for (int i = 1; i <=3 ; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(set);
    }

    private static void unsafeArrayList() throws InterruptedException {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            new Thread(()->{
                strings.add(UUID.randomUUID().toString().substring(0,8));
            },String.valueOf(i)).start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println(strings);
    }
}
