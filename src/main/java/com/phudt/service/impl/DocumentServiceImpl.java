package com.phudt.service.impl;

import com.phudt.dao.DocumentDAO;
import com.phudt.entity.Asset;
import com.phudt.entity.Document;
import com.phudt.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentDAO documentDAO;

    @Override
    @Transactional
    public List<Document> getDocuments() {
        return documentDAO.getDocuments();
    }


}
