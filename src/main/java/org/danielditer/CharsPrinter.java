package org.danielditer;

public class CharsPrinter {

    public String printRightTriangle(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printLeftTriangle(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                sb.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printRightReversedTriangle(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printLeftReversedTriangle(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            for (int k = 2; k <= i; k++) {
                sb.append(" ");
            }
            for (int j = number; j >= i; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
