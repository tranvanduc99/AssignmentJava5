package com.poly.duc.DucQuanLyQuanAO.sevice;

import com.poly.duc.DucQuanLyQuanAO.model.Product;
import com.poly.duc.DucQuanLyQuanAO.reposeitory.ProductReponseitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductSeviceImpl implements ProductSevice{
    @Autowired
    ProductReponseitory productReponseitory;

    @Override
    public List<Product> findAllProduct() {
        return (List<Product>) productReponseitory.findAll();
    }

    @Override
    public Product findProductById(Integer Id) {
        return productReponseitory.findById(Id).get();
    }

    @Override
    public void saveProduct(Product product) {
    productReponseitory.save(product);
    }

    @Override
    public void deleteProduct(Integer Id) {
    productReponseitory.deleteById(Id);
    }
}

