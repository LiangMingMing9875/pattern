package com.dianfeng.pattern.Observer;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 10:30
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
