package ru.netology.domain;

public class RadioAdvanced {
    private int maxNumberStation;
    private int minNumberStation;
    private int numberCurrentStation;
    private int maxSoundVolume;
    private int minSoundVolume;
    private int CurrentSoundVolume;
    private boolean on;


    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        if (numberCurrentStation > minNumberStation) {
        }
        this.numberCurrentStation = numberCurrentStation;
        if (numberCurrentStation < maxNumberStation) {
        }
        this.numberCurrentStation = numberCurrentStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return CurrentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        CurrentSoundVolume = currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
