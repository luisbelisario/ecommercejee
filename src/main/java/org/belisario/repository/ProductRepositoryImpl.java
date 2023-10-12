package org.belisario.repository;

import org.belisario.config.Repository;
import org.belisario.model.Product;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductBucket productBucket = new ProductBucket();


    @Override
    public Product save(Product product) {
        productBucket.addProduct(product);
        return product;
    }

    @Override
    public List<Product> find() {
        return productBucket.getProductList();
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> optionalProduct = productBucket
                .getProductList()
                .stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst();
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new RuntimeException("Product nor found");
        }
    }
}
