package com.au.coles.factory.repository;

import com.au.coles.factory.model.EngineRawMaterial;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class Inventory {

    private Map<EngineRawMaterial, Integer> inventoryList = null;

    public void loadInventory(){

    }

    public void addToInventory(){

    }

}
