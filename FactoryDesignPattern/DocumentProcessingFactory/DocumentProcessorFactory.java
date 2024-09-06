package com.assignment.question;

public class DocumentProcessorFactory {

    public static DocumentProcessor createProcessor(DocumentType type, String documentName) {
        if (type == DocumentType.TEXT) {
            return new TextDocumentProcessor(documentName);
        } else if (type == DocumentType.PRESENTATION) {
            return new PresentationDocumentProcessor(documentName);
        } else if (type == DocumentType.SPREAD_SHEET) {
            return new SpreadsheetDocumentProcessor(documentName);
        }
        return null;
    }      
}