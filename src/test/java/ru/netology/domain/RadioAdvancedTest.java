package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    public void changeStation() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxNumberStation(9);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void changeVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }
}
