package edu.uoc.ds.adt;

import java.util.Arrays;

public class PR0Array {

    public final int CAPACITY = 50;

    private final int[] array;

    public PR0Array() {
        array = new int[CAPACITY];

        // Utilitzem fácilment Arrays.setAll amb una funció d'inicialització
        // que simplement multiplica per dos la posició que li toca inicialitzar.
        Arrays.setAll(array, p -> p * 2);
    }

    public int[] getArray() {
        return this.array;
    }

    public int getIndexOf(int value_to_search) {
        int retVal = -1; // Assumim que no l'hem trobat

        for (int p=0; p<this.array.length; p++) {
            if (this.array[p] == value_to_search) {
                retVal = p;
                break; // Ja no busquem més.
            }
        }

        return retVal;
    }

    public int binarySearch(int value_to_search) {
        int retVal = java.util.Arrays.binarySearch(this.array, value_to_search);

        return retVal < 0 ? -1 : retVal;
    }

}
