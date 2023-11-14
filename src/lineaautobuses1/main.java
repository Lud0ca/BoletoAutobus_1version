package lineaautobuses1;
//OCAMPO LOPEZ LUDWING IVAN
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class main {
   public static void main(String[] args){
        Object NumBoletos;
        boolean estudiante = false;
        LocalDateTime Ahora = LocalDateTime.now();

        try {
            String nombre = JOptionPane.showInputDialog(null,"BIENVENIDO A SU LINEA DE CONFIANZA" +"\nIngresa tu nombre",JOptionPane.QUESTION_MESSAGE);

        NumBoletos = JOptionPane.showInputDialog(null, "Selecciona el numero de boletos a comprar","Compra de boletos",
            JOptionPane.QUESTION_MESSAGE,null,new Object[] { 1, 2, 3 },1);
        int numeroDeBoletos = Integer.parseInt(NumBoletos.toString());
        int n = JOptionPane.showConfirmDialog(null, "¿Cuentas con Credencial Vigente de Estudiante?",
                    "Descuento de Estudiante", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            estudiante = true;
        } else if (n == JOptionPane.NO_OPTION) {
            estudiante = false;
        }

        Boleto boleto = new Boleto(011, 10, nombre,  "Guadalajara", "Ciudad de Mexico", Ahora, numeroDeBoletos, estudiante);
        boleto.Informacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
        }
    }
}
