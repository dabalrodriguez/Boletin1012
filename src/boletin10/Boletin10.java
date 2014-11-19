package boletin10;

import java.util.Random;
import javax.swing.JOptionPane;

public class Boletin10 {

    public static void main(String[] args) {

        int opcion = 0;

        Metodos obj = new Metodos();

       String aux5 =  JOptionPane.showInputDialog(null, "Contra quien desea jugar: \n1 - Persona \n2 - Máquina");
       opcion = Integer.parseInt(aux5);
       
        switch (opcion) {
            case 1:

                obj.adivinarNumero();
                
                break;

            case 2:

                obj.numeroAleatorioPC();

                break;

                
                
        }

    }

}
