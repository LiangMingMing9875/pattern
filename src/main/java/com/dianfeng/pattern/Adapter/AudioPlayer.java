package com.dianfeng.pattern.Adapter;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：liangmingming
 * @since：2020/4/20 16:24
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("普通播放器就可以播");
        }else if("vlc".equalsIgnoreCase(audioType)||"mp4".equalsIgnoreCase(audioType)){
            //需要高级媒体播放器
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println(audioType+"不被支出");
        }
    }
}
