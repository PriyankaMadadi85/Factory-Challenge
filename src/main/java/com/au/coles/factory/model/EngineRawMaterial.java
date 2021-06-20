package com.au.coles.factory.model;

public enum EngineRawMaterial {

    IRON_PLATE(0),
    IRON_GEAR(0),
    COPPER_PLATE(0),
    COPPER_CABLE(0),
    LUBRICANT(0),
    STEEL_PLATE(1),
    PIPE(1),
    ENGINE_BLOCK(1),
    ELECTRIC_CIRCUIT(1),
    ENGINE(1);


    private int simple;

    public int getMaterialType() {
        return simple;
    }

    EngineRawMaterial(int simple) {
        this.simple = simple;
    }


}
