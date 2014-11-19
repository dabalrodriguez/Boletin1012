package boletin10;

import java.util.Random;
import javax.swing.JOptionPane;

public class Metodos {

    private int num;
    private int num2;
    private int intentos;
    private int opcion;
    Random obj2 = new Random();
    private int numero;
    private int x;
    private int diferencia;

    public void adivinarNumero() {

        do {

            String aux = JOptionPane.showInputDialog(null, "Introduzca un número entre 1 y 50: ");
            num = Integer.parseInt(aux);

        } while (!(num >= 1 && num <= 50));

        String aux2 = JOptionPane.showInputDialog(null, "Introduzca el número de intentos que le da a su contricante: ");
        intentos = Integer.parseInt(aux2);

        do {

            String aux3 = JOptionPane.showInputDialog(null, "Intente acertar el número introducido por el contrincante: ");
            num2 = Integer.parseInt(aux3);

            if (num > num2) {

                JOptionPane.showMessageDialog(null, "Es mayor");

            } else if (num < num2) {

                JOptionPane.showMessageDialog(null, "Es menor");

            } else {

                JOptionPane.showMessageDialog(null, "Acertaste");

            }

        } while (num != num2);

    }

    public void numeroAleatorioPC() {

        JOptionPane.showMessageDialog(null, "Intenta adivinar el número que pienso");

        x = (int) (obj2.nextDouble() * 51);

        do {
            String aux4 = JOptionPane.showInputDialog("Introduzca el número, suerte y haber si lo adivina");
            numero = Integer.parseInt(aux4);
            diferencia = Math.abs(x - numero);
            if (diferencia > 20) {

                JOptionPane.showMessageDialog(null, "Moi lonxe");

            } else if (diferencia >= 10 && diferencia <= 20) {

                JOptionPane.showMessageDialog(null, "Lonxe");

            } else if (diferencia < 10 && diferencia > 5) {

                JOptionPane.showMessageDialog(null, "Preto");

            } else {

                JOptionPane.showMessageDialog(null, "Moi preto");

            }
        } while (x != numero);

        JOptionPane.showMessageDialog(null, "Acertaste el número es " + x);

    }

}
