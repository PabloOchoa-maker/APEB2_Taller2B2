package problema.pkg2_restaurant.vista;

import problema.pkg2_restaurant.modelo.Problema2_Cuenta;
import problema.pkg2_restaurant.modelo.Problema2_Menu;
import problema.pkg2_restaurant.modelo.Problema2_MenuCarta;
import problema.pkg2_restaurant.modelo.Problema2_MenuDia;
import problema.pkg2_restaurant.modelo.Problema2_MenuEconomico;
import problema.pkg2_restaurant.modelo.Problema2_MenuNino;

/**
 * Vista (clase principal): crea los menus con valores predeterminados,
 * los calcula y muestra el valor inicial, el calculo y el valor final.
 *
 * @author user
 */
public class Problema2_Vista {

    public static void main(String[] args) {

        Problema2_Cuenta cuenta = new Problema2_Cuenta();

        // Menus con datos ya predeterminados (no se ingresan por teclado)
        cuenta.agregarMenu(new Problema2_MenuCarta("Lomo fino", 10.00, 3.00, 2.00));
        cuenta.agregarMenu(new Problema2_MenuDia("Almuerzo ejecutivo", 2.00, 6.00, 2.00));
        cuenta.agregarMenu(new Problema2_MenuEconomico("Combo basico", 3.00, 1.50));
        cuenta.agregarMenu(new Problema2_MenuNino("Happy plato", 3.00, 1.00, 2.00));

        System.out.println("======== CUENTA DEL RESTAURANTE ========");
        for (Problema2_Menu menu : cuenta.getMenus()) {
            System.out.println(menu);
            System.out.println("----------------------------------------");
        }
        System.out.println("SUBTOTAL:      " + cuenta.getSubtotal());
        System.out.println("IVA (15%):     " + cuenta.getIva());
        System.out.println("TOTAL A PAGAR: " + cuenta.getTotal());
    }
}
