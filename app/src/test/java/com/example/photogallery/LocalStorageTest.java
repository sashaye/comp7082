package com.example.photogallery;
import org.junit.Test;

import com.example.photogallery.DataStorage.LocalStorage;

import java.io.File;
import java.io.FileInputStream;

import static org.junit.Assert.*;

public class LocalStorageTest
{
    @Test
    public void localstorage_working() throws Exception {
        IStore ls = new LocalStorage();
        ls.saveState("Just Testing");
        assertEquals("Just Testing", ls.getState());
        //assertEquals(4, 2 + 2);
    }
}