package com.package_for_music;

import java.io.Serializable;

/**
 * Created by NamAnh on 1/8/2016.
 */
public class Music_Entity implements Serializable {
    private int id;
    private String song;
    private String singer;
    private String author;
    private String time;
    private int image;
    private String url;

    public Music_Entity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
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

    public Music_Entity(int id, String song, String singer, int image) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.image = image;
    }

    public Music_Entity(int id, String song, String singer, String author, String time, int image, String url) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.author = author;
        this.time = time;
        this.image = image;
        this.url = url;
    }
}
