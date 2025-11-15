
package examenfinal;

/**
 *
 * @author Jonathan Arana
 */
public class Examen {
   private Integer codigo;
    private String prod;
    private Integer cantidad;
    private Double precio;
    private Double total;

    public Examen(Integer codigo, String prod, Integer cantidad, Double precio) {
        this.codigo = codigo;
        this.prod = prod;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getprod() {
        return prod;
    }

    public void setprod(String alimento) {
        this.prod = prod;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
        this.total = this.cantidad * this.precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
        this.total = this.cantidad * this.precio;
    }

    public Double getTotal() {
        return total;
    }
}