package ru.netology;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void setCurrentRadioStationNumber(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9 ) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStation;

    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        }
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
