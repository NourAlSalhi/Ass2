package org.example;

public class divisionNumber {
    public float divsion (float x,float y) throws ArithmeticException{
        if(y==0) throw new ArithmeticException();
        return x/y;
    }
}
