package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML 
	Label say�y�yaz;
	@FXML 
	TextField say�gir;
	@FXML 
	Button artt�r;
	public void artt�rmaislemi(ActionEvent e) 
	{
		//say�y�yaz.setText(say�gir.getText());
		
		if(say�gir.getText().isEmpty())
			
		int yeni;
		yeni=Integer.parseInt(say�gir.getText());
		yeni=yeni+1;
		say�y�yaz.setText(String.valueOf(Integer.valueOf(yeni)));
		
		
	}
	
	
}
