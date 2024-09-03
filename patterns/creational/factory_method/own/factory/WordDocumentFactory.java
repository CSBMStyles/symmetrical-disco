package patterns.creational.factory_method.own.factory;

import patterns.creational.factory_method.own.document.Document;
import patterns.creational.factory_method.own.document.WordDocument;

// WordDocumentFactory.java
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

