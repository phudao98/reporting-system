package com.phudt.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "doc_type")
    private String docType;

    @Column(name = "doc_name")
    private String docName;

    @Column(name = "branch")
    private String branch;

    @Column(name = "period")
    private String period;

    @Column(name = "performer")
    private String performer;

    @Column(name = "doc_status")
    private String docStatus;

    @Column(name = "business_key")
    private String businessKey;

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Asset> assets;

    public void setId(String id) {
        this.id = id;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Document() {
    }

    public String getId() {
        return id;
    }


    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", docType='" + docType + '\'' +
                ", docName='" + docName + '\'' +
                ", branch='" + branch + '\'' +
                ", period='" + period + '\'' +
                ", performer='" + performer + '\'' +
                ", docStatus='" + docStatus + '\'' +
                ", businessKey='" + businessKey + '\'' +
                '}';
    }
}

