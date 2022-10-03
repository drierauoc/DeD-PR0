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
        int firstElement = 0;
        int lastElement = this.array.length - 1;
        int retVal = -1;

        int mid = (firstElement + lastElement) / 2;

        while (firstElement <= lastElement) {
            if (this.array[mid] < value_to_search) {
                firstElement = mid + 1;
            } else if (this.array[mid] == value_to_search) {
                retVal = mid;
                break;
            } else {
                lastElement = mid - 1;
            }

            mid = (firstElement + lastElement) / 2;
        }

        return retVal;
    }

}
