package com.cybertek.enums;

public enum Gender {
    FEMALE("Female"), MALE("Male");

    private final String value;

    private Gender(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
