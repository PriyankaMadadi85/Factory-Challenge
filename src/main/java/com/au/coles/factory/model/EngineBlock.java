package com.au.coles.factory.model;

import java.util.HashMap;
import java.util.Map;

public class EngineBlock extends Product {
    private Map<EngineRawMaterial, Integer> material;

    @Override
    public String getTitle() {
        return "Engine Block";
    }


    @Override
    public int getProduce() {
        return 1;
    }

    @Override
    public Map<EngineRawMaterial, Integer> getRecipe() {
        material = new HashMap<EngineRawMaterial, Integer>();
        material.put(EngineRawMaterial.STEEL_PLATE, 1);
        material.put(EngineRawMaterial.IRON_GEAR, 1);
        material.put(EngineRawMaterial.PIPE, 2);
        return material;
    }
}
