package com.speedment.sakilawebapp;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class MovieCard extends FormLayout {

    public MovieCard() {

        TextField title = new TextField("Title", "The Martian");
        title.setStyleName("h1 borderless");
        title.setReadOnly(true);

        TextField length = new TextField("Length", "1h 52 min");
        length.setStyleName("h1 borderless");
        length.setReadOnly(true);

        TextField releaseYear = new TextField("Release Year");
        releaseYear.setStyleName("h1 borderless");
        releaseYear.setReadOnly(true);

        TextField rating = new TextField("Rating");
        rating.setStyleName("h1 borderless");
        rating.setReadOnly(true);

        TextField description = new TextField("Description");
        description.setStyleName("h1 borderless");
        description.setReadOnly(true);

        addComponents(title, length, releaseYear, rating, description);

    }
}
