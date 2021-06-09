package ru.netology.domain;

public class RadioAdvanced {
    private String name;
    private int maxNumberStation = 9;
    private int minNumberStation;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume;
    private int currentVolume;
    private boolean on;

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
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int increaseStation() {
        if (currentStation <= maxNumberStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation <= maxNumberStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation < minNumberStation) {
            currentStation = 9;
        }
        return currentStation;
    }


    public boolean isOn() {
        return on;
    }
}

