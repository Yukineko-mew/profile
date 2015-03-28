package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class MainController implements Initializable {
	
	private static MainController instance;
	
	@FXML
	private ImageView image;
	@FXML
	private Label name;
	@FXML
	private HBox profilePane;
	@FXML
	private FlowPane thankyouPane;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		image.setImage(new Image("application/icon.png"));
		name.setText("Yuki猫");
		
		profilePane.setVisible(true);
		thankyouPane.setVisible(false);
		
		instance = this;
	}
	
	public void onClicked(MouseEvent e) {
		@SuppressWarnings("unused")
		WebViewController webView = new WebViewController();
	}
	
	public void changePane() {
		profilePane.setVisible(false);
		thankyouPane.setVisible(true);
	}
	
	public void onClose(MouseEvent e) {
		
	}
	
	public static MainController getInstance() {
		return instance;
		
	}
}
