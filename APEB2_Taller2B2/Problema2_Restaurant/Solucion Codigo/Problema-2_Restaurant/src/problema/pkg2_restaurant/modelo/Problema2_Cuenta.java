package problema.pkg2_restaurant.modelo;

import java.util.ArrayList;

public class Problema2_Cuenta {

    private static final double IVA = 0.15; 
    private final ArrayList<Problema2_Menu> menus = new ArrayList<>();

    public void agregarMenu(Problema2_Menu menu) {
        menu.CalcularValor();
        menus.add(menu);
    }

    /** Suma de los valores finales de todos los menus (sin IVA). */
    public double getSubtotal() {
        double subtotal = 0;
        for (Problema2_Menu menu : menus) {
            subtotal += menu.getValorf();
        }
        return subtotal;
    }

    /** Valor del IVA (15% del subtotal). */
    public double getIva() {
        return getSubtotal() * IVA;
    }

    /** Total a pagar: subtotal + IVA. */
    public double getTotal() {
        return getSubtotal() + getIva();
    }

    public ArrayList<Problema2_Menu> getMenus() {
        return menus;
    }
}
