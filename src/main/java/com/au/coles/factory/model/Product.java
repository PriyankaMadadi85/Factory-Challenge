package com.au.coles.factory.model;

import java.util.Map;

public abstract class Product {
    private String title;
    private int produce;
    private Map<EngineRawMaterial, Integer> material;

    public abstract String getTitle();

    public abstract int getProduce();

    public abstract Map<EngineRawMaterial, Integer> getRecipe();



}
