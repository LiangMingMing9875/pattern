package com.dianfeng.pattern.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/9 18:14
 */
public class ExecutorServiceTest {
    private ExecutorService executorService= Executors.newFixedThreadPool(5, new ThreadFactory() {
        private int i=0;
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName("【查询直播间聊天记录-】"+i);
            t.setDaemon(true);
            t.setPriority(Thread.NORM_PRIORITY);
            return t;
        }
    });

    public void test(){
        List<Map> list=new ArrayList<Map>();

        for(int i=0;i<2;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        List<Map> list2=new ArrayList<Map>();
                        HashMap map1 = new HashMap();
                        map1.put("chatNo",9);
                        HashMap map2 = new HashMap();
                        map2.put("chatNo",1);
                        list2.add(map1);
                        list2.add(map2);
                        list.addAll(list2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                    }
                }
            });
        }
    }
    public static void main(String[] args) {

    }
}
