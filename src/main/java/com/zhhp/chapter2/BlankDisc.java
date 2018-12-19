package com.zhhp.chapter2;

import java.util.List;

public class BlankDisc implements CompactDisc {


    private String title;
    private String artist;

    private List<String>  tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println(this.tracks);
    }
}
