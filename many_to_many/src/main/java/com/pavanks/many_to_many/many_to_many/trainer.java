package com.pavanks.many_to_many.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class trainer {
 @Id
	int t_id;
 String name;
 @ManyToMany
 List<subject> subject;
public trainer(int t_id, String name, List<com.pavanks.many_to_many.many_to_many.subject> subject) {
	super();
	this.t_id = t_id;
	this.name = name;
	this.subject = subject;
}
public trainer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getT_id() {
	return t_id;
}
public void setT_id(int t_id) {
	this.t_id = t_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<subject> getSubject() {
	return subject;
}
public void setSubject(List<subject> subject) {
	this.subject = subject;
}
 
}