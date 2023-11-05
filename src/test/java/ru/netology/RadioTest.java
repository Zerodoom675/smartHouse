package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStationNumber() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumber2() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumber3() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchTheRadioStationNumberToTheNextOne() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(8);

        RadioStation.next();

        int expected = 9;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchTheRadioStationNumberToTheNextOneAboveTheMax() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(9);

        RadioStation.next();

        int expected = 0;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchTheRadioStationNumberToThePreviousOneBelowTheMin() {
        Radio RadioStation = new Radio();

        RadioStation.prev();

        int expected = 9;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchTheRadioStationNumberToThePreviousOne() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(5);

        RadioStation.prev();

        int expected = 4;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {
        Radio RadioStation = new Radio();

        RadioStation.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = RadioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundAboveMax() {
        Radio Volume = new Radio();

        Volume.setCurrentVolume(100);

        Volume.increaseVolume();

        int expected = 100;
        int actual = Volume.getCurrentVolume();
    }

    @Test
    public void increaseSound() {
        Radio Volume = new Radio();

        Volume.increaseVolume();

        int expected = 1;
        int actual = Volume.getCurrentVolume();
    }

    @Test
    public void reduceSoundBelowMin() {
        Radio Volume = new Radio();

        Volume.reduceVolume();

        int expected = 0;
        int actual = Volume.getCurrentVolume();
    }

    @Test
    public void reduceVolume() {
        Radio Volume = new Radio();

        Volume.setCurrentVolume(100);

        Volume.reduceVolume();

        int expected = 99;
        int actual = Volume.getCurrentVolume();
    }

    @Test
    public void soundBelowMin() {
        Radio Volume = new Radio();

        Volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = Volume.getCurrentVolume();
    }

    @Test
    public void soundAboveMax() {
        Radio Volume = new Radio();

        Volume.setCurrentVolume(101);

        int expected = 0;
        int actual = Volume.getCurrentVolume();
    }
}
