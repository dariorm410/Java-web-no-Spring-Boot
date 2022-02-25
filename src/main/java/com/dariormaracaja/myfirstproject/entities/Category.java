package com.dariormaracaja.myfirstproject.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	@JsonIgnore
	//Este anottation que vai efetuar um pré-processamento p/ dizer
	//que nao é para serializar a lista de produtos de uma categoria
	private List<Product> products = new ArrayList<>();

	public Category() {

	}

	public Long getId() {
		return id;
	}



	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public List<Product> getProducts() {
		return products;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}