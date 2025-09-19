import java.util.Scanner;

public class Tres_raya {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int FILAS = 3;
        final int COLUMNAS = 3;
        String[][] tablero = new String[FILAS][COLUMNAS];

        // Inicializar el tablero vacío con espacios
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = " ";
            }
        }

        char player_1 = 'X';
        char player_2 = 'O';
        char simboloJugador = player_1;
        char simboloOtroJugador = player_2;

        // Preguntar qué jugador quiere ser
        System.out.println("¿Qué jugador quieres ser?");
        System.out.println("1. Jugador 1 (X)");
        System.out.println("2. Jugador 2 (O)");
        System.out.print("Selecciona (1 o 2): ");
        int eleccion = scanner.nextInt();

        if (eleccion == 1) {
            simboloJugador = player_1;
            simboloOtroJugador = player_2;
        } else if (eleccion == 2) {
            simboloJugador = player_2;
            simboloOtroJugador = player_1;
        } else {
            System.out.println("Opción no válida. Se te asigna el jugador 1 (X) por defecto.");
        }

        // Mostrar con qué símbolo juega cada quien
        System.out.println("Tú eres el jugador '" + simboloJugador + "'.");
        System.out.println("El otro jugador es '" + simboloOtroJugador + "'.");

        char simboloActual = player_1; // Siempre empieza el jugador X
        int turnos = 0;
        boolean juegoTerminado = false;

        do {

            // Imprimir el tablero
            for (int i = 0; i < FILAS; i++) {
                System.out.print("|");
                for (int j = 0; j < COLUMNAS; j++) {
                    System.out.print(" " + tablero[i][j] + " |");
                }
                System.out.println();
            }

            System.out.println("Turno del jugador '" + simboloActual + "'");
            System.out.print("Fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Columna (0-2): ");
            int columna = scanner.nextInt();

            // Validar casilla
            if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
                System.out.println("Posición fuera del tablero. Intenta de nuevo.");
                continue;
            }

            if (!tablero[fila][columna].equals(" ")) {
                System.out.println("Esa casilla ya está ocupada. Intenta de nuevo.");
                continue;
            }

            // Colocar símbolo
            tablero[fila][columna] = String.valueOf(simboloActual);
            turnos++;

            // Verificar si el jugador actual ganó
            if (
                // Filas
                (tablero[0][0].equals(String.valueOf(simboloActual)) && tablero[0][1].equals(String.valueOf(simboloActual)) && tablero[0][2].equals(String.valueOf(simboloActual))) ||
                (tablero[1][0].equals(String.valueOf(simboloActual)) && tablero[1][1].equals(String.valueOf(simboloActual)) && tablero[1][2].equals(String.valueOf(simboloActual))) ||
                (tablero[2][0].equals(String.valueOf(simboloActual)) && tablero[2][1].equals(String.valueOf(simboloActual)) && tablero[2][2].equals(String.valueOf(simboloActual))) ||
                // Columnas
                (tablero[0][0].equals(String.valueOf(simboloActual)) && tablero[1][0].equals(String.valueOf(simboloActual)) && tablero[2][0].equals(String.valueOf(simboloActual))) ||
                (tablero[0][1].equals(String.valueOf(simboloActual)) && tablero[1][1].equals(String.valueOf(simboloActual)) && tablero[2][1].equals(String.valueOf(simboloActual))) ||
                (tablero[0][2].equals(String.valueOf(simboloActual)) && tablero[1][2].equals(String.valueOf(simboloActual)) && tablero[2][2].equals(String.valueOf(simboloActual))) ||
                // Diagonales
                (tablero[0][0].equals(String.valueOf(simboloActual)) && tablero[1][1].equals(String.valueOf(simboloActual)) && tablero[2][2].equals(String.valueOf(simboloActual))) ||
                (tablero[0][2].equals(String.valueOf(simboloActual)) && tablero[1][1].equals(String.valueOf(simboloActual)) && tablero[2][0].equals(String.valueOf(simboloActual)))
            ) {
                // Mostrar el tablero final
                for (int i = 0; i < FILAS; i++) {
                    System.out.print("|");
                    for (int j = 0; j < COLUMNAS; j++) {
                        System.out.print(" " + tablero[i][j] + " |");
                    }
                    System.out.println();
                }

                System.out.println("¡El jugador '" + simboloActual + "' ha ganado!");
                juegoTerminado = true;
            } else if (turnos == 9) {
                System.out.println("¡Empate!");
                juegoTerminado = true;
            } else {
                // Cambiar al siguiente jugador
                if (simboloActual == player_1) {
                    simboloActual = player_2;
                } else {
                    simboloActual = player_1;
                }
            }

        } while (!juegoTerminado);

        scanner.close();
    }
}
