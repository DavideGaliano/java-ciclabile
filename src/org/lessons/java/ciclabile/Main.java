package org.lessons.java.ciclabile;

public class Main {

	public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        CyclingIntegers cicli = new CyclingIntegers(numeri);

        while (cicli.hasAncoraElementi()) {
            System.out.println(cicli.getElementoSuccessivo());
        }

        cicli.addElemento(6);
        cicli.addElemento(7);

        for (int i = 0; i < 10; i++) {
            System.out.println(cicli.getElementoSuccessivo());
        }
    }


}
