package interfazFuncional;

@FunctionalInterface
public interface ICalculadoraFortuna {

    final int fortunaMaxima = 100;

    //Una interfaz funcional solo puede tener un único metodo abstracto.
    public int calcularSuerte (String nombre1, String nombre2);
    
    //Otros métodos
    public static int getMaximaSuertePosible(){
        return fortunaMaxima;
    }

    //Si quiero dar contenido a un métod en una interfaz, el método debe ser "default"
    public default String descripcion (){
        return "Este problema es estupido";
    }
    
}