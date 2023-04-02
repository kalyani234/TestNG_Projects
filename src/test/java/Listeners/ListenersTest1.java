package Listeners;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenersTest1 {


    @Test
    void test1(){
        System.out.println("This is a passed test1 ");
        Assert.assertEquals("a","a");

    }

    @Test
    void test2(){
        System.out.println("This is a failed test2");
        Assert.assertEquals("a","b");

    }


    @Test
    void test3(){
        System.out.println("This is a ignored test3");
  throw new SkipException("This is to skip execution............");
    }



}