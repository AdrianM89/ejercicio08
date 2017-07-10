package es.cic.taller.ejercicio08;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	private VerticalLayout layout = new VerticalLayout();
	
	private TapeteForm tapete1 = new TapeteForm(this);
	private TapeteForm tapete2 = new TapeteForm(this);
	private TapeteForm tapete3 = new TapeteForm(this);
	private TapeteForm tapete4 = new TapeteForm(this);
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
        
        layout.addComponents(tapete1,tapete2, tapete3, tapete4);
        
        setContent(layout);
        
        Baraja baraja = new Baraja();
        Tapete manoTapete1 = baraja.getTapete();
        Tapete manoTapete2 = baraja.getTapete();
        Tapete manoTapete3 = baraja.getTapete();
        Tapete manoTapete4 = baraja.getTapete();
        
        tapete1.setTapete(manoTapete1);
        tapete2.setTapete(manoTapete2);
        tapete3.setTapete(manoTapete3);
        tapete4.setTapete(manoTapete4);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
