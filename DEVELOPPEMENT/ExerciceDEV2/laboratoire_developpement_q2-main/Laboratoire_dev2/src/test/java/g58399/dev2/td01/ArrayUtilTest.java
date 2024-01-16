/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package g58399.dev2.td01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alecw
 */
public class ArrayUtilTest {

    public ArrayUtilTest() {
    }

    @Test
    public void testSwapGeneralCase() {
        //Arrange
        int[] array = {10, 11, 12};
        int pos1 = 0;
        int pos2 = 1;
        //Action
        ArrayUtil.swap(array, pos1, pos2);
        //Assert
        int[] expected = {11, 10, 12};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSwapOutsideArrayNegative() {
        int[] array = {10, 11, 12};
        int pos1 = -1;
        int pos2 = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtil.swap(array, pos1, pos2);
        });
    }

}
