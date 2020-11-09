package ru.tester.springsource;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private int year;
    private String name;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void printAllStr(){
        musicList.forEach((v) -> System.out.println("Playing: " + v.getSong()));
    }

    public void playMusic() {
        System.out.printf("playing: %s. ", music.getSong());
        System.out.println();
    }
}
