package demo2;

import org.junit.Assert;
import org.junit.Test;

import com.jc.Hello;

public class TestHello {
	  @Test
     public void testHello(){
    	 Hello h=new Hello();
    	 String ret=h.hello();
    	 //∂œ—‘≤‚ ‘
    	 Assert.assertEquals("hello git", ret);
     }
}
