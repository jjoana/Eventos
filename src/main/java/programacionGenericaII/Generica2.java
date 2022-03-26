package programacionGenericaII;

public class Generica2<T, V> {

    T objT;
    V objV;

    public Generica2(T objT, V objV){
        this.objT = objT;
        this.objV = objV;
    }

    public T getObjT (){
        return objT;
    }

    public V getObjV (){
        return objV;
    }

    public void setObjT (T objT){
        this.objT = objT;
    }

    public void setObjV (V objV){
        this.objV = objV;
    }

    public String toString (){
        return "Los tipos con los que está trabajando esta clase son: " + objT.getClass().getName() + "   " + objV.getClass().getName();
    }
    
}
