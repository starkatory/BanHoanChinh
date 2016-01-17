package com.package_for_story;

import java.io.Serializable;

/**
 * Created by Administrator on 14/01/2016.
 */
public class Story_Entity implements Serializable{
    private  int id;
    private String story;
    private String author;
    private String reader;
    private String time;
    private int image;
    private String url;
    public Story_Entity()
    {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Story_Entity(int id, String story, String author, String reader, String time, int image, String url) {
        this.id = id;
        this.story = story;
        this.author = author;
        this.reader = reader;
        this.time = time;
        this.image = image;
        this.url = url;
    }

    public Story_Entity(int id, String story, String reader, int image) {
        this.id = id;
        this.story = story;
        this.reader = reader;
        this.image = image;
    }


}

