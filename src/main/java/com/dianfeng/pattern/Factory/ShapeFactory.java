package com.dianfeng.pattern.Factory;

import java.util.Objects;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * 创建一个工厂，生成基于给定信息的实体类的对象
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:11
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(Objects.isNull(shapeType)){
            return null;
        }
        if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
