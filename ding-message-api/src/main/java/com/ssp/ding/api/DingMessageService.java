package com.ssp.ding.api;

import com.ssp.ding.message.ActionCardMessage;
import com.ssp.ding.message.LinkMessage;
import com.ssp.ding.message.OAMessage;

import java.time.Duration;

/**
 * 消息发送服务根据类型
 * 接口文档:https://ding-doc.dingtalk.com/doc#/serverapi2/ye8tup
 *
 * @author: sunshaoping
 * @date: Create by in 6:41 下午 2020/6/15
 */
public interface DingMessageService {

    /**
     * 文本消息
     *
     * @param content 消息内容，建议500字符以内
     */
    void sendTextMessage(String content);

    /**
     * 图片消息
     *
     * @param mediaId 媒体文件id。可以通过媒体文件接口上传图片获取。建议宽600像素 x 400像素，宽高比3 : 2
     * @see DingMediaService 上传媒体文件
     */
    void sendImageMessage(String mediaId);

    /**
     * 语音消息
     *
     * @param mediaId  媒体文件id。2MB，播放长度不超过60s，AMR格式。
     *                 <p>
     *                 可以通过媒体文件接口上传图片获取。
     * @param duration 正整数，小于60，表示音频时长
     * @see DingMediaService 上传媒体文件
     */
    void sendVoiceMessage(String mediaId, Duration duration);

    /**
     * 文件消息
     *
     * @param mediaId 媒体文件id。引用的媒体文件最大10MB。可以通过媒体文件接口上传图片获取。
     * @see DingMediaService 上传媒体文件
     */
    void sendFileMessage(String mediaId);

    /**
     * 链接消息
     */
    void sendLinkMessage(LinkMessage linkMessage);

    /**
     * OA消息
     */
    void sendOAMessage(OAMessage message);

    /**
     * markdown消息
     *
     * @param title 首屏会话透出的展示内容
     * @param text  markdown格式的消息，建议500字符以内
     */
    void sendMarkdownMessage(String title, String text);

    /**
     * 卡片消息
     */
    void sendActionCardMessage(ActionCardMessage message);


}
