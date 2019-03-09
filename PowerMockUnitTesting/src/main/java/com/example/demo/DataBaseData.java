package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseData {
	String name="";
	int no=0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public boolean data() {
		return true;
	}
}
