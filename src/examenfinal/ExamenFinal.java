/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paul Granados
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Examen> listaPedidos = new ArrayList<>();

        String alimento, pregunta;
        Integer codigo, cantidad;
        Double precio;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("Ingrese el codigo");
            codigo = lector.nextInt();

            lector.nextLine();

            System.out.println("Ingrese el alimento");
            alimento = lector.nextLine();

            System.out.println("Ingrese la cantidad");
            cantidad = lector.nextInt();

            System.out.println("Ingrese el precio");
            precio = lector.nextDouble();

            lector.nextLine();

            listaPedidos.add(new Examen(codigo, alimento, cantidad, precio));

            System.out.println("Desea continuar? (si/no)");
            pregunta = lector.nextLine();

        } while (pregunta.equalsIgnoreCase("si"));
        System.out.println("\n--- RESUMEN DE PEDIDOS INGRESADOS ---");
        for (Examen pedidoVer : listaPedidos) {
            System.out.println("CODIGO:   " + pedidoVer.getCodigo());
            System.out.println("ALIMENTO: " + pedidoVer.getAlimento());
            System.out.println("CANTIDAD: " + pedidoVer.getCantidad());
            System.out.println("PRECIO: " + pedidoVer.getPrecio());
            System.out.println("TOTAL: " + pedidoVer.getTotal());
        }
    }
}
