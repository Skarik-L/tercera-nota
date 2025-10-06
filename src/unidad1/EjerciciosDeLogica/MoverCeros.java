package Unidad1.EjerciciosDeLogica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoverCeros {

    public static List<Object> moverCeros(List<Object> input) {
        List<Object> resultado = new ArrayList<>();

        for (Object elemento : input) {
            if (!(elemento instanceof Integer && (Integer) elemento == 0)) {
                resultado.add(elemento);
            }
        }

        for (Object elemento : input) {
            if (elemento instanceof Integer && (Integer) elemento == 0) {
                resultado.add(0);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Object> input = new ArrayList<>(Arrays.asList(false, 1, 0, 1, 2, 0, 1, 3, "a"));
        List<Object> resultado = moverCeros(input);
        System.out.println(resultado);
    }
}
