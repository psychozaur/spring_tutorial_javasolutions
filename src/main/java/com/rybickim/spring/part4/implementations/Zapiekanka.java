package com.rybickim.spring.part4.implementations;

import com.rybickim.spring.part4.api.IZapiekanka;

public class Zapiekanka implements IZapiekanka {

    @Override
    public void prepareZapiekanka() {
        System.out.println("The cook is preparing a zapiekanka");
    }
}
