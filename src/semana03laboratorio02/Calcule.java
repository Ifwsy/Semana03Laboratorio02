package semana03laboratorio02;
public class Calcule {
    public int Calculo(Plan f,int minuto){
        return f.getCosto_mantencion()+(minuto*f.getValor_minuto());
    }
    //Contador sin arreglar
    //public int Contador(Plan f){
        //return f.getCantidad_cliente()+1;
    //}
}
