package com.au.coles.factory.model;

import java.util.HashMap;
import java.util.Map;

public class CopperCable extends Product {
    private Map<EngineRawMaterial, Integer> material;

    @Override
    public String getTitle() {
        return "Copper Cable (2x)";
    }

    @Override
    public int getProduce() {
        return 2;
    }

    @Override
    public Map<EngineRawMaterial, Integer> getRecipe() {
        material = new HashMap<EngineRawMaterial, Integer>();
        material.put(EngineRawMaterial.COPPER_PLATE, 1);
        return material;
    }
}
