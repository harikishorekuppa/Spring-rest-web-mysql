package com.harikishore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "system_test")
public class SystemTest {

	private String name;
	private String lastaudit;
	public String getLastaudit() {
		return lastaudit;
	}
	public void setLastaudit(String string) {
		this.lastaudit = string;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id+" | " + name+ " | "+ lastaudit;
	}
	
}
