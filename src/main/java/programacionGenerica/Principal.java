package programacionGenerica;

public class Principal {

    public static void main (String[] Args){

        Generica1<Integer> objetoInteger;
        objetoInteger = new Generica1<Integer> (3);
        objetoInteger.setObj(125);
        System.out.println (objetoInteger);

        Generica1<String> objetoString;
        objetoString = new Generica1<String> ("Hola");
        objetoString.setObj("Adios");
        System.out.println (objetoString);

    }
    
}
