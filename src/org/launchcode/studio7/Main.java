package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> songs = new ArrayList<>();
        songs.add("song1");
        songs.add("songs2");
        CD cd = new CD("Music", true, songs);

        ArrayList<String> chapters = new ArrayList<>();
        chapters.add("chapter1");
        chapters.add("chapter2");
        DVD dvd = new DVD("Movie", false, chapters);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(dvd.spinDisc());
        System.out.println(dvd.play());
        System.out.println(dvd.contents());

        System.out.println(cd.spinDisc());
        System.out.println(cd.play());
        System.out.println(cd.contents());

    }
}
