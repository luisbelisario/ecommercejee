package org.belisario.repository;

import org.belisario.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBucket {

    private List<Product> productList;

    public ProductBucket() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if (productList != null && product != null) {
            productList.add(product);
        }
    }
}
