package com.dariormaracaja.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.dariormaracaja.myfirstproject.entities.Product;

@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<>();
	
	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}

	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
		//map.values irá acessar todos os valor de Product
		//e vamos instanciar uma nova lista com todos esses valores
	}
}