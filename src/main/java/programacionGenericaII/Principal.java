package programacionGenericaII;

public class Principal {

    public static void main (String[] args){

        Generica2<String, Integer> objetoGenerico2 = new Generica2<String,Integer>("objT", 5);
        objetoGenerico2.setObjT("Julio");
        objetoGenerico2.setObjV(20);
        System.out.println(objetoGenerico2);
    }
    
}
