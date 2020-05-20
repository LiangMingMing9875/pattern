package com.dianfeng.pattern.test;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/13 15:37
 */
public class Java8Properties {
    public static void m0() {
        List<Integer> integers = Arrays.asList(1,2, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> collect = integers.stream().map(i -> i * 2).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void m1(){
        User u1=new User(50);
        User u2=new User(80);
        User u3=new User(70);
        User u4=new User(60);
        User u5=new User(90);
        List<User> users = Arrays.asList(u1, u2, u3, u4, u5);
        List<Integer> integers = users.stream().map(User::getScore).filter(score->score>=60).distinct().sorted().collect(Collectors.toList());
        System.out.println(integers);

    }
    public static void m2(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        List<String> collect = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();
    }
    public static void m3(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
        //long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        long count = strings.parallelStream().filter(s -> s.isEmpty()).count();
        System.out.println(count);
    }
    public static void m4(){
//        Collectors
        //Collectors类实现了很多归并操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串。
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> collect = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);
        String s2 = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println(s2);
    }
    public static void m5(){
//        sorted
//        sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：

        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);
        random.longs().limit(10).sorted().forEach(System.out::println);
    }

    public static void m6() {
        List<Integer> integers = Arrays.asList(1,2, 2, 3, 4, 5, 6, 7, 8);
        List<String> collect = integers.stream().map(i -> String.valueOf(i)).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void m7(){
        User u1=new User(50);
        User u2=new User(80);
        User u3=new User(70);
        User u4=new User(60);
        User u5=new User(90);
        List<User> users = Arrays.asList(u1, u2, u3, u4, u5);
        List<User> collect = users.stream().peek(u -> u.setStrScore(String.valueOf(u.getScore()))).collect(Collectors.toList());
        System.out.println(collect);

    }

    public static void main(String[] args) {
        m7();
    }
}

@Data
@ToString
class  User{
    Integer score;
    String strScore;

    public User() {
    }

    public User(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
