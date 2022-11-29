package ru.netology.radio;

public class Radio {

    protected int currentVolume;
    protected int numberRadioStation;
    protected int maxAmountStation;


    public Radio() {
        maxAmountStation = 9;
    }

    public Radio(int amountStation) {
        maxAmountStation = amountStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void setNumberRadioStation(int newNumberRadioStation) {

        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > maxAmountStation) {
            return;
        }
        numberRadioStation = newNumberRadioStation;
    }


    public void nextRS() {

        if (numberRadioStation < maxAmountStation) {
            numberRadioStation++;
        } else {
            numberRadioStation = 0;
        }
    }

    public void prevRS() {

        if (numberRadioStation > 0) {
            numberRadioStation--;
        } else {
            numberRadioStation = maxAmountStation;
        }
    }
}
