package es.cic.taller.ejercicio08;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TapeteForm extends FormLayout {
	
	
    
    private TextField carta1 = new TextField("Carta 1");
    private TextField carta2 = new TextField("Carta 2");
    private TextField carta3 = new TextField("Carta 3");
    private TextField carta4 = new TextField("Carta 4");
    private MyUI myUI;

	public TapeteForm (MyUI myUI) {
		this.myUI= myUI;
    	addComponents(carta1, carta2, carta3, carta4);
	}
	
	public void setTapete(Tapete tapete) {
		carta1.setValue(tapete.getCarta1().toString());
		carta2.setValue(tapete.getCarta2().toString());
		carta3.setValue(tapete.getCarta3().toString());
		carta4.setValue(tapete.getCarta4().toString());
	}
}
