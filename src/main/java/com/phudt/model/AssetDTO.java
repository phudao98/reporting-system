package com.phudt.model;

public class AssetDTO {
    private String assetId;
    private String companyName;
    private String id;
    private String gl;
    private String cus_name;
    private int xau;

    public AssetDTO() {
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGl() {
        return gl;
    }

    public void setGl(String gl) {
        this.gl = gl;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public int getXau() {
        return xau;
    }

    public void setXau(int xau) {
        this.xau = xau;
    }
}
