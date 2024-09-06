package com.assignment.question;

public abstract class DocumentProcessor {

    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    // Getter
    public String getDocumentName() {
        return documentName;
    }

    public abstract DocumentType supportsType();
    public abstract void processDocument();

}