package com.example.demo.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.demo.DataBaseData;
import com.example.demo.MockitoExample;

public class MokitoTest {
	@Mock
	DataBaseData db;
	
	@Before
	public void initMock() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
//		MockitoExample me=mock(MockitoExample.class);
//		System.out.println(when(me.test()).thenReturn("mocked when"));
//		assertTrue(true);
		MockitoExample mockex=new MockitoExample();
		mockex.setDb(db);
	System.out.println(	Mockito.when(mockex.DataDemo()).thenReturn(true));
		assertTrue(mockex.DataDemo());
	}

}
