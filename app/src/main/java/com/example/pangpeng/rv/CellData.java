package com.example.pangpeng.rv;

/**
 * Created by pangpeng on 2016/4/17.
 */
public class CellData {

    String title = "title";
    String content = "content";

    public CellData(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
