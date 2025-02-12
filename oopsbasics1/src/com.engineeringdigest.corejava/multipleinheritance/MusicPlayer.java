package com.engineeringdigest.corejava.multipleinheritance;

public interface MusicPlayer {
    public default void playMusic(){
        System.out.println("Playing...");
    }
}
