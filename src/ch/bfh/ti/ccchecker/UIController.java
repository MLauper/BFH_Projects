package ch.bfh.ti.ccchecker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class UIController {
    //Das Objekt ccChecker wird erstellt
    CreditCardChecker ccChecker = new CreditCardChecker();
    //Hier werden alle JavaFX Elemente die verwendet werden definiert.
    @FXML
    private TextField inputField;
    @FXML
    private Label vendorLabel;
    @FXML
    private Label typeLabel;
    @FXML
    private Label okLabel;
    @FXML
    private Pane nokImagePane;
    @FXML
    private Pane okImagePane;

    /**
     * Die Funktion handleInput wird definiert und f??r JavaFX freigegeben.
     * schaut ob die eingegeben Zahlenfolge valide ist und die Folge gr??sser als 10 Stellen ist.
     */
    @FXML
    private void handleInput() {
        if (ccChecker.check(getDigits(inputField.getText()))
                && inputField.getText().length() > 10) {
            //Wenn ok wird der Text angepasst und das richtige Bild angezeigt.
            okLabel.setText("Die Kreditkarte ist valide!");
            nokImagePane.setVisible(false);
            okImagePane.setVisible(true);
        } else {
            //Wenn nicht wird der Text angepasst und das richtige Bild angezeigt.
            okLabel.setText("Die Kreditkarte ist nicht valide!");
            nokImagePane.setVisible(true);
            okImagePane.setVisible(false);
        }
        //Zum Schluss wird noch ??berpr??ft wob ein Vendor f??r diese Kartennummer verf??gbar ist.
        vendorCheck();
    }

    /**
     * Die Funktion vendorCheck wird ben??tigt um allenfalls zutreffende Vendors oder Kartentype auszugeben.
     */
    private void vendorCheck() {
        int i = 0;
        String vendor = "nicht verfuegbar";
        String type = "nicht verfuegbar";
        String nString = "";
        while (i < 6) {
            if (inputField.getText().length() > i) {
                nString = nString + inputField.getText().substring(i, i + 1);
            } else {
                nString = nString + "0";
            }
            i++;
        }
        vendor = ccChecker.getVendor(Integer.parseInt(nString));
        type = ccChecker.getccType(Integer.parseInt(nString));
        vendor = (vendor == "") ? "nicht verfuegbar" : vendor;
        type = (type == "") ? "nicht verfuegbar" : type;
        typeLabel.setText("Kartentyp: " + type);
        vendorLabel.setText("Aussteller: " + vendor);

    }

    /**
     * Die Funktion getDigits wandelt den Input String in ein int[] dieses wird ben??tigt um die
     * Kreditkarten Nummer mit dem Luhn Algorithmus zu validieren
     *
     * @param string der String vom InputField
     * @return der in ein int[] umgewandelte string
     */
    private int[] getDigits(String string) {
        String s = inputField.getText();
        int[] digits = new int[s.length()];
        char[] asChar = s.toCharArray();
        int i = 0;
        for (char c : asChar) {
            digits[i++] = Character.digit(c, 10);
        }
        return digits;
    }
}
