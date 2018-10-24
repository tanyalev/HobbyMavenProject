package com.ua.tanya;

public class Hobby {
    byte byteValue;
    short shortValue;
    char CharValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    boolean boolValue;

    public Hobby(char charValue, int intValue, long longValue, float floatValue, double doubleValue, boolean boolValue) {
        CharValue = charValue;
        this.intValue = intValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.boolValue = boolValue;
    }

    public Hobby(char charValue, int intValue, long longValue, boolean boolValue) {
        CharValue = charValue;
        this.intValue = intValue;
        this.longValue = longValue;
        this.boolValue = boolValue;
    }

    public Hobby(float floatValue, double doubleValue, boolean boolValue) {
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.boolValue = boolValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public char getCharValue() {
        return CharValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public boolean isBoolValue() {
        return boolValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public void setCharValue(char charValue) {
        CharValue = charValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }
}