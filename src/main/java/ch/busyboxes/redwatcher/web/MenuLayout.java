package ch.busyboxes.redwatcher.web;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

/**
 * Main menu
 */
public class MenuLayout extends VerticalLayout {

    private static final long serialVersionUID = 1L;

    public static final String DASHBOARD_FRAGMENT = "dashboard";

    public static final String SERVERS_FRAGMENT = "servers";

    private final Navigator navigator;

    public MenuLayout(Navigator navigator) {
        super();

        this.navigator = navigator;

        setMargin(true);
        setWidth("300px");
        initComponents();
    }

    private void initComponents() {

        Button dashboardButton = new Button("Go to dashboard");

        dashboardButton.addClickListener(event -> navigator.navigateTo(DASHBOARD_FRAGMENT));

        addComponent(dashboardButton);

        Button serversButton = new Button("Go to server page");

        serversButton.addClickListener(event -> navigator.navigateTo(SERVERS_FRAGMENT));

        addComponent(serversButton);
    }

}
