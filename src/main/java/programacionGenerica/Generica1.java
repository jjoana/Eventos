package programacionGenerica;

public class Generica1<T> {

    //T es el parámetro genérico de la clase Generica
    private T obj;

    public Generica1 (T o){
        obj = o;
    }

    public T getObj (){
        return obj;
    }

    public void setObj (T o){
        obj = o;
    }

    public String toString (){
        return "El tipo de T es: " + obj.getClass().getName() + ". El valor del objeto es: " + obj;
    }
}
