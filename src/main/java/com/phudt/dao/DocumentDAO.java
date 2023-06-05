package com.phudt.dao;

import com.phudt.entity.Document;

import java.util.List;

public interface DocumentDAO {
    public List<Document> getDocuments();
    public Document getDocument(int doc_id);
}
