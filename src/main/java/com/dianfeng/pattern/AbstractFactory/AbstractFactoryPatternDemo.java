package com.dianfeng.pattern.AbstractFactory;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:54
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取模型工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        //获取颜料工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Shape circle = shapeFactory.getShape("circle");
        Color red = colorFactory.getColor("red");
        circle.draw();
        red.fill();
        System.out.println("----");
        Shape square = shapeFactory.getShape("square");
        Color green = colorFactory.getColor("green");
        square.draw();
        green.fill();
    }
}
