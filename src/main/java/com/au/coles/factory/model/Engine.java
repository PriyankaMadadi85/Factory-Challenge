package com.au.coles.factory.model;

import java.util.HashMap;
import java.util.Map;

public class Engine extends Product {
    private Map<EngineRawMaterial, Integer> material;
    private int produce;

    @Override
    public String getTitle() {
        return "Electric Engine";
    }

    @Override
    public Map<EngineRawMaterial, Integer> getRecipe() {
        material = new HashMap<EngineRawMaterial, Integer>();
        material.put(EngineRawMaterial.ELECTRIC_CIRCUIT, 2);
        material.put(EngineRawMaterial.ENGINE_BLOCK, 1);
        material.put(EngineRawMaterial.LUBRICANT, 15);
        return material;
    }

    @Override
    public int getProduce() {
        return 1;
    }
}
