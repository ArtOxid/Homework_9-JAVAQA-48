package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToEndStation() {
        Radio radio = new Radio();
        radio.setToEndStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 2;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 8;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 9;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 8;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 1;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeAverege() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }
}