package com.misaka;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
//   test add function
 public void TestAdd(){
        App app =new App();
        int re = app.add(10,20);
        Assert.assertEquals(30,re);
    }


//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
