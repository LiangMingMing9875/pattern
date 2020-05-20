package com.dianfeng.pattern.AbstractFactory;

import java.util.Objects;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:27
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if(Objects.isNull(shape)){
            return null;
        }else if("circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("square".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }

}
