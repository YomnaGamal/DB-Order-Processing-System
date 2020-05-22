package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import reports.ViewReports;

public class Reports extends Pane{

	Manager man;
	private Pane root;

	public Reports(Manager m) {
		man = m;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Reports.fxml"));
		loader.setController(this);
		try {
			root = loader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		man.mangpane.getChildren().add(root);
	}
    @FXML
    void totalSales(ActionEvent event) {
    	ViewReports view = new ViewReports();
    	view.totalSalesSummary();
    }

    @FXML
    void topBooks(ActionEvent event) {
    	ViewReports view = new ViewReports();
    	view.topSellingBooks();
    }

    @FXML
    void topCustomers(ActionEvent event) {
    	ViewReports view = new ViewReports();
    	view.topCustomers();
    }

}