package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WebViewController {
	Stage stage;
	
	@FXML
	private WebView webView;
	
	private final String PORTFOLIO_URL = "http://yukineko-mew.github.io";
	
	public WebViewController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("webView.fxml"));
			loader.setController(this);
			
			stage = new Stage(StageStyle.TRANSPARENT);
			Scene scene = new Scene(loader.load());
			stage.setScene(scene);
			stage.setTitle("PORTFOLIO SITE");
			stage.setResizable(false);
			
			webView.getEngine().load(PORTFOLIO_URL);
			
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onClose(MouseEvent e) {
		MainController.getInstance().changePane();
		stage.close();
	}
}
