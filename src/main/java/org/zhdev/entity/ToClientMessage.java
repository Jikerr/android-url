package org.zhdev.entity;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:09 2017/10/27
 * @Modified By :
 */
public class ToClientMessage {
    private String title;
    private String content;
    private String extraInfo;

    public ToClientMessage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public ToClientMessage(String title, String content, String extraInfo) {
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }
}