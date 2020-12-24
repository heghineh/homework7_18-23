package com.company.problem21;

import java.util.Random;

public class TV {
    //region Properties
    private int channel;
    private int volumeLevel;
    private boolean on;
    //endregion

    //region Constructors
    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }
    //endregion

    //region Public Methods
    public boolean turnOnOrOffTheTv(boolean on) {
        return on;
    }

    public int increaseVolume(int volumeLevel) {
        return ++volumeLevel;
    }

    public int decreaseVolume(int volumeLevel) {
        return --volumeLevel;
    }

    public int changeChannel(int channelNumber) {
        Random random = new Random();
        return random.nextInt(10);
    }
    //endregion

    //region Getters and Setters
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    //endregion
}