package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Disabled
    @Test
    public void changeStation(int NumberCurrentStation) {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(1);
        assertEquals(5, radio.getNumberCurrentStation());
        radio.setNumberCurrentStation(1);
        assertEquals(5, radio.getNumberCurrentStation());

    }
}