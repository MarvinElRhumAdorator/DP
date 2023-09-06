package fr.kaibee.structural.proxy;

import java.nio.file.Path;
import java.util.List;

public class DocumentReaderProxy implements DocumentReader {

    private DocumentReader fsDocumentReader;

    @Override
    public List<Document> read(Path path) {
        if (SecurityContext.hasAccessTo(path)) {
            return fsDocumentReader.read(path);
        }
        throw new IllegalArgumentException("Unauthorised Path");
    }

    public void setFsDocumentReader(DocumentReader fsDocumentReader) {
        this.fsDocumentReader = fsDocumentReader;
    }
}
