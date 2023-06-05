package com.phudt.entity;


import com.phudt.model.AssetDTO;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "asset")
//@NamedNativeQueries({
//        @NamedNativeQuery(
//                name = "callAssetStoreProcedure",
//                query = "CALL PHUDT.GET_ASSETS(:PARA)",
//                resultClass = Asset.class
//        )
//})
@NamedStoredProcedureQuery(
        name = "getAssets",
        procedureName = "GET_ASSETS",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "PARA", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "MY_CURSOR", type = void.class)
        },
        resultClasses = {Asset.class}
)
public class Asset implements Serializable {

    @Id
    @Column(name = "asset_id")
    private String assetId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "doc_id", nullable = false)
    private Document document;

    @Column(name = "company")
    private String companyName;

    @Column(name = "id")
    private String id;

    @Column(name = "gl")
    private String assetType;

    @Column(name = "ccy")
    private String curUnit;

    @Column(name = "cust_id")
    private int customerCode;

    @Column(name = "cust_name")
    private String customerName;

    @Column(name = "valid_date")
    private Date validDate;

    @Column(name = "expired_date")
    private Date expiredDate;

    @Column(name = "xau")
    private int xau;

    @Column(name = "amount_lcy")
    private int amountLCY;

    @Column(name = "amount_asset_hold")
    private int amountAssetHold;

    @Column(name = "amount_actual")
    private int amountActual;

    @Column(name = "gap_quantity")
    private int gapQuantity;

    @Column(name = "gap_amount")
    private int gapAmount;

    @Column(name = "explain_cause")
    private String reason;

    public Asset() {
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
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

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getCurUnit() {
        return curUnit;
    }

    public void setCurUnit(String curUnit) {
        this.curUnit = curUnit;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getXau() {
        return xau;
    }

    public void setXau(int xau) {
        this.xau = xau;
    }

    public int getAmountLCY() {
        return amountLCY;
    }

    public void setAmountLCY(int amountLCY) {
        this.amountLCY = amountLCY;
    }

    public int getAmountAssetHold() {
        return amountAssetHold;
    }

    public void setAmountAssetHold(int amountAssetHold) {
        this.amountAssetHold = amountAssetHold;
    }

    public int getAmountActual() {
        return amountActual;
    }

    public void setAmountActual(int amountActual) {
        this.amountActual = amountActual;
    }

    public int getGapQuantity() {
        return gapQuantity;
    }

    public void setGapQuantity(int gapQuantity) {
        this.gapQuantity = gapQuantity;
    }

    public int getGapAmount() {
        return gapAmount;
    }

    public void setGapAmount(int gapAmount) {
        this.gapAmount = gapAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "assetId='" + assetId + '\'' +
                ", document=" + document +
                ", companyName='" + companyName + '\'' +
                ", id='" + id + '\'' +
                ", assetType='" + assetType + '\'' +
                ", curUnit='" + curUnit + '\'' +
                ", customerCode=" + customerCode +
                ", customerName='" + customerName + '\'' +
                ", validDate=" + validDate +
                ", expiredDate=" + expiredDate +
                ", xau=" + xau +
                ", amountLCY=" + amountLCY +
                ", amountAssetHold=" + amountAssetHold +
                ", amountActual=" + amountActual +
                ", gapQuantity=" + gapQuantity +
                ", gapAmount=" + gapAmount +
                ", reason='" + reason + '\'' +
                '}';
    }
}

