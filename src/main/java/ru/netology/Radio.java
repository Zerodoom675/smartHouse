package ru.netology;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int maxRadioStation;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation - 1;
    }

    public Radio() {
        maxRadioStation = 9; //количество станций по умолчанию от 0 до 9
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStation;

    }

    public void next() {
        if (currentRadioStationNumber < maxRadioStation) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
            return;
        }
        if (currentRadioStationNumber == maxRadioStation) {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
            return;
        }
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }



    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
