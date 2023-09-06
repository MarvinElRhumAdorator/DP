package fr.kaibee.structural.proxy;

import java.nio.file.Path;
import java.util.List;

public interface DocumentReader {
    List<Document> read(Path path);
}
