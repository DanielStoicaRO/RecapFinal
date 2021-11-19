package com.sda.recapFinalExercises.Collection.map;

import java.util.Objects;


public class CustomKey
{
    private String keyString;
    private int keyInteger;

    public CustomKey(String keyString, int keyInteger)
    {
        this.keyString = keyString;
        this.keyInteger = keyInteger;
    }

    public String getKeyString()
    {
        return keyString;
    }

    public int getKeyInteger()
    {
        return keyInteger;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        CustomKey customKey = (CustomKey) o;
        return keyInteger == customKey.keyInteger && Objects.equals(keyString, customKey.keyString);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(keyString, keyInteger);
    }
}
