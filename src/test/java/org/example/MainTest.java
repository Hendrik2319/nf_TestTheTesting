package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void return5_whenCalcSum_gets3And2() {
        // Given
        int a = 3;
        int b = 2;
        // When
        int actual = Main.calcSum( a, b );
        // Then
        int expected = 5;
        assertEquals( expected, actual );
    }
    @Test
    void returnFalse_whenIsEven_getsOddValue() {
        // Given
        int a = 3;
        // When
        boolean actual = Main.isEven( a );
        // Then
        assertFalse( actual );
    }
    @Test
    void returnTrue_whenIsEven_getsEvenValue() {
        // Given
        int a = 2;
        // When
        boolean actual = Main.isEven( a );
        // Then
        assertTrue( actual );
    }
    @Test
    void returnTrue_whenIsEven_getsZero() {
        // Given
        int a = 0;
        // When
        boolean actual = Main.isEven( a );
        // Then
        assertTrue( actual );
    }
    @Test
    void return6_whenCalcProd_gets3And2() {
        // Given
        int a = 3;
        int b = 2;
        // When
        int actual = Main.calcProd( a, b );
        // Then
        int expected = 6;
        assertEquals( expected, actual );
    }
    @Test
    void returnUpperCaseValue_whenToUpperCase_getsAString() {
        // Given
        String str = "NeueFische";
        // When
        String actual = Main.toUpperCase( str );
        // Then
        String expected = "NEUEFISCHE";
        assertEquals( expected, actual );
    }
    @Test
    void returnTrue_whenIsPos_getsAPositiveValue() {
        // Given
        int a = 3;
        // When
        boolean actual = Main.isPos( a );
        // Then
        assertTrue( actual );
    }
    @Test
    void returnFalse_whenIsPos_getsZero() {
        // Given
        int a = 0;
        // When
        boolean actual = Main.isPos( a );
        // Then
        assertFalse( actual );
    }
    @Test
    void returnFalse_whenIsPos_getsANegativeValue() {
        // Given
        int a = -13;
        // When
        boolean actual = Main.isPos( a );
        // Then
        assertFalse( actual );
    }
}