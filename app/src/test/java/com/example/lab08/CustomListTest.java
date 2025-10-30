package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City cgy = new City("Calgary", "AB");
        list.addCity(cgy);

        assertTrue(list.hasCity(cgy));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City cgy = new City("Calgary", "AB");
        list.addCity(cgy);
        list.deleteCity(cgy);
        assertFalse(list.hasCity(cgy));
    }

    @Test
    public void testCountCities() {

    }
}
