/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaFrancesa carta1 = new CartaFrancesa(0, CartaFrancesa.COMODIN);
        CartaFrancesa carta2 = new CartaFrancesa(12, CartaFrancesa.DIAMANTES);
        CartaFrancesa carta3 = new CartaFrancesa(5, CartaFrancesa.CORAZONES);

        System.out.println("Palo de la primera Carta: " + carta1.getPalo());
        System.out.println("Palo de la segunda Carta: " + carta2.getPalo());
        System.out.println("Palo de la tercera Carta: " + carta3.getPalo() + "\n");

        System.out.println("Número de la primera Carta: " + carta1.getNumero());
        System.out.println("Número de la segunda Carta: " + carta2.getNumero());
        System.out.println("Número de la tercera Carta: " + carta3.getNumero() + "\n");
        
        System.out.println("Primera Carta: " + carta1.toString());
        System.out.println("Segunda Carta: " + carta2.toString());
        System.out.println("Tercera Carta: " + carta3.toString() + "\n");
        
        System.out.println("Código primera Carta: " + carta1.toCodigo());
        System.out.println("Código segunda Carta: " + carta2.toCodigo());
        System.out.println("Código tercera Carta: " + carta3.toCodigo());
    }
}
