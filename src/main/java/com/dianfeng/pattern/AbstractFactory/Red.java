package com.dianfeng.pattern.AbstractFactory;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:19
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}
