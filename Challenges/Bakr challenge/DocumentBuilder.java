// DocumentBuilder.java
public class DocumentBuilder {
    private String title;
    private String content;
    private String author;

    private DocumentBuilder() {
    }

    public static DocumentBuilder newBuilder() {
        return new DocumentBuilder();
    }

    public DocumentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public DocumentBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public DocumentBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public TextDocument buildTextDocument() {
        return new TextDocument(title, content, author);
    }

    public SpreadsheetDocument buildSpreadsheetDocument() {
        return new SpreadsheetDocument(title, author);
    }
}
