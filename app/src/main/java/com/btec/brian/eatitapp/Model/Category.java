package com.btec.brian.eatitapp.Model;

public class Category {
    private String Name;
    private String Image;

    public Category(String name, String image) {
        Name = name;
        Image = image;
    }

    /* Fixed a bug*/
    public Category() {}

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
