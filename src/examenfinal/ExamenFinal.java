
package examenfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jonathan Arana
 *
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Examen> listaPedidos = new ArrayList<>();

        String prod, pregunta;
        Integer codigo, cantidad;
        Double precio;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("Ingrese su codigo");
            codigo = lector.nextInt();

            lector.nextLine();

            System.out.println("Ingrese el producto");
            prod = lector.nextLine();

            System.out.println("Ingrese la cantidad");
            cantidad = lector.nextInt();

            System.out.println("Ingrese el precio");
            precio = lector.nextDouble();

            lector.nextLine();

            listaPedidos.add(new Examen(codigo, prod, cantidad, precio));

            System.out.println("Desea continuar? (si/no)");
            pregunta = lector.nextLine();

        } while (pregunta.equalsIgnoreCase("si"));
        System.out.println("\n--- RESUMEN DE PEDIDOS INGRESADOS ---");
        for (Examen pedidoVer : listaPedidos) {
            System.out.println("Cdigo:   " + pedidoVer.getCodigo());
            System.out.println("Prodicto: " + pedidoVer.getprod());
            System.out.println("Cantidad: " + pedidoVer.getCantidad());
            System.out.println("Precio: " + pedidoVer.getPrecio());
            System.out.println("Total: " + pedidoVer.getTotal());
        }
    }
}
