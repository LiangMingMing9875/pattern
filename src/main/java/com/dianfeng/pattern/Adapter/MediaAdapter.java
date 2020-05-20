package com.dianfeng.pattern.Adapter;

/**
 * 媒体播放器适配器
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 16:18
 */
public class MediaAdapter implements MediaPlayer {
    //高级媒体播放器
    AdvancedMediaPlayer advancedMediaPlayer;
    //创建适配器时
    MediaAdapter(String audioType){
        //创建高级媒体播放器
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer=new VlcPlayer();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
