package com.example.photogallery.DataStorage;

import com.example.photogallery.IStore;

public class LocalStorage implements IStore {
    private String state = "";

    public LocalStorage () {}

    public void saveState (String state) {
        this.state = state;
    }

    public String getState () {
        return state;
    }
}

