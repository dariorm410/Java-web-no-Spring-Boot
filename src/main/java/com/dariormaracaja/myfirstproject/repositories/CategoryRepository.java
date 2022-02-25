package com.dariormaracaja.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.dariormaracaja.myfirstproject.entities.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();
	
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}

	public Category findById(Long id) {
		return map.get(id);
	}

	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
		//map.values irá acessar todos os valor de Category
		//e vamos instanciar uma nova lista com todos esses valores
	}
}