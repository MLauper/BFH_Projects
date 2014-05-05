package ch.bfh.ti.ccchecker;

public class CreditCardVendor {
    int ccIIN;
    String ccVendorName;
    String ccTypeString;
    int ccNumberLength;

    /**
     * @param ccIIN          ist die Issuer identification number
     * @param ccVendorName   der Name der Bank
     * @param ccTypeString   der Type der Kreditkarte
     * @param ccNumberLength die L??nge der Nummer.
     */
    public CreditCardVendor(int ccIIN, String ccVendorName,
                            String ccTypeString, int ccNumberLength) {
        super();
        this.ccIIN = ccIIN;
        this.ccVendorName = ccVendorName;
        this.ccTypeString = ccTypeString;
        this.ccNumberLength = ccNumberLength;
    }

    public int getIIN() {
        return ccIIN;

    }

}
