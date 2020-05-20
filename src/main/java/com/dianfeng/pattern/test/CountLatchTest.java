package com.dianfeng.pattern.test;

import com.dianfeng.pattern.znenum.CountryEnum;

import java.util.concurrent.CountDownLatch;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/5/14 10:01
 */
public class CountLatchTest {

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 1; i <=6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"灭亡");
                countDownLatch.countDown();
            },CountryEnum.getCountryEnum(i).getMsg()).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"秦国一统华夏");
    }
}
