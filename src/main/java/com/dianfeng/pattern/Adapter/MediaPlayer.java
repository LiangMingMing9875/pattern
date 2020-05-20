package com.dianfeng.pattern.Adapter;

/**
 * 媒体播放器
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 16:12
 */
public interface MediaPlayer {
    public void play(String audioType,String fileName);
}
