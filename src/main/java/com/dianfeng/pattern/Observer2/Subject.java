package com.dianfeng.pattern.Observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:01
 */
public class Subject {
    //依赖的观察者们，需要发广播通知
    List<Observer> observers=new ArrayList();
    //目标对象属性
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //目标对象的值更改后，通知所有观察者
        notifyAllObservers();
    }
    //绑定观察者对象
    public void attach(Observer observer){
        observers.add(observer);
    }
    //广播通知所有的观察者
    public void notifyAllObservers(){
        for(Observer observer:observers){
            //广播通知所有的观察者更新数据
            observer.update();
        }
    }
}
