package programacionGenericaII;

public class Generica3<T extends Integer> {

    T objT;

    public Generica3 (T objT){
        this.objT = objT;
    }

    public Integer claculaResto (T objT){
        return Math.floorDiv(objT, 3);
    }
    
}
