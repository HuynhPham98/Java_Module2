package business.feature.impl;

import business.entity.Product;
import business.feature.IProductFeature;

import java.util.ArrayList;
import java.util.List;

public class ProductFeatureImpl implements IProductFeature {

    public static List<Product> products = new ArrayList<>();

    @Override
    public void addOrUpdate(Product product) {
        int index = findIndexByID(product.getProductId());
        if (index != -1) {
            products.set(index, product);
        }else {
            products.add(product);
        }
    }

    @Override
    public void delete(String id) {
        products.remove(findIndexByID(id));
    }

    @Override
    public int findIndexByID(String id) {
        return products.stream().map(Product::getProductId).toList().indexOf(id);
    }
}
