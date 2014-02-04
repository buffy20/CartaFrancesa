/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class CartaFrancesa {
    //Declaración de propiedades
    //Constantes que representan los diferentes palos y el comodín
    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;
    
    private int numero;
    private int palo;

    //Método constructor
    public CartaFrancesa(int numero, int palo) {
        //Muestra un mensaje y asigna el -1 al palo y al número si los parámetros introducidos no son correctos.
        if (numero >= 0 && numero <= 12) {
            this.numero = numero;
        } else {
            this.numero = -1;
            System.out.println("Debe introducir un número del 0 al 12 para el valor de la carta.");
        }
        if (palo >= 0 && palo <= 4) {
            this.palo = palo;
        } else {
            this.palo = -1;
            System.out.println("Debe introducir un número del 0 al 4 para el palo de la carta.");
        }
    }

    //Declaración de métodos
    public int getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        String texto = "";
        switch (numero) {
            case 0:
                if (palo == COMODIN) {
                    texto += "1 ";
                } else {
                    texto += "As ";
                }
                break;
            case 1:
                texto += "1 ";
                break;
            case 2:
                texto += "2 ";
                break;
            case 3:
                texto += "3 ";
                break;
            case 4:
                texto += "4 ";
                break;
            case 5:
                texto += "5 ";
                break;
            case 6:
                texto += "6 ";
                break;
            case 7:
                texto += "7 ";
                break;
            case 8:
                texto += "8 ";
                break;
            case 9:
                texto += "9 ";
                break;
            case 10:
                texto += "J ";
                break;
            case 11:
                texto += "Q ";
                break;
            case 12:
                texto += "K ";
                break;
            default:
                texto += "Dato Incorrecto";
        }
        switch (palo) {
            case TREBOLES:
                texto += "de tréboles.";
                break;
            case DIAMANTES:
                texto += "de diamantes.";
                break;
            case CORAZONES:
                texto += "de corazones.";
                break;
            case PICAS:
                texto += "de picas.";
                break;
            case COMODIN:
                texto += "de comodín.";
                break;
            default:
                texto += "Dato Incorrecto";
        }
        return texto;
    }

    public String toCodigo() {
        String codigo = "";
        switch (palo) {
            case TREBOLES:
                codigo += "T";
                break;
            case DIAMANTES:
                codigo += "D";
                break;
            case CORAZONES:
                codigo += "C";
                break;
            case PICAS:
                codigo += "P";
                break;
            case COMODIN:
                codigo += "J";
                break;
            default:
                codigo += "Dato Incorrecto";
        }
        if(numero == 0 || numero >=10){
            codigo += numero;
        }else{
            if(numero>0 && numero<10){
                codigo += numero-1;
            }        
        }
        return codigo;
    }
}
