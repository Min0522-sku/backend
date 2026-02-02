package day09.과제2인.model.dao;

import day09.과제2인.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao(){}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){
        return instance;
    }
    private final ArrayList<ProductDto> productList = new ArrayList<>();

}
