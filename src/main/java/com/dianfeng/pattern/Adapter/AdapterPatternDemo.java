package com.dianfeng.pattern.Adapter;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 16:28
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer=new AudioPlayer();
        mediaPlayer.play("mp3","1.mp3");
        mediaPlayer.play("mp4","2.mp4");
        mediaPlayer.play("vlc","3.vlc");
        mediaPlayer.play("avi","4.avi");
    }
}
