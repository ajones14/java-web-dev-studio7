package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    double storageCapacity;
    String title;
    boolean canWrite;
    ArrayList<String> data;

    public BaseDisc(String title, boolean canWrite, ArrayList<String> data) {
        this.title = title;
        this.canWrite = canWrite;
        this.data = data;
    }

    public boolean addData(String info) {
        if (this.canWrite) {
            this.data.add(info);
            return this.canWrite;
        }
        return false;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public ArrayList<String> getData() {
        return data;
    }

}
