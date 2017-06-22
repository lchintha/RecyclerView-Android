package com.example.chint.recyclarview;

/**
 * Created by chint on 6/22/2017.
 */

public class ListItems {
    private String title;
    private String Description;

    public ListItems(String title, String description) {
        this.title = title;
        this.Description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }
}
