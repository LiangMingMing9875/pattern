package com.dianfeng.pattern.Observer2;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:01
 */
public abstract class Observer {
    //观察者依赖的目标对象
    protected Subject subject;
    //接收广播通知时，需要修改的方法
    public abstract void update();
}
