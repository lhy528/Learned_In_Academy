package jUnitEx01;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitEx {
	@Test
	public void test() {
		Calculator c = new Calculator();
		
	      double result = c.sum(10, 20);
	      assertEquals(30, result, 0);
	      
	      // 단정함수 : assertEquals(p1, p2, p3)
	      // p1 : 기댓값, p2 : 결과값변수(실제값), p3 : 오차범위(허용범위)-> 시간도 가능
	      	   	     
//	      if(result != 30) {
//	          System.err.println("err: "+result);
//	       }
	       
	       result = c.sum(1.1, 2);
	       assertEquals(3.1, result,0);
	       
//	       if(result !=3.1) {
//	          System.err.println("err: "+result);
//	       }
	       
	       result = c.sum(1.1, -2);
	       assertEquals(-0.9, result, 0.01);
	       
//	       if(result != -0.9) {
//	    	   System.err.println("err: " +result); // result=-0.8999999999
//	       }
	}
}
