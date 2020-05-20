package com.dianfeng.pattern.AbstractFactory;

import java.util.Objects;

/**
 * 工程生成器，传递工厂类型获取工程
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:41
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(Objects.isNull(type)){
            return null;
        }
        if("shape".equalsIgnoreCase(type)){
            return new ShapeFactory();
        }else if("color".equalsIgnoreCase(type)){
            return new ColorFactory();
        }
        return null;
    }
}
