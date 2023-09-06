package fr.kaibee.structural.proxy;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FsDocumentReader implements DocumentReader {
    @Override
    public List<Document> read(Path path) {
        System.out.println("path = " + path);
        return Collections.emptyList();
    }
}
