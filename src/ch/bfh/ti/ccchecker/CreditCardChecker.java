package ch.bfh.ti.ccchecker;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CreditCardChecker {

    private ArrayList<CreditCardVendor> ccVendors = new ArrayList<CreditCardVendor>();

    public CreditCardChecker() {
        int i = 0;

        try {
            String[] s;
            //??ffnet das File in dem die verschiedenen IIN und Kartentypen drinstehen
            DataInputStream in = new DataInputStream(
                    CreditCardChecker.class.getResourceAsStream("iinints.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            // Liest dieses File Linie f??r Linie ein
            while ((strLine = br.readLine()) != null) {
                //Hier wird f??r jede Linie ein neues CreditCardVendor Objekt erstellt und der
                //ArrayList hinzugef??gt.
                s = strLine.split(",");
                ccVendors.add(new CreditCardVendor(Integer.parseInt(s[0]),
                        s[2], s[1], Integer.parseInt(s[3])));
                i++;
            }
            //Das File wird am Schluss wieder geschlossen
            in.close();
        } catch (Exception e) {// Wenn ein Fehler auftritt, wird die Zeile und die Errormessage ausgegeben.
            System.err.println("Error Line" + i + ": " + e.getMessage());
        }

    }

    /**
     * check definiert den eigentlichen Luhn Algorithmus
     *
     * @param digits ist die Kreditkartennummer im int[] Format
     * @return gibt true oder false zur??ck.
     */
    public boolean check(int[] digits) {
        int sum = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            //Alle Zahlen in umgekehrter Reihenfolge
            int digit = digits[length - i - 1];
            // und jede zweite Zahl wird mit 2 multipliziert.
            if (i % 2 == 1) {
                digit *= 2;
            }
            //Die Summe wird gebildet, wenn die digit gr??sser als 10 ist wird zuerst minus 9 gerechnet und erst dann
            // zur Summe hinzugef??gt.
            sum += digit > 9 ? digit - 9 : digit;
        }
        //wenn der Modulo 10 der gesamten Summer 10 ergibt, ist es eine valide KreditKartenNummer.
        return sum % 10 == 0;
    }

    /**
     * Hier wird der Vendor wenn vorhanden zur??ckgegeben.
     *
     * @param digits die ersten 6 Ziffern der Kreditkarte.
     * @return wenn eine ??bereinstimmung vorhanden ist, wird der VendorName zur??ckgegeben.
     */
    public String getVendor(int digits) {

        String returner = "";
        for (CreditCardVendor ccVendor : ccVendors) {
            if (ccVendor.ccIIN == digits) {
                return ccVendor.ccVendorName;
            }
        }
        return returner;

    }

    /**
     * @param digits die ersten 6 Ziffern der Kreditkarte
     * @return wenn eine ??bereinstimmung vorhanden ist, wird der Kreditkartentyp zur??ckgegeben
     */
    public String getccType(int digits) {
        String returner = "";
        for (CreditCardVendor ccVendor : ccVendors) {
            if (ccVendor.ccIIN == digits) {
                return ccVendor.ccTypeString;
            }
        }
        return returner;
    }
}
