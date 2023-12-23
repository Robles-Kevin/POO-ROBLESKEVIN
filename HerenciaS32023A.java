
package herencias3.pkg2023a;

/**
 *
 * @author kevin robles
 */
import java.util.Date;

public class HerenciaS32023A {
    public static void main(String[] args) {
        // Crear instancia de Empleado
        Empleado empleado1 = new Empleado("Kevin", 5000.0);
        System.out.println("empleado1 = " + empleado1);

        // Crear instancia de Cliente
        Cliente cliente1 = new Cliente(new Date(), true, "Kevin", 'M', 23, "Quito");
        System.out.println("cliente1 = " + cliente1);
    }
}
