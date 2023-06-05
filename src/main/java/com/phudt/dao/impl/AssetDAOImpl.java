package com.phudt.dao.impl;

import com.phudt.dao.AssetDAO;
import com.phudt.entity.Asset;
import com.phudt.model.AssetDTO;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;


@Repository
@Transactional
public class AssetDAOImpl implements AssetDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Asset> getAssets() {
        Session session = sessionFactory.getCurrentSession();
        StoredProcedureQuery query = session.createNamedStoredProcedureQuery("getAssets");
        query.setParameter("PARA","mb02_cn01");
        query.execute();
        List<Asset> assetList = query.getResultList();
//        List<Asset> assetList =  assetDTOList.stream().map(assetDTO -> {
//            Asset asset = new Asset();
//            asset.setAssetId(assetDTO.getAssetId());
//            asset.setCompanyName(assetDTO.getCompanyName());
//            asset.setId(assetDTO.getId());
//            asset.setAssetType(assetDTO.getGl());
//            asset.setCustomerName(assetDTO.getCus_name());
//            asset.setXau(assetDTO.getXau());
//            return asset;
//        }).collect(Collectors.toList());
        return assetList;
    }

    @Override
    public List<AssetDTO> getAssetsDTO() {
//        Session session = sessionFactory.getCurrentSession();
//        StoredProcedureQuery query = session.createStoredProcedureQuery("GET_ASSETS", AssetDTO.class);
//        query.registerStoredProcedureParameter("PARA", String.class, ParameterMode.IN);
//        query.registerStoredProcedureParameter("MY_CURSOR", void.class,ParameterMode.REF_CURSOR);
//        query.setParameter("PARA","mb02_cn01");
//        query.execute();
//        List<AssetDTO> assetDTOList = query.getResultList();
////        List<Asset> assetList =  assetDTOList.stream().map(assetDTO -> {
////            Asset asset = new Asset();
////            asset.setAssetId(assetDTO.getAssetId());
////            asset.setCompanyName(assetDTO.getCompanyName());
////            asset.setId(assetDTO.getId());
////            asset.setAssetType(assetDTO.getGl());
////            asset.setCustomerName(assetDTO.getCus_name());
////            asset.setXau(assetDTO.getXau());
////            return asset;
////        }).collect(Collectors.toList());
        return null;
    }

}
