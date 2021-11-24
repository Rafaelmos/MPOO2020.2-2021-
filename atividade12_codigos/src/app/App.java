package app;

import java.util.ArrayList;

import controller.Controller;
import view.EsperaView;
import view.FilaPanel;
import view.MedicoView;
import view.RecepcionistView;

public class App {

	public static void main(String[] args) {

		FilaPanel filaPanel = new FilaPanel("", "1");
		filaPanel.getNomeLabel().setText(""+0);
		MedicoView medicoView = new MedicoView("DR.Mpoo");
		RecepcionistView recepcionistView = new RecepcionistView("Recepçao", "5");
		ArrayList<EsperaView> esperaViews = new ArrayList<EsperaView>();
		EsperaView esperaView = new EsperaView("TV 1");
		EsperaView esperaView1 = new EsperaView("TV 2");
		EsperaView esperaView2 = new EsperaView("TV 3");
		EsperaView esperaView3 = new EsperaView("TV 4");

		esperaViews.add(esperaView);
		esperaViews.add(esperaView1);
		esperaViews.add(esperaView2);
		esperaViews.add(esperaView3);

				
		new Controller(esperaViews, medicoView, recepcionistView, 0);

	}
}
