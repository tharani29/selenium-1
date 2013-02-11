package com.sayem.enumeration;

public enum Color {

    RED(255,0,0), BLUE(0,0,255), YELLOW(255,255,0), BLACK(0,0,0);

    private int red;
    private int green;
    private int blue;

    private Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String rgbValue(){
       return String.format("(%d,%d,%d)", red, green, blue);
    }

    @Override
    public String toString(){
        String constName = super.toString();
        return constName.substring(0,1) + constName.substring(1).toLowerCase();
    }



}
