// Main.java
public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = DocumentManager.getInstance();

        Document textDocument = DocumentBuilder.newBuilder()
                .setTitle("Sample Text Document")
                .setContent("This is the content of the text document.")
                .setAuthor("John Doe")
                .buildTextDocument();

        Document spreadsheetDocument = DocumentBuilder.newBuilder()
                .setTitle("Sample Spreadsheet Document")
                .setAuthor("Jane Smith")
                .buildSpreadsheetDocument();

        documentManager.createDocument(textDocument);
        documentManager.createDocument(spreadsheetDocument);

        documentManager.listAllDocuments();
    }
}
