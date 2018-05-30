package com.speedment.sakilawebapp;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class SakilaUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        Grid filmTable = new Grid();

        MovieCard movieCard = new MovieCard();

        layout.addComponents(filmTable, movieCard);

        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SakilaUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
