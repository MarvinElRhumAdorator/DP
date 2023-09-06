package fr.kaibee.dp.proxy;

import fr.kaibee.structural.proxy.DocumentReaderProxy;
import fr.kaibee.structural.proxy.FsDocumentReader;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

class DocumentReaderProxyTest {

    @Test
    void nominalCase() {
        DocumentReaderProxy documentReaderProxy = new DocumentReaderProxy();
        documentReaderProxy.setFsDocumentReader(new FsDocumentReader());

//        SecurityContext.setAuthorized(true);

        documentReaderProxy.read(Path.of("/dir/toto"));


    }
}
