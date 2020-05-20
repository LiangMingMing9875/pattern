package com.dianfeng.pattern.test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/18 13:59
 */
public class TreeMapTest {
    public static void m1() {
        TreeMap<Integer,Integer> map1=new TreeMap<Integer, Integer>();//默认treeMap升序排序

        TreeMap<Integer, Integer> map2=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        map2.put(1,2);
        map2.put(2,4);
        map2.put(7, 1);
        map2.put(5,2);
        System.out.println("Map2="+map2);

        map1.put(1,2);
        map1.put(7,4);
        map1.put(2, 1);
        map1.put(5,2);
        System.out.println("map1="+map1);
    }

    public static void m2() {
        TreeMap<String,String> map1=new TreeMap<>();
        TreeMap<String,String> map2=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        map2.put("c", "1");
        map2.put("a", "1");
        map2.put("bb", "1");
        map2.put("b", "1");
        System.out.println(("Map2=" + map2));

        map1.put("c", "1");
        map1.put("a", "1");
        map1.put("bb", "1");
        map1.put("b", "1");
        System.out.println("map1="+map1);
    }

    public static void sortByValue() {
        Map<String,String> map = new TreeMap<String,String>();
        map.put("a", "dddd");
        map.put("d", "aaaa");
        map.put("b", "cccc");
        map.put("c", "bbbb");
        List<Map.Entry<String,String>> list=new ArrayList<Map.Entry<String,String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,String> e:list){
            System.out.println(e.getKey()+"---"+e.getValue());
        }
        System.out.println("----------------");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
//        List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(map.entrySet());
//
//        Collections.sort(list,new Comparator<Map.Entry<String,String>>() {
//            //升序排序
//            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        for (Entry<String, String> e: list) {
//            System.out.println(e.getKey()+":"+e.getValue());
//        }
    }

    public static void print(Map<String,String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        sortByValue();
    }
}
