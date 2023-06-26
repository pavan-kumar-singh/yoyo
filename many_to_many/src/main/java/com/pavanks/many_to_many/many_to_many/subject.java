package com.pavanks.many_to_many.many_to_many;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany; 
@Entity
public class subject {
@Id
int s_id;
String s_name;
@ManyToMany
List< trainer> tlist;
public subject(int s_id, String s_name, List<trainer> tlist) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	this.tlist = tlist;
}
public subject() {
	super();
	// TODO Auto-generated constructor stub
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public List<trainer> getTlist() {
	return tlist;
}
public void setTlist(List<trainer> tlist) {
	this.tlist = tlist;
}

}