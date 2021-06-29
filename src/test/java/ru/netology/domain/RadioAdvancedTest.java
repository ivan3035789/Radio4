package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();
        String expected = "Радио";

        assertNull(radioAdvanced.getName());
        radioAdvanced.setName(expected);
        assertEquals(expected, radioAdvanced.getName());
    }

    @Test
    public void RadioStationIncreaseOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        radioAdvanced.increaseCurrentStationNumber();
        assertEquals(1, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(9);
        radioAdvanced.increaseCurrentStationNumber();
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void RadioStationDecreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        radioAdvanced.reducingCurrentStationNumber();
        assertEquals(9, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(1);
        radioAdvanced.reducingCurrentStationNumber();
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void VolumeIncreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(0);
        radioAdvanced.increaseVolume();
        assertEquals(1, radioAdvanced.getSoundVolume());


        radioAdvanced.setSoundVolume(10);
        radioAdvanced.increaseVolume();
        assertEquals(10, radioAdvanced.getSoundVolume());

    }

    @Test
    public void VolumeDecreaseByOne() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setSoundVolume(10);
        radioAdvanced.reducingVolume();
        assertEquals(9, radioAdvanced.getSoundVolume());

        radioAdvanced.setSoundVolume(1);
        radioAdvanced.reducingVolume();
        assertEquals(0, radioAdvanced.getSoundVolume());

        radioAdvanced.reducingVolume();
        assertEquals(0, radioAdvanced.getSoundVolume());

    }

    @Test
    public void checksValidRadioStationNumbersForInput() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(0);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(5);
        assertEquals(5, radioAdvanced.getCurrentRadioStationNum());

    }

    @Test
    public void checksInvalidRadioStationNumbersForInput() {
        RadioAdvanced radioAdvanced = new RadioAdvanced();

        radioAdvanced.setCurrentRadioStationNum(-10);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());

        radioAdvanced.setCurrentRadioStationNum(10);
        assertEquals(0, radioAdvanced.getCurrentRadioStationNum());
    }

}