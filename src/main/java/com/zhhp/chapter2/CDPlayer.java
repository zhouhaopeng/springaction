package com.zhhp.chapter2;

public class CDPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play(){
        compactDisc.play();
    }
}
