package com.memo.assist.data.models;

import java.util.UUID;

/**
 * Created by dhuiying on 14.07.16.
 */
public class Concept {

    private UUID id;
    //TODO now the content is simplified as a string. this field should be redesigned
    private String content;

    public Concept(String content){
        id = UUID.randomUUID();
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
