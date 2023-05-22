package org.danielditer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharsPrinterTest {

    @Test
    public void printTriangleValidIntegerInput() {
        CharsPrinter printer = new CharsPrinter();
        String expected = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********\n***********\n************\n";
        assertEquals(expected, printer.printRightTriangle(12));
    }
}