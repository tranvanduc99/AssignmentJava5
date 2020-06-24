package com.poly.duc.DucQuanLyQuanAO.sevice;

import com.poly.duc.DucQuanLyQuanAO.model.Product;


import java.util.List;

public interface ProductSevice {
List<Product> findAllProduct();
Product findProductById(Integer Id);
void saveProduct(Product product);
void deleteProduct(Integer Id);
}
