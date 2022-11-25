package ru.netology.radio;

public class Radio {

    protected int currentVolume;
    protected int numberRadioStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }else{
            currentVolume = 0;
        }
    }

    public void setNumberRadioStation(int newNumberRadioStation) {

        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > 9) {
            return;
        }
        numberRadioStation = newNumberRadioStation;
    }


    public void nextRS() {

        if (numberRadioStation < 9) {
            numberRadioStation++;
        } else {
            numberRadioStation = 0;
        }
    }

    public void prevRS() {

        if (numberRadioStation > 0) {
            numberRadioStation--;
        } else {
            numberRadioStation = 9;
        }
    }
}
