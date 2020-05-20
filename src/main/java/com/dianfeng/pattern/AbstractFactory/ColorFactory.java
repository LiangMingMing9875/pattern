package com.dianfeng.pattern.AbstractFactory;

import java.util.Objects;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:36
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(Objects.isNull(color)){
            return null;
        }else if("red".equalsIgnoreCase(color)){
            return new Red();
        }else if("green".equalsIgnoreCase(color)){
            return new Green();
        }
        return null;
    }
}
