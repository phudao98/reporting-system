package com.phudt.controller;

import com.phudt.entity.Asset;
import com.phudt.entity.Document;
import com.phudt.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping("/list")
    public String listDocuments(Model model){
        List<Document> documents = documentService.getDocuments();
        model.addAttribute("documents", documents);
        return "list-documents";
    }

}
