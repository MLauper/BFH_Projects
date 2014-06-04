package ch.bfh.ti.tscheims1.v2;

public class CSVExportHelper {

    private String CSVString = "";
    private String delimeter = ",";
    private String quote = "'";

    public void newLine() {
        this.CSVString += "\r\n";
    }

    public void addElement(Object obj) {

        this.CSVString += this.delimeter;
        this.CSVString += this.quote + obj.toString() + this.quote;
    }

    public String toString() {
        return this.CSVString;
    }

}
