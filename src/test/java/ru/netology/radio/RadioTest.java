
package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // тесты на радиостанцию
    @Test
    public void currentStationNextMax1() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(9);
        radio.nextRS();
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationNextMax5() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(10);

        radio.nextRS();

        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationNextMax() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(8);

        radio.nextRS();

        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void currentStationPrevMin() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(0);

        radio.prevRS();

        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationPrevMin1() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(1);

        radio.prevRS();

        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationPrevLessToMin() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(-1);

        radio.prevRS();

        int expected = 8;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationNext() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(5);

        radio.nextRS();

        int expected = 6;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationPrev() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(5);

        radio.prevRS();

        int expected = 4;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

// тесты для звука

    @Test
    public void currentVolumeIncrease() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeDecrease() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseMax() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseMax1() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeIncreaseMax2() {
        Radio radio = new Radio();
        radio.currentVolume = 11;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeDecreaseMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeDecreaseMin1() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeDecreaseMin2() {
        Radio radio = new Radio();
        radio.currentVolume = -1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}