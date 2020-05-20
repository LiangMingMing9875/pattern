package com.dianfeng.pattern.Template;

/**
 * @Author liangmingming
 * @Date 2020/4/1 11:42
 * @Version 1.0
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("加入足球队");
    }

    @Override
    void startPlay() {
        System.out.println("开始足球比赛");
    }

    @Override
    void endPlay() {
        System.out.println("结束足球比赛");
    }
}
