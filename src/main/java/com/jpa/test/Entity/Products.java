package com.jpa.test.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Products {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int  id;
private String procuctName;
@OneToMany(targetEntity =Category.class,cascade = CascadeType.ALL )
private List< Category> category;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProcuctName() {
	return procuctName;
}
public void setProcuctName(String procuctName) {
	this.procuctName = procuctName;
}
public List<Category> getCategory() {
	return category;
}
public void setCategory(List<Category> category) {
	this.category = category;
}

}
