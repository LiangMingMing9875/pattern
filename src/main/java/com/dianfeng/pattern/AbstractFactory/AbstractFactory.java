package com.dianfeng.pattern.AbstractFactory;

/**多个具体工厂抽象成一个工厂，从抽象工厂中获取shape类型的对象和color类型的对象
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 15:23
 */
public abstract class AbstractFactory implements Factory{
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
