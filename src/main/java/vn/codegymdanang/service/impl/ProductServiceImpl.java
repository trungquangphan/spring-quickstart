package vn.codegymdanang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegymdanang.model.BaseProduct;
import vn.codegymdanang.service.ProductService;

import java.util.Arrays;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    /***
     * ProductServiceImpl is managed by Spring, then Spring is able to inject baseProduct here
     */
    @Autowired
    private BaseProduct baseProduct;

    @Override public List<String> getProducts() {
        System.out.println("Using ProductServiceImpl");
        return Arrays.asList("toyota","bmw","mercedes");
    }
}
