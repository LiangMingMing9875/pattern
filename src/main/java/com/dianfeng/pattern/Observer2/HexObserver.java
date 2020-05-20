package com.dianfeng.pattern.Observer2;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:18
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject=subject;
        //绑定依赖对象
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hex:"+Integer.toHexString(subject.getState()));
    }
}
