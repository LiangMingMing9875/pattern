package com.dianfeng.pattern.Observer2;

/**
 *
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:12
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject=subject;
        //绑定依赖
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary:"+Integer.toBinaryString(subject.getState()));
    }
}
