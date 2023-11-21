// Document.java
public abstract class Document {
    protected int id;
    protected String title;
    protected String content;
    protected String author;

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getDetails();
}
