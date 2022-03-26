package interfazFuncional;

public class Principal {


    public static void main (String[] args){


        //Mediante expresiones lambda.
        //Como el único método vacio de la interfaz funcional ICalculadoraFortuna es "calculaFortuna", la expresión lambda
        //implementa ese método.
        ICalculadoraFortuna calculadora =  (nombre1, nombre2) -> {
            return nombre1.length() + nombre2.length();
        };
        
        //System.out.println("Su fortuna está en: " + calculadora.calculaFortuna("Julio Joana Iglesias"));
        System.out.println("Su fortuna está en: " + calculadora.calcularSuerte("Julio Joana Iglesias", "Jesus Joana Azuara"));


    }
    
}
