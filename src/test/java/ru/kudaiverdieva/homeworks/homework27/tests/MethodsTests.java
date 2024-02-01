package ru.kudaiverdieva.homeworks.homework27.tests;

import org.junit.jupiter.api.Test;
import ru.kudaiberdieva.homeworks.homework27.MethodsApp;

import static org.junit.jupiter.api.Assertions.*;

public class MethodsTests {
    private MethodsApp methodsApp;

    @Test
    public void getNewArrayFromLastOneTest() {
        assertArrayEquals(new int[] {7, 8, 9, 10},methodsApp.getNewArrayFromLastOne(new int[] {5,4,1,6,1,7,8,9,10}));
        assertArrayEquals(new int[] {4,8,9}, methodsApp.getNewArrayFromLastOne(new int[] {2,5,1,4,8,9}));

        int[] arr1 = new int[] {2,2,2,2};
        assertThrows(RuntimeException.class, () -> {
            methodsApp.getNewArrayFromLastOne(arr1);
        });
    }
    @Test
    public void containsOneOrTwoTest() {
        assertTrue(methodsApp.containsOneOrTwo(new int[] {1,2,1,2,1}));
        assertFalse(methodsApp.containsOneOrTwo(new int[] {1,1}));
        assertFalse(methodsApp.containsOneOrTwo(new int[] {2}));
    }


}
