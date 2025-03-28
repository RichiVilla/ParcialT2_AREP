package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.math.*;


public class MathServices {
    public static StringBuilder factores(int value){
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= value; i++){
            if (i<value) {
                if (value % i == 0) {
                    lista.append(i + ",");
                }
            } else {
                if (value % i == 0) {
                    lista.append(i);
                }
            }
        }
        return lista;

    }


    public static StringBuilder primos(int value){
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= value; i++){
            if (i == 1){
                lista.append(String.valueOf(i));
            }
            if (i<value) {
                ArrayList<Integer> fac = new ArrayList<Integer>();
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        fac.add(j);
                    }
                }
                    if (fac.size() == 2){
                        lista.append(i + " ");
                        lista = null;

                }
            } else {
                ArrayList<Integer> fac = new ArrayList<Integer>();
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        fac.add(j);
                    }
                }
                if (fac.size() == 2){
                    lista.append(i);
                    lista = null;
                }
            }
        }
        return lista;

    }


}
