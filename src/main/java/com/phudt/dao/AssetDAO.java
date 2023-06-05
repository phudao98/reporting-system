package com.phudt.dao;

import com.phudt.entity.Asset;
import com.phudt.model.AssetDTO;

import java.util.List;

public interface AssetDAO {
    public List<Asset> getAssets();
    public List<AssetDTO> getAssetsDTO();
}
