package ru.netology.domain;

import com.sun.source.tree.BreakTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RadioAdvanced {
    private String name;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public RadioAdvanced(int maxNumberStation, int minNumberStation, int currentStation, int maxVolume, int minVolume, int currentVolume) {
        this.maxNumberStation = maxNumberStation;
        this.minNumberStation = minNumberStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public RadioAdvanced(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public RadioAdvanced() {
    }


    public String getName() {
        return name;
    }

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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumberStation) {
            return;
        }
        if (currentStation < minNumberStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int increaseStation() {
        if (currentStation < maxNumberStation | currentStation == minNumberStation) {
            currentStation = currentStation + 1;
        }
        else  {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation > minNumberStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxNumberStation;
        }
        return currentStation;
    }


    public boolean isOn() {
        return on;
    }
}

