package com.phudt.dao.impl;

import com.phudt.dao.DocumentDAO;
import com.phudt.entity.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class DocumentDAOImpl implements DocumentDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Document> getDocuments() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Document> cq = cb.createQuery(Document.class);
        Root<Document> root = cq.from(Document.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Document getDocument(int doc_id) {
        return null;
    }
}
