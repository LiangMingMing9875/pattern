package com.dianfeng.pattern.Observer2;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/21 11:15
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject=subject;
        //绑定依赖对象
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("octal:"+Integer.toOctalString(subject.getState()));
    }
}
