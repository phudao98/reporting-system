package com.phudt.service.impl;

import com.phudt.dao.AssetDAO;
import com.phudt.entity.Asset;
import com.phudt.model.AssetDTO;
import com.phudt.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetDAO assetDAO;

    @Override
    @Transactional
    public List<Asset> getAssets() {
        return assetDAO.getAssets() ;
    }

    @Override
    public List<AssetDTO> getAssetDTO() {
        return assetDAO.getAssetsDTO();
    }
}
