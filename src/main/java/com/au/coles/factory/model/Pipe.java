package com.au.coles.factory.model;

import java.util.HashMap;
import java.util.Map;

public class Pipe extends Product {
    private Map<EngineRawMaterial, Integer> material;

    @Override
    public String getTitle() {
        return "Pipe";
    }

    @Override
    public int getProduce() {
        return 1;
    }

    @Override
    public Map<EngineRawMaterial, Integer> getRecipe() {
        material = new HashMap<EngineRawMaterial, Integer>();
        material.put(EngineRawMaterial.IRON_PLATE, 1);
        return material;
    }
}
