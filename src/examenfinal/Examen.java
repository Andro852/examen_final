/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;

/**
 *
 * @author Paul Granados
 */
public class Examen {
   private Integer codigo;
    private String alimento;
    private Integer cantidad;
    private Double precio;
    private Double total;

    public Examen(Integer codigo, String alimento, Integer cantidad, Double precio) {
        this.codigo = codigo;
        this.alimento = alimento;
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

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
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