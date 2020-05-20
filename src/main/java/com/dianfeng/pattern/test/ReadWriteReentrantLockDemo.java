package com.dianfeng.pattern.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/15 19:24
 */
class ShareResource2{
    volatile Map<String,Object> map=new HashMap<>();

    public void get(){

        try{

        }catch (Throwable e){
            e.printStackTrace();
        } finally {

        }
    }
}
public class ReadWriteReentrantLockDemo {
    public static void main(String[] args) {

    }
}
