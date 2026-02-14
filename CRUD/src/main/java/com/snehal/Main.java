package com.snehal;

import com.snehal.dao.ProductDAO;
import com.snehal.entity.Product;

public class Main {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        Product product = new Product(
                "Phone",
                "Android",
                "Electronics",
                10,
                20000,
                "SKU100",
                true
        );

        dao.save(product);

        dao.getAll().forEach(System.out::println);
    }
}
