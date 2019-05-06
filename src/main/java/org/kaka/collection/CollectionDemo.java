package org.kaka.collection;

import org.junit.Test;

public class CollectionDemo {

    @Test
    public  void ArrayDemo() {
        int[] array = {1, 2, 3, 5, 9};

        for (int a : array) {
            System.out.println(a);
        }
    }
}
