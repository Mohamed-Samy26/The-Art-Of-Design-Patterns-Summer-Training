// DocumentManager.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentManager {
    private static DocumentManager instance;
    private Map<Integer, Document> documents;

    private DocumentManager() {
        documents = new HashMap<>();
    }

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public void createDocument(Document document) {
        int id = documents.size() + 1;
        document.setId(id);
        documents.put(id, document);
    }

    public Document getDocumentById(int id) {
        return documents.get(id);
    }

    public void listAllDocuments() {
        System.out.println("List of Documents:");
        for (Document document : documents.values()) {
            System.out.println(document.getDetails());
        }
    }
}








