package com.bhl.ehotel.inventory.service;

import com.bhl.ehotel.inventory.model.ProductInventory;

public interface ProductInventoryService {
	
	public void add(ProductInventory productInventory);
	
	public void update(ProductInventory productInventory);
	
	public void delete(Long id);
	
	public ProductInventory findById(Long id);
	
}
