package com.example.apprecyclerview;

public class Card {

    private int id;
    private String name;

    private String codigoHex;
    private int color_resource;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoHex() {
        return codigoHex;
    }

    public void setCodigoHex(String codigoHex) {
        this.codigoHex = codigoHex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor_resource() {
        return color_resource;
    }

    public void setColor_resource(int color_resource) {
        this.color_resource = color_resource;
    }
}
