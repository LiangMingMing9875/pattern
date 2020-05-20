package com.dianfeng.pattern.Template;

/**
 * @Author liangmingming
 * @Date 2020/4/1 11:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Game game=new Basketball();
        game.play();
        System.out.println("-------------------");
        game=new Football();
        game.play();
    }
}
