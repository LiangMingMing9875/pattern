package com.dianfeng.pattern.test;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/10 9:42
 */
public class A {
    public static void main(String[] args) {
        List<JSONObject> list=new ArrayList<>();
        JSONObject jsonObject1=new JSONObject();
        JSONObject jsonObject2=new JSONObject();
        JSONObject jsonObject3=new JSONObject();
        JSONObject jsonObject4=new JSONObject();
        JSONObject jsonObject5=new JSONObject();
        JSONObject jsonObject6=new JSONObject();
        JSONObject jsonObject7=new JSONObject();
        JSONObject jsonObject8=new JSONObject();
        JSONObject jsonObject9=new JSONObject();
        JSONObject jsonObject10=new JSONObject();
        JSONObject jsonObject11=new JSONObject();
        JSONObject jsonObject12=new JSONObject();
        JSONObject jsonObject13=new JSONObject();
        JSONObject jsonObject14=new JSONObject();
        JSONObject jsonObject15=new JSONObject();
        jsonObject1.put("liveCourseId",1);
        jsonObject2.put("liveCourseId",2);
        jsonObject3.put("liveCourseId",3);
        jsonObject4.put("liveCourseId",4);
        jsonObject5.put("liveCourseId",5);
        jsonObject6.put("liveCourseId",6);
        jsonObject7.put("liveCourseId",7);
        jsonObject8.put("liveCourseId",8);
        jsonObject9.put("liveCourseId",9);
        jsonObject10.put("liveCourseId",10);
        jsonObject11.put("liveCourseId",11);
        jsonObject12.put("liveCourseId",12);
        jsonObject13.put("liveCourseId",13);
        jsonObject14.put("liveCourseId",14);
        jsonObject15.put("liveCourseId",15);
        list.add(jsonObject1);
        list.add(jsonObject2);
        list.add(jsonObject3);
        list.add(jsonObject4);
        list.add(jsonObject5);
        list.add(jsonObject6);
        list.add(jsonObject7);
        list.add(jsonObject8);
        list.add(jsonObject9);
        list.add(jsonObject10);
        list.add(jsonObject11);
        list.add(jsonObject12);
        list.add(jsonObject13);
        list.add(jsonObject14);
        list.add(jsonObject15);
        List<JSONObject> smallList=new ArrayList<>();
        JSONObject map1=new JSONObject();
        JSONObject map4=new JSONObject();
        JSONObject map7=new JSONObject();
        JSONObject map2=new JSONObject();
        JSONObject map5=new JSONObject();
        JSONObject map8=new JSONObject();
        map1.put("liveCourseId",1);
        map4.put("liveCourseId",4);
        map7.put("liveCourseId",7);
        map2.put("liveCourseId",2);
        map5.put("liveCourseId",5);
        map8.put("liveCourseId",8);
        map1.put("chatNo",1);
        map4.put("chatNo",4);
        map7.put("chatNo",7);
        map2.put("chatNo",2);
        map5.put("chatNo",5);
        map8.put("chatNo",8);
        smallList.add(map1);
        smallList.add(map4);
        smallList.add(map7);
        smallList.add(map2);
        smallList.add(map5);
        smallList.add(map8);
        smallList.forEach(obj-> obj.getString("liveCourseId"));
        for (JSONObject jsonObject:list) {
            jsonObject.put("chatNo",0);
            String liveCourseId = jsonObject.getString("liveCourseId");
            List<JSONObject> result=new ArrayList<>();
//            smallList.forEach(new Consumer<JSONObject>(){
//
//                @Override
//                public void accept(JSONObject obj) {
//                    if(liveCourseId.equals(obj.getString("liveCourseId"))){
//                        result.add(obj);
//                    }
//                }
//            });
            smallList.forEach(obj->{
                if(liveCourseId.equals(obj.getString("liveCourseId"))){
                    result.add(obj);
                }
            });
            if(!CollectionUtils.isEmpty(smallList)){
                for (JSONObject map:result) {
                    if(liveCourseId.equals(map.getString("liveCourseId"))){
                        jsonObject.put("chatNo",map.getString("chatNo"));
                    }
                }
            }
        }
        System.out.println(list);
    }
}
