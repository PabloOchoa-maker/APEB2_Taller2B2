package problema.pkg2_restaurant.modelo;

/**
 * Menu a la carta: plato + guarnicion + bebida. Sin descuento.
 *
 * @author user
 */
public class Problema2_MenuCarta extends Problema2_Menu {

    private double plato;
    private double guarnicion;
    private double bebida;

    public Problema2_MenuCarta(String nombre, double plato, double guarnicion, double bebida) {
        super(nombre);
        this.plato = plato;
        this.guarnicion = guarnicion;
        this.bebida = bebida;
    }

    @Override
    public double getValorInicial() {
        return plato + guarnicion + bebida;
    }

    @Override
    public void CalcularValor() {
        valorf = getValorInicial(); // sin descuento
    }

    @Override
    public String toString() {
        return "Menu a la Carta: " + nombre
                + "\n  Plato: " + plato + " | Guarnicion: " + guarnicion + " | Bebida: " + bebida
                + "\n  Valor inicial: " + getValorInicial()
                + "\n  Calculo: " + getValorInicial() + " (sin descuento)"
                + "\n  Valor final: " + valorf;
    }
}
