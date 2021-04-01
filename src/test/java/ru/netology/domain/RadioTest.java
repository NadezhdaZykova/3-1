package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void changeStation() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.maxNumberStation);
        assertEquals(0, radio.minNumberStation);
        assertEquals(0, radio.currentStation);
        assertFalse(radio.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void changeVolume() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.maxVolume);
        assertEquals(0, radio.minVolume);
        assertEquals(0, radio.currentVolume);
        assertFalse(radio.on);
    }
}