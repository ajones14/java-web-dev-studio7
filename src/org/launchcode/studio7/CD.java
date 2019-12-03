package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    public CD (String title, boolean canWrite, ArrayList<String> data) {
        super(title, canWrite, data);
        this.storageCapacity = 3000;
    }

    @Override
    public String spinDisc() {
        return "A CD spins at 800 rpm.";
    }

    @Override
    public String play() {
        return this.title + " is now playing.";
    }

    @Override
    public String contents() {
        String content = "";
        for (String info : data) {
            content += info + "\n";
        }
        return this.title + ": \n" + content;
    }

}
