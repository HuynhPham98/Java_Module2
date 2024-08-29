package business.feature.impl;

import business.entity.Category;
import business.feature.ICategoryFeature;

import java.util.ArrayList;
import java.util.List;

public class CategoryFeatureImpl implements ICategoryFeature {

    public static List<Category> categories = new ArrayList<>();

    @Override
    public void addOrUpdate(Category category) {
        int index = findIndexByID(category.getCatalogId());
        if (index != -1) {
            categories.set(index, category);
        } else {
            categories.add(category);
        }
    }

    @Override
    public void delete(Integer id) {
        categories.remove(findIndexByID(id));
    }

    @Override
    public int findIndexByID(Integer id) {
        return categories.stream()
                .map(Category::getCatalogId).toList().indexOf(id);
    }
}
