package ch.bfh.ti.lottery.ui;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import ch.bfh.ti.lottery.backend.Lottery;
import ch.bfh.ti.lottery.tickets.TicketType.Plays.Play;
import ch.bfh.ti.lottery.tickets.Tickets;
import ch.bfh.ti.lottery.tickets.Tickets.Ticket;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class UiController {

	Lottery lottery = new Lottery();
	final ObservableList<Tickets.Ticket> observableListTickets = FXCollections
			.observableArrayList();
	ArrayList<ArrayList<TextField>> textFields = new ArrayList<>();
	ArrayList<ArrayList<TextField>> textFieldsTreffer = new ArrayList<>();

	@FXML
	private TextField txtMomTickStarNr10;

	@FXML
	private TextField txtMomTickStarNr11;

	@FXML
	private Tab tabWinner;

	@FXML
	private Tab tabTickets;

	@FXML
	private TextField txtTreffer0;

	@FXML
	private TextField txtTreffer1;

	@FXML
	private TextField txtTreffer2;

	@FXML
	private TextField txtTreffer3;

	@FXML
	private TextField txtTreffer4;

	@FXML
	private TextField txtTreffer5;

	@FXML
	private AnchorPane acpGewinnerInfo;
	
	@FXML
	private TextField txtTreffer6;
	
	@FXML
	private Label lblZiehungvom;
	
	@FXML
	private Label lblGewinnZahlen;

	@FXML
	private TextField txtMomTickNr62;

	@FXML
	private TextField txtMomTickNr63;

	@FXML
	private TextField txtMomTickNr64;

	@FXML
	private TextField txtMomTickStarNr01;

	@FXML
	private TextField txtMomTickStarNr00;

	@FXML
	private TextField txtStarNr0;

	@FXML
	private TextField txtStarNr1;

	@FXML
	private TextField txtMomTickNr60;

	@FXML
	private TextField txtNachricht;

	@FXML
	private TextField txtMomTickNr61;

	@FXML
	private Button butDateiXSD;

	@FXML
	private TextField txtEinstNr4;

	@FXML
	private TextField txtEinstNr3;

	@FXML
	private TextField txtEinstNr2;

	@FXML
	private TextField txtEinstNr1;

	@FXML
	private TextField txtEinstNr0;

	@FXML
	private TextField txtMomTickNr51;

	@FXML
	private TextField txtMomTickNr52;

	@FXML
	private TextField txtMomTickNr53;

	@FXML
	private TextField txtMomTickNr54;

	@FXML
	private TextField txtXML;

	@FXML
	private TextField txtMomTickSuperStarNr03;

	@FXML
	private TextField txtMomTickStarNr31;

	@FXML
	private TextField txtMomTickSuperStarNr00;

	@FXML
	private ChoiceBox<Tickets.Ticket> chbTickets;

	@FXML
	private TextField txtMomTickStarNr30;

	@FXML
	private TextField txtMomTickSuperStarNr01;

	@FXML
	private TextField txtMomTickNr50;

	@FXML
	private TextField txtMomTickSuperStarNr02;

	@FXML
	private TextField txtMomTickNr40;

	@FXML
	private TextField txtMomTickNr41;

	@FXML
	private TextField txtMomTickNr42;

	@FXML
	private TextField txtMomTickNr43;

	@FXML
	private TextField txtMomTickNr44;

	@FXML
	private TextField txtMomTickStarNr21;

	@FXML
	private TextField txtMomTickStarNr20;

	@FXML
	private TextField txtCurSuperStarWinNr0;

	@FXML
	private TextField txtCurSuperStarWinNr2;

	@FXML
	private TextField txtCurSuperStarWinNr1;

	@FXML
	private TextField txtCurSuperStarWinNr3;

	@FXML
	private Button butAktXML;

	@FXML
	private TextField txtCurWinNr3;

	@FXML
	private TextField txtCurWinNr2;

	@FXML
	private TextField txtMomTickNr30;

	@FXML
	private TextField txtCurWinNr1;

	@FXML
	private TextField txtMomTickNr31;

	@FXML
	private TextField txtCurWinNr0;

	@FXML
	private TextField txtMomTickNr32;

	@FXML
	private TextField txtMomTickNr33;

	@FXML
	private TextField txtMomTickNr34;

	@FXML
	private TextField txtCurWinNr4;

	@FXML
	private TextField txtMomTickStarNr50;

	@FXML
	private TextField txtMomTickStarNr51;

	@FXML
	private TextField txtMomTickNr20;

	@FXML
	private TextField txtMomTickNr21;

	@FXML
	private TextField txtMomTickNr22;

	@FXML
	private TextField txtSuperStarNr0;

	@FXML
	private TextField txtMomTickNr23;

	@FXML
	private TextField txtMomTickNr24;

	@FXML
	private Button butGetWinnerInfo;

	@FXML
	private TextField txtMomTickStarNr41;

	@FXML
	private TextField txtMomTickStarNr40;

	@FXML
	private Button butAktXSD;

	@FXML
	private TextField txtSuperStarNr3;

	@FXML
	private TextField txtSuperStarNr1;

	@FXML
	private TextField txtSuperStarNr2;

	@FXML
	private TextField txtMomTickNr10;

	@FXML
	private TextField txtMomTickNr11;

	@FXML
	private Label lblGewinninfo;

	@FXML
	private TextField txtMomTickNr12;

	@FXML
	private TextField txtStarTreffer0;

	@FXML
	private TextField txtMomTickNr13;

	@FXML
	private TextField txtStarTreffer1;

	@FXML
	private TextField txtMomTickNr14;

	@FXML
	private TextField txtMomTickNr04;

	@FXML
	private TextField txtSuperStarTreffer0;

	@FXML
	private Button butDateiXML;

	@FXML
	private TextField txtMomTickNr00;

	@FXML
	private TextField txtMomTickNr01;

	@FXML
	private TextField txtMomTickNr02;

	@FXML
	private TextField txtMomTickNr03;

	@FXML
	private TextField txtCurStarWinNr1;

	@FXML
	private TextField txtMomTickStarNr61;

	@FXML
	private TextField txtCurStarWinNr0;

	@FXML
	private TextField txtMomTickStarNr60;

	@FXML
	private TextField txtStarTreffer2;

	@FXML
	private TextField txtStarTreffer3;

	@FXML
	private TextField txtXSD;

	@FXML
	private TextField txtStarTreffer4;

	@FXML
	private TextField txtStarTreffer5;

	@FXML
	private TextField txtStarTreffer6;

	@FXML
	// This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		
		txtEinstNr0.setText("25");
		txtEinstNr1.setText("32");
		txtEinstNr2.setText("42");
		txtEinstNr3.setText("10");
		txtEinstNr4.setText("48");
		txtStarNr0.setText("12");
		txtStarNr1.setText("33");
		txtSuperStarNr0.setText("D12AS");
		txtSuperStarNr1.setText("IE23L");
		txtSuperStarNr2.setText("D12AS");
		txtSuperStarNr3.setText("W432K");
		
		textFields.add(new ArrayList<TextField>());
		textFields.get(0).add(txtMomTickNr00);
		textFields.get(0).add(txtMomTickNr01);
		textFields.get(0).add(txtMomTickNr02);
		textFields.get(0).add(txtMomTickNr03);
		textFields.get(0).add(txtMomTickNr04);
		textFields.add(new ArrayList<TextField>());
		textFields.get(1).add(txtMomTickNr10);
		textFields.get(1).add(txtMomTickNr11);
		textFields.get(1).add(txtMomTickNr12);
		textFields.get(1).add(txtMomTickNr13);
		textFields.get(1).add(txtMomTickNr14);
		textFields.add(new ArrayList<TextField>());
		textFields.get(2).add(txtMomTickNr20);
		textFields.get(2).add(txtMomTickNr21);
		textFields.get(2).add(txtMomTickNr22);
		textFields.get(2).add(txtMomTickNr23);
		textFields.get(2).add(txtMomTickNr24);
		textFields.add(new ArrayList<TextField>());
		textFields.get(3).add(txtMomTickNr30);
		textFields.get(3).add(txtMomTickNr31);
		textFields.get(3).add(txtMomTickNr32);
		textFields.get(3).add(txtMomTickNr33);
		textFields.get(3).add(txtMomTickNr34);
		textFields.add(new ArrayList<TextField>());
		textFields.get(4).add(txtMomTickNr40);
		textFields.get(4).add(txtMomTickNr41);
		textFields.get(4).add(txtMomTickNr42);
		textFields.get(4).add(txtMomTickNr43);
		textFields.get(4).add(txtMomTickNr44);
		textFields.add(new ArrayList<TextField>());
		textFields.get(5).add(txtMomTickNr50);
		textFields.get(5).add(txtMomTickNr51);
		textFields.get(5).add(txtMomTickNr52);
		textFields.get(5).add(txtMomTickNr53);
		textFields.get(5).add(txtMomTickNr54);
		textFields.add(new ArrayList<TextField>());
		textFields.get(6).add(txtMomTickNr60);
		textFields.get(6).add(txtMomTickNr61);
		textFields.get(6).add(txtMomTickNr62);
		textFields.get(6).add(txtMomTickNr63);
		textFields.get(6).add(txtMomTickNr64);
		textFields.get(0).add(txtMomTickStarNr00);
		textFields.get(0).add(txtMomTickStarNr01);
		textFields.get(1).add(txtMomTickStarNr10);
		textFields.get(1).add(txtMomTickStarNr11);
		textFields.get(2).add(txtMomTickStarNr20);
		textFields.get(2).add(txtMomTickStarNr21);
		textFields.get(3).add(txtMomTickStarNr30);
		textFields.get(3).add(txtMomTickStarNr31);
		textFields.get(4).add(txtMomTickStarNr40);
		textFields.get(4).add(txtMomTickStarNr41);
		textFields.get(5).add(txtMomTickStarNr50);
		textFields.get(5).add(txtMomTickStarNr51);
		textFields.get(6).add(txtMomTickStarNr60);
		textFields.get(6).add(txtMomTickStarNr61);
		textFields.add(new ArrayList<TextField>());
		textFields.get(7).add(txtMomTickSuperStarNr00);
		textFields.get(7).add(txtMomTickSuperStarNr01);
		textFields.get(7).add(txtMomTickSuperStarNr02);
		textFields.get(7).add(txtMomTickSuperStarNr03);
		
		textFieldsTreffer.add(new ArrayList<TextField>());
		textFieldsTreffer.get(0).add(txtTreffer0);
		textFieldsTreffer.get(0).add(txtTreffer1);
		textFieldsTreffer.get(0).add(txtTreffer2);
		textFieldsTreffer.get(0).add(txtTreffer3);
		textFieldsTreffer.get(0).add(txtTreffer4);
		textFieldsTreffer.get(0).add(txtTreffer5);
		textFieldsTreffer.get(0).add(txtTreffer6);
		textFieldsTreffer.add(new ArrayList<TextField>());
		textFieldsTreffer.get(1).add(txtStarTreffer0);
		textFieldsTreffer.get(1).add(txtStarTreffer1);
		textFieldsTreffer.get(1).add(txtStarTreffer2);
		textFieldsTreffer.get(1).add(txtStarTreffer3);
		textFieldsTreffer.get(1).add(txtStarTreffer4);
		textFieldsTreffer.get(1).add(txtStarTreffer5);
		textFieldsTreffer.get(1).add(txtStarTreffer6);
		textFieldsTreffer.add(new ArrayList<TextField>());
		textFieldsTreffer.get(2).add(txtSuperStarTreffer0);
		
		txtNachricht.setText("FXML geladen und konfiguriert.	");


	}

	@FXML
	private void close() {
		Platform.exit();
	}

	@FXML
	private void openFileXSD() {
		final Stage fileStage = new Stage();
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(fileStage);
		if (file != null) {
			txtXSD.setText(file.toString());
		}
		butAktXSD.setDisable(false);
		txtNachricht.setText("XSD ausgewaehlt");
	}

	@FXML
	private void activateXSD() {
		txtNachricht.setText("XSD aktiviert");

	}

	@FXML
	private void openFileXML() {
		final Stage fileStage = new Stage();
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(fileStage);
		if (file != null) {
			txtXML.setText(file.toString());
		}
		butAktXML.setDisable(false);
		txtNachricht.setText("XML ausgewaehlt");

	}

	@FXML
	private void activateXML() {
		try {
			lottery.addXmlTickets(txtXML.getText(), true);

		} catch (Exception e) {
			System.err.println(e.toString());
		}

		observableListTickets
				.addAll(lottery.getLotteryTicketPool().getTicket());
		chbTickets.setItems(observableListTickets);
		chbTickets.setConverter(new StringConverter<Tickets.Ticket>() {
			
			@Override
			public String toString(Ticket object) {
				
				return "Ticket: " + object.getTicketId();
			}
			
			@Override
			public Ticket fromString(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		chbTickets.getSelectionModel().select(0);
		fillInNumbers(observableListTickets.get(0));
		chbTickets.valueProperty().addListener(
				new ChangeListener<Tickets.Ticket>() {

					@Override
					public void changed(
							ObservableValue<? extends Tickets.Ticket> observable,
							Ticket oldValue, Ticket newValue) {

						fillInNumbers(observableListTickets.get(chbTickets
								.getSelectionModel().getSelectedIndex()));
					}
				});

		butAktXML.setDisable(true);
		tabWinner.setDisable(false);
		getWinner(lottery.draw());
		txtNachricht.setText("XML aktiviert");

	}

	private void fillInNumbers(Ticket curTicket) {
		int i = 0, j = 0, k;
		textFieldsTreffer.get(2).get(0).setText(Integer.toString(lottery.compareSuperStars(curTicket)));
		for (Play play : curTicket.getPlays().getPlay()) {
			for (j = 0; j < 5; j++) {
				textFields
						.get(i)
						.get(j)
						.setText(
								Integer.toString(play.getNumbers().getNumber()
										.get(j)));

			}
			
			k = 0;
			for (j = 5; j < 7; j++) {
				textFields
						.get(i)
						.get(j)
						.setText(
								Integer.toString(play.getStars().getStar()
										.get(k)));
				k++;

			}
			
			
			textFieldsTreffer.get(0).get(i).setText(Integer.toString(lottery.compareNumbers(play)));
			textFieldsTreffer.get(1).get(i).setText(Integer.toString(lottery.compareStars(play)));
			i++;
		}
		i = 0;
		for (TextField field : textFields.get(7)) {
			if (curTicket.getSuperStars().getSuperStar().get(i).isSelected()) {
				field.setText(curTicket.getSuperStars().getSuperStar().get(i)
						.getValue());
			} else {
				field.setText("X");
			}
			i++;

		}
		
		txtNachricht.setText("Nummern gesetzt");

	}

	private void getWinner(int[] list) {

		String string = ("");
		string = " " + list[0];
		string += "\n " + list[1];
		string += "\n " + list[2];
		string += "\n " + list[3];
		string += "\n " + list[4];
		string += "\n " + list[5];
		string += "\n " + list[6];
		string += "\n " + list[7];
		string += "\n " + list[8];
		string += "\n " + list[9];
		string += "\n " + list[10];
		string += "\n " + list[11];
		string += "\n " + list[12];

		lblGewinninfo.setText(string);
		txtNachricht.setText("Gewinner gesetzt");

	}

	@FXML
	private void activateWinnerNr() {
		int nr0 = Integer.parseInt(txtEinstNr0.getText());
		int nr1 = Integer.parseInt(txtEinstNr1.getText());
		int nr2 = Integer.parseInt(txtEinstNr2.getText());
		int nr3 = Integer.parseInt(txtEinstNr3.getText());
		int nr4 = Integer.parseInt(txtEinstNr4.getText());
		lottery.setSetLuckyNumbers(nr0, nr1, nr2, nr3, nr4);

		int starnr0 = Integer.parseInt(txtStarNr0.getText());
		int starnr1 = Integer.parseInt(txtStarNr1.getText());
		lottery.setSetLuckyStars(starnr0, starnr1);

		String superstarnr0 = txtSuperStarNr0.getText();
		String superstarnr1 = txtSuperStarNr1.getText();
		String superstarnr2 = txtSuperStarNr2.getText();
		String superstarnr3 = txtSuperStarNr3.getText();
		lottery.setSetLuckySuperStars(superstarnr0, superstarnr1, superstarnr2,
				superstarnr3);
		txtCurWinNr0.setText(Integer.toString(nr0));
		txtCurWinNr1.setText(Integer.toString(nr1));
		txtCurWinNr2.setText(Integer.toString(nr2));
		txtCurWinNr3.setText(Integer.toString(nr3));
		txtCurWinNr4.setText(Integer.toString(nr4));
		txtCurStarWinNr0.setText(Integer.toString(starnr0));
		txtCurStarWinNr1.setText(Integer.toString(starnr1));
		txtCurSuperStarWinNr0.setText(superstarnr0);
		txtCurSuperStarWinNr1.setText(superstarnr1);
		txtCurSuperStarWinNr2.setText(superstarnr2);
		txtCurSuperStarWinNr3.setText(superstarnr3);
		lblGewinnZahlen.setText(txtEinstNr0.getText()+ " " +txtEinstNr1.getText()+ " " +txtEinstNr2.getText()+ " " +txtEinstNr3.getText()+ " " +txtEinstNr4.getText()+ " *" +txtStarNr0.getText()+ " " +txtStarNr1.getText());
		 SimpleDateFormat formatter = new SimpleDateFormat( 
	                " dd.MM.yyyy"); 
	        Date currentDate = new Date(); 	        
		lblZiehungvom.setText(formatter.format(currentDate));
		tabTickets.setDisable(false);
		txtNachricht.setText("Gewinn Nummern gesetzt");


	}

	// I18N Teil
	@FXML
	private void changeLangDE(ActionEvent e) throws FileNotFoundException {
		changeLangFile("de", "CH");
		showStage("Bitte starten Sie die Applikation neu!");
		System.out.println(e.toString());

	}

	@FXML
	private void changeLangEN(ActionEvent e) {
		changeLangFile("en", "US");
		showStage("Please restart the application!");

	}

	
	
	private void changeLangFile(String lang, String country) {
		File langFile = new File("lang.config");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(langFile));
			writer.write(lang);
			writer.newLine();
			writer.write(country);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}

		}
		txtNachricht.setText("Sprach File angepasst");

	}

	public void showStage(String mesString) {
		final Stage newStage = new Stage();
		VBox comp = new VBox();
		Label message = new Label(mesString);
		Button button = new Button("OK");

		comp.getChildren().add(message);
		comp.getChildren().add(button);

		Scene stageScene = new Scene(comp);
		newStage.setScene(stageScene);
		newStage.show();
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				newStage.hide();
			}
		});
		txtNachricht.setText("Popup angezeigt");

	}
}
