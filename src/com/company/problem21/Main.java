package com.company.problem21;

// Design a class TV
// TV
// channel: int
// volumeLevel: int
// on: boolean
// methods
// turnOnOrOffTheTv()
// increaseVolume();
// decreaseVolume();
// changeChannel(int channelNumber);

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(4, 9, true);

        if (tv.isOn()) {
            System.out.println("CHANNEL: " + tv.getChannel() +
                    " | VOLUME LEVEL: " + tv.getVolumeLevel() +
                    " | ONN_OFF: " + tv.isOn());
        } else {
            System.out.println("TV is off.");
        }

        boolean tvON = tv.turnOnOrOffTheTv(tv.isOn());
        boolean tvOFF = tv.turnOnOrOffTheTv(!tv.isOn());
        int channelChange = tv.changeChannel(tv.getChannel());
        int volumeUp = tv.increaseVolume(tv.getVolumeLevel());
        int volumeDown = tv.decreaseVolume(tv.getVolumeLevel());

        tv.setChannel(channelChange);
        tv.setVolumeLevel(volumeDown);
        tv.setOn(tvON);

        if (tv.isOn()) {
            System.out.println("CHANNEL: " + tv.getChannel() +
                    " | VOLUME LEVEL: " + tv.getVolumeLevel() +
                    " | ONN_OFF: " + tv.isOn());
        } else {
            System.out.println("TV is off.");
        }
    }
}