package problema.pkg2_restaurant.modelo;

/**
 * Clase base (abstracta) de los menus del restaurante.
 * Cada menu hijo tiene sus propios atributos y su propio calculo.
 *
 * @author user
 */
public abstract class Problema2_Menu {

    protected String nombre;
    protected double valorf; // valor final del menu

    public Problema2_Menu(String nombre) {
        this.nombre = nombre;
    }

    /** Suma de los componentes, antes de aplicar descuento. */
    public abstract double getValorInicial();

    /** Calcula el valor final segun la regla de cada menu. */
    public abstract void CalcularValor();

    public String getNombre() {
        return nombre;
    }

    public double getValorf() {
        return valorf;
    }
}
