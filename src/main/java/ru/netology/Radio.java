package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsAmount;

    public Radio() {
        this.stationsAmount = 10;
    }

    public Radio(int stationsAmount) {
        setStationsAmount(stationsAmount);
    }

    private int getLastStation() {
        return stationsAmount - 1;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public void setStationsAmount(int stationsAmount) {
        if (stationsAmount > 0) {
            this.stationsAmount = stationsAmount;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > getLastStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setToEndStation() {
        currentStation = getLastStation();
    }

    public int nextStation() {
        if (currentStation < getLastStation()) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= getLastStation()) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int previousStation() {

        currentStation = currentStation - 1;
        if (currentStation <= 0) {
            setToEndStation();
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
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public int volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int volumeDown() {

        currentVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}