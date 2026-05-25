package com.streaming.platform.singleton;

import java.util.ArrayList;
import java.util.List;

public class CatalogSingleton {

    private static CatalogSingleton instance;
    private List<Object> catalog = new ArrayList<>();
    private CatalogSingleton() {}

    public static synchronized CatalogSingleton getInstance() {
        if(instance == null) {
            instance = new CatalogSingleton();
        }
        return instance;
    }

    public List<Object> getCatalog() {
        return catalog;
    }
}