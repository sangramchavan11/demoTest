package com.jpa.test.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {

    @Id
	private int CatogoryId;
	private String Name;

	public int getCatogoryId() {
		return CatogoryId;
	}
	public void setCatogoryId(int catogoryId) {
		CatogoryId = catogoryId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
