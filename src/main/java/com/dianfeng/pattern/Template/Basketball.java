package com.dianfeng.pattern.Template;

/**
 * @Author liangmingming
 * @Date 2020/4/1 11:41
 * @Version 1.0
 */
public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("加入篮球队");
    }

    @Override
    void startPlay() {
        System.out.println("开始篮球比赛");
    }

    @Override
    void endPlay() {
        System.out.println("结束篮球比赛");
    }
}
