// SpreadsheetDocument.java
public class SpreadsheetDocument extends Document {
    public SpreadsheetDocument(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Spreadsheet Document - ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}