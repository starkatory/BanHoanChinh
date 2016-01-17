package com.package_for_video;

import java.io.Serializable;

/**
 * Created by Administrator on 15/01/2016.
 */
public class Video_Entity implements Serializable {
    private  int id;
    private String video;
    private String author;
    private String time;
    private int image;
    private String url;
    public  Video_Entity()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public Video_Entity(int id, String video, String author, String time, int image, String url) {
        this.id = id;
        this.video = video;
        this.author = author;
        this.time = time;
        this.image = image;
        this.url = url;
    }

    public Video_Entity(int id, String video, String author, int image ) {
        this.id = id;
        this.video = video;
        this.image = image;
        this.author = author;
    }
}
