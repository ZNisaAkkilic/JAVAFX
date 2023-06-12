package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML 
	Label sayýyýyaz;
	@FXML 
	TextField sayýgir;
	@FXML 
	Button arttýr;
	public void arttýrmaislemi(ActionEvent e) 
	{
		//sayýyýyaz.setText(sayýgir.getText());
		
		if(sayýgir.getText().isEmpty())
			
		int yeni;
		yeni=Integer.parseInt(sayýgir.getText());
		yeni=yeni+1;
		sayýyýyaz.setText(String.valueOf(Integer.valueOf(yeni)));
		
		
	}
	
	
}
