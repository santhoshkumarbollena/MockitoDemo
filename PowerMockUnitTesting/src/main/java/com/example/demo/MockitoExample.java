package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class MockitoExample {
	
	DataBaseData db;
	
	
	public DataBaseData getDb() {
		return db;
	}


	public void setDb(DataBaseData db) {
		this.db = db;
	}

	public boolean DataDemo() {
		return db.data();
	}
	
	public Boolean test() {
		System.out.println("test()");
		System.out.println(db.data());
		return db.data();
	}
}
