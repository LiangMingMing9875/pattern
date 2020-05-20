package com.dianfeng.pattern.Template;

/**
 * 创建一个抽象类，它的模板方法被设置为final
 * @Author liangmingming
 * @Date 2020/4/1 11:37
 * @Version 1.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
