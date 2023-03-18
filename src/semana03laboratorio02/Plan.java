package semana03laboratorio02;
public class Plan {
    private String nombre;
    private int costo_mantencion;
    private int valor_minuto;
    private int cantidad_cliente;
    private int minuto;

    /*public Plan(String nombre, int costo_mantencion, int valor_minuto, int cantidad_cliente) {
        this.nombre = nombre;
        this.costo_mantencion = costo_mantencion;
        this.valor_minuto = valor_minuto;
        this.cantidad_cliente = 0;
    }*/

    public Plan(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto_mantencion() {
        return costo_mantencion;
    }

    public void setCosto_mantencion(int costo_mantencion) {
        this.costo_mantencion = costo_mantencion;
    }

    public int getValor_minuto() {
        return valor_minuto;
    }

    public void setValor_minuto(int valor_minuto) {
        this.valor_minuto = valor_minuto;
    }

    public int getCantidad_cliente() {
        return cantidad_cliente;
    }

    public void setCantidad_cliente(int cantidad_cliente) {
        this.cantidad_cliente = cantidad_cliente;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
