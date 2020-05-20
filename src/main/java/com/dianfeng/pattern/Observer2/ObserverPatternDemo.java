package com.dianfeng.pattern.Observer2;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:22
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        //创建目标对象
        Subject subject=new Subject();
        //创建观察者，关联依赖对象
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        //更改依赖对象的值
        subject.setState(10);
        subject.setState(15);
    }
}
