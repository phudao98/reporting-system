package com.phudt.controller;


import com.phudt.entity.Asset;
import com.phudt.model.AssetDTO;
import com.phudt.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @RequestMapping("/view")
    public String listAssets(Model model){
        List<Asset> assets = assetService.getAssets();
        model.addAttribute("assets",assets);
        return "viewDocument";
    }
}
