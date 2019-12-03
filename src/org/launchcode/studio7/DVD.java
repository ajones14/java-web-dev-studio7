package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD (String title, boolean canWrite, ArrayList<String> data) {
        super(title, canWrite, data);
        this.storageCapacity = 6000;
}

    @Override
    public String spinDisc() {
        return "A DVD spins at 1600 rpm.";
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
