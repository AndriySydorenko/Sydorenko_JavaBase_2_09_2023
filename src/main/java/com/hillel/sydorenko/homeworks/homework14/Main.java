package com.hillel.sydorenko.homeworks.homework14;

public class Main {
    public static void main(String[] args) {

MusicStyles[] bands = {
        new ClassicMusic(),
        new RockMusic(),
        new PopMusic(),
};
        for (MusicStyles band : bands) {
            band.playMusic();
        }

//        pop.playMusic();
//        classic.playMusic();
//        rock.playMusic();
    }
}
