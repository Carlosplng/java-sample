package org.kaka.collection;

import org.junit.Test;

public class ExceptionDemo {


    @Test
    public void exceptionTest(){
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch (NullPointerException e){
            System.out.println("Exception...........");
        }finally {
            System.out.println("do something");
        }
    }

}
