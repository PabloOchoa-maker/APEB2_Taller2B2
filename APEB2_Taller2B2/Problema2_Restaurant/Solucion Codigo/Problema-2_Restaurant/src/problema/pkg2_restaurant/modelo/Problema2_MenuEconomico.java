package problema.pkg2_restaurant.modelo;

/**
 * Menu economico: plato + bebida. 20% de descuento.
 *
 * @author user
 */
public class Problema2_MenuEconomico extends Problema2_Menu {

    private double plato;
    private double bebida;

    public Problema2_MenuEconomico(String nombre, double plato, double bebida) {
        super(nombre);
        this.plato = plato;
        this.bebida = bebida;
    }

    @Override
    public double getValorInicial() {
        return plato + bebida;
    }

    @Override
    public void CalcularValor() {
        valorf = getValorInicial() * 0.80;
    }

    @Override
    public String toString() {
        return "Menu Economico: " + nombre
                + "\n  Plato: " + plato + " | Bebida: " + bebida
                + "\n  Valor inicial: " + getValorInicial()
                + "\n  Calculo: " + getValorInicial() + " * 0.80 (20% descuento)"
                + "\n  Valor final: " + valorf;
    }
}
