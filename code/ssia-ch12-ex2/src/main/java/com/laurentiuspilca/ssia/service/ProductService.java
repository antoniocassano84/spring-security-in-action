package com.laurentiuspilca.ssia.service;

import java.util.List;

import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import com.laurentiuspilca.ssia.model.Product;

@Service
public class ProductService {

    @PreFilter("filterObject.owner == authentication.name")
    public List<Product> sellProducts(List<Product> products) {
        // order products and return the ordered products list
        return products;
    }
}
