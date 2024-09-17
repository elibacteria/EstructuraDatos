package tarea6main;

public class Tarea6Main {

    public static void main(String[] args) {
        System.out.println("TAREA 6: JUEGO DE LA VIDA");
        JuegoDeLaVida celulas = new JuegoDeLaVida(10, 10);
        celulas.setCelula(1, 1, 'V');
        celulas.setCelula(1, 2, 'V');
        celulas.setCelula(2, 1, 'V');
        celulas.setCelula(2, 2, 'V');
        celulas.setCelula(3, 1, 'V');
        celulas.setCelula(4, 1, 'V');
        celulas.setCelula(3, 4, 'V');
        celulas.setCelula(4, 4, 'V');
        celulas.imprimirRejilla();
        for (int i = 0; i < 5; i++) {
            celulas.siguienteGeneracion();
            celulas.imprimirRejilla();
        }
    }
}
