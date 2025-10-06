package Unidad1.EjerciciosDeLogica;

public class Palindromos {
    public static boolean esPalindromo(String s) {
        if (s == null) return false;
        String limpio = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = limpio.length() - 1;
        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] casos = {
            "anita lava la tina",
            "A man, a plan, a canal: Panama",
            "racecar",
            "hola",
            ""
        };

        for (String c : casos) {
            System.out.println("\"" + c + "\"" + " -> " + esPalindromo(c));
        }
    }
}

