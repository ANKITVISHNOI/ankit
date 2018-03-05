package com.avssoftsol.dao.product;

import java.util.List;

import com.avssoftsol.entity.product.Product;

public interface ProductDao {

	public void saveProduct(Product product); 

	public List<Product> getProductList();

	public Product getProductById(Long id);

	public void updateProduct(Product productOld);

	public void deleteProduct(Long id);  

}
