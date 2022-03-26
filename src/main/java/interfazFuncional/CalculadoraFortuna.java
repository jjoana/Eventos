package interfazFuncional;

public class CalculadoraFortuna implements ICalculadoraFortuna {
    
    @Override
    public int calcularSuerte (String nombre1, String nombre2){
        return nombre1.length() + nombre2.length();
    }


    
}