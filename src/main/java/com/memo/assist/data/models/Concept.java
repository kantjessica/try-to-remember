package com.memo.assist.data.models;

import java.util.UUID;

/**
 * Created by dhuiying on 14.07.16.
 */
public class Concept {

    private UUID id;
    //TODO now the content is simplified as a string. this field should be extended
    private String content;
    private Difficulty difficulty;

    public Concept(String content, Difficulty difficulty){
        id = UUID.randomUUID();
        this.content = content;
        this.difficulty = difficulty;
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

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
