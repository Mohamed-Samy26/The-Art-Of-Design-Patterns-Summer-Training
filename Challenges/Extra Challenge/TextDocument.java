// TextDocument.java
public class TextDocument extends Document {
    public TextDocument(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Text Document - ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}