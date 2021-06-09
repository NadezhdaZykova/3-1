package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();
    @Test
    public void changeStation() {
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void changeVolume() {
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        radio.setCurrentVolume(11);
        int expected = 1;
        assertEquals(expected, radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(5);
        int expected = 6;
        assertEquals(expected, radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseVolumeLessMin() {
        radio.setCurrentVolume(-1);

        int expected = 1;
        assertEquals(expected, radio.increaseVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(10);

        int expected = 9;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMax() {
        radio.setCurrentVolume(11);

        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        radio.setCurrentVolume(-5);

        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(9);
        radio.setMinNumberStation(0);
        radio.setMaxNumberStation(9);

        int expected = 0;
        assertEquals(expected, radio.increaseStation());
    }

    @Test
    public void shouldIncreaseStationMoreMax() {
        radio.setCurrentStation(11);

        int expected = 1;
        assertEquals(expected, radio.increaseStation());
    }

    @Test
    public void shouldDecreaseStationLessMin() {
        radio.setCurrentStation(-10);

        int expected = 9;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldInitField() {
        assertNull(radio.getName());
        assertEquals(9, radio.getMaxNumberStation());
        assertEquals(0, radio.getMinNumberStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertFalse(radio.isOn());
    }
}
