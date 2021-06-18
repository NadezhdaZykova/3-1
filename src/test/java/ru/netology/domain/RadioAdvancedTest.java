package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();

    @Test
    public void changeStation() {
        RadioAdvanced radio = new RadioAdvanced(100,0,0,100,0,0);
        radio.setMaxNumberStation(100);
        radio.setMinNumberStation(0);
        radio.setCurrentStation(93);
        assertEquals(93, radio.getCurrentStation());
    }

    @Test
    public void changeVolume() {
        radio.setMaxVolume(100);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
        assertEquals(expected, radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseVolumeLessMax() {
        radio.setCurrentVolume(99);
        int expected = 100;
        assertEquals(expected, radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseWhenVolumeMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
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
        radio.setCurrentVolume(100);
        int expected = 99;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMax() {
        radio.setCurrentVolume(115);
        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseWhenVolumeLowMax() {
        radio.setCurrentVolume(99);
        int expected = 98;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseWhenVolumeMin() {
        radio.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMin() {
        radio.setCurrentVolume(1);
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
    public void shouldIncreaseStationMIN() {
        RadioAdvanced radio = new RadioAdvanced(100);
        radio.setCurrentStation(0);
        int expected = 1;
        assertEquals(expected, radio.increaseStation());
    }

    @Test
    public void shouldIncreaseWhenStationLessMax() {
        RadioAdvanced radio = new RadioAdvanced(100);
        radio.setCurrentStation(98);
        int expected = 99;
        assertEquals(expected, radio.increaseStation());
    }


    @Test
    public void shouldIncreaseStationWhenMax() {
        RadioAdvanced radio = new RadioAdvanced(100);
        radio.setCurrentStation(100);
        int expected = 0;
        assertEquals(expected, radio.increaseStation());
    }



    @Test
    public void shouldDecreaseStation() {
        RadioAdvanced radio = new RadioAdvanced(100);
        radio.setCurrentStation(100);
        int expected = 99;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldDecreaseStationMoreMin() {
        radio.setCurrentStation(-1);
        int expected = 9;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldDecreaseWhenStationMin() {
        RadioAdvanced radio = new RadioAdvanced(60);
        radio.setCurrentStation(0);
        int expected = 60;
        assertEquals(expected, radio.decreaseStation());

    }

    @Test
    public void shouldDecreaseStationMoreMax() {
        radio.setCurrentStation(15);
        int expected = 9;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldDecreaseWhenStationMoreMin() {
        radio.setCurrentStation(1);
        int expected = 0;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldInitField() {
        assertNull(radio.getName());
        assertEquals(9, radio.getMaxNumberStation());
        assertEquals(0, radio.getMinNumberStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertFalse(radio.isOn());
    }
}
