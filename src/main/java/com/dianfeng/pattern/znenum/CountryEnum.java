package com.dianfeng.pattern.znenum;

import lombok.Getter;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/14 9:55
 */
public enum CountryEnum {
    ONE(1,"齐国"),TWO(2,"楚国"),THREE(3,"燕国"),FOUR(4,"韩国"),FIVE(5,"赵国"),SIX(6,"魏国");
    @Getter private Integer code;
    @Getter private String msg;

    CountryEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static CountryEnum getCountryEnum(int index){
        CountryEnum[] values = CountryEnum.values();
        for (CountryEnum element : values) {
            if(index==element.getCode()){
                return element;
            }
        }
        return null;
    }
}
