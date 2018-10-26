package com.bhl.ehotel.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.inventory.mapper.ProductInventoryMapper;
import com.bhl.ehotel.inventory.model.ProductInventory;
import com.bhl.ehotel.inventory.service.ProductInventoryService;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {

	@Autowired
	private ProductInventoryMapper productInventoryMapper;
	
	public void add(ProductInventory productInventory) {
		productInventoryMapper.add(productInventory); 
	}

	public void update(ProductInventory productInventory) {
		productInventoryMapper.update(productInventory); 
	}

	public void delete(Long id) {
		productInventoryMapper.delete(id); 
	}

	public ProductInventory findById(Long id) {
		return productInventoryMapper.findById(id);
	}

}
