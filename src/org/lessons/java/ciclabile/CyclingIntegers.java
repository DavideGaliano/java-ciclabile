package org.lessons.java.ciclabile;

public class CyclingIntegers {
    private int[] elenco;
    private int indiceCorrente;
    private int dimensione;

    // Costruttore che prende un array di interi
    public CyclingIntegers(int[] elenco) {
        this.elenco = elenco;
        this.indiceCorrente = 0;
        this.dimensione = elenco.length;
    }

    // Costruttore senza parametri
    public CyclingIntegers() {
        this.elenco = new int[0];
        this.indiceCorrente = 0;
        this.dimensione = 0;
    }

    // Metodo che restituisce il prossimo elemento
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int elemento = elenco[indiceCorrente];
            indiceCorrente = (indiceCorrente + 1) % dimensione;
            return elemento;
        } else {
            throw new IndexOutOfBoundsException("Non ci sono più elementi nell'elenco.");
        }
    }

    // Metodo che verifica se ci sono ancora elementi
    public boolean hasAncoraElementi() {
        return dimensione > 0;
    }

    // Metodo che permette di aggiungere un nuovo elemento all'elenco
    public void addElemento(int nuovoElemento) {
        int[] nuovoElenco = new int[dimensione + 1];
        System.arraycopy(elenco, 0, nuovoElenco, 0, dimensione);
        nuovoElenco[dimensione] = nuovoElemento;
        elenco = nuovoElenco;
        dimensione++;
    }
}