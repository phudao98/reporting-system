package com.phudt.service;

import com.phudt.entity.Asset;
import com.phudt.model.AssetDTO;

import java.util.List;

public interface AssetService {
    public List<Asset> getAssets();
    public List<AssetDTO> getAssetDTO();
}
