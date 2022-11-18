package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void defaultStationCount() {
        int expected = 10;
        int actual = new Radio().getStationsCount();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationCountRegular() {
        radio.setStationsCount(5);
        int expected = 5;
        int actual = radio.getStationsCount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToEndStation() {
        radio.setToEndStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchStationAboveMax() {
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        radio.setCurrentStation(7);
        int expected = 8;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationOverMax() {
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationBelowMin() {
        radio.setCurrentStation(-9);
        int expected = 9;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        radio.setCurrentStation(9);
        int expected = 8;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationAboveMax() {
        radio.setCurrentStation(12);
        int expected = 8;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMax() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        radio.setToMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolume() {
        radio.setCurrentVolume(7);
        int expected = 8;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolumeAboveMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpVolumeBelowMax() {
        radio.setCurrentVolume(-1);
        int expected = 1;
        int actual = radio.volumeUp();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeBelowMax() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeAboveMax() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolumeAverege() {
        radio.setCurrentVolume(9);
        int expected = 8;
        int actual = radio.volumeDown();
        Assertions.assertEquals(expected, actual);
    }
}
