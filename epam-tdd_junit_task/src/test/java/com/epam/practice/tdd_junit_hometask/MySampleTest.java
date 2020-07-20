package com.epam.practice.tdd_junit_hometask;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySampleTest {
	
	/*
	 * TODO List
	 *1."ABCD" => "BCD" - success
	 *2."AACD" => "CD" - success
	 *3."BACD" => "BCD" - success
	 *4."BBAA" => "BBAA" - success
	 *5."AABAA" => "BAA" - success
	 *5. "" => ""        - success
	 */
	RemovingChars obj = null ;
	@BeforeEach
	public  void setup() {
		 obj = new RemovingChars();
	}
	
	@Test
	void test1() { 
		assertEquals("BCD",obj.removeChars("ABCD"));
	}
	
	
	@Test
	void test2() { 
		assertEquals("CD",obj.removeChars("AACD"));
	}
	
	@Test
	void test3() { 
		assertEquals("BCD",obj.removeChars("BACD"));
	}
	
	@Test
	void test4() { 
		assertEquals("BBAA",obj.removeChars("BBAA"));
	}
	@Test
	void test5() { 
		assertEquals("BAA",obj.removeChars("AABAA"));
	}
	
	@Test
	void test6() { 
		assertEquals("",obj.removeChars(""));
	}
	
	

}
