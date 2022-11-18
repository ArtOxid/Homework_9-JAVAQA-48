package ru.netology;

public class Radio {

    private int currentStation = 0;
    private int stationsCount;

    private int currentVolume = 0;

    public Radio() {
        this.stationsCount = 10;
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStationsCount(int stationsCount) {
        this.stationsCount = stationsCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation =0;
            return;
        }
        if (newCurrentStation > stationsCount -1) {
            setToEndStation();
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToEndStation() {
        currentStation = stationsCount - 1;
    }

    public int nextStation() {
        currentStation = currentStation + 1;
        if (currentStation >= stationsCount) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int previousStation() {
        currentStation = currentStation - 1;
        if (currentStation <= 0) {
            currentStation = stationsCount -1;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public int volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
