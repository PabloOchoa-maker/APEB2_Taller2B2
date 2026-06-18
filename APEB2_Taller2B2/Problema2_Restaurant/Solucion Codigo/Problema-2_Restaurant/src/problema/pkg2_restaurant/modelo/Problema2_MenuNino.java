package problema.pkg2_restaurant.modelo;

/**
 * Menu infantil: plato + bebida + sorpresa. 50% de descuento.
 *
 * @author user
 */
public class Problema2_MenuNino extends Problema2_Menu {

    private double plato;
    private double bebida;
    private double sorpresa;

    public Problema2_MenuNino(String nombre, double plato, double bebida, double sorpresa) {
        super(nombre);
        this.plato = plato;
        this.bebida = bebida;
        this.sorpresa = sorpresa;
    }

    @Override
    public double getValorInicial() {
        return plato + bebida + sorpresa;
    }

    @Override
    public void CalcularValor() {
        valorf = getValorInicial() * 0.50;
    }

    @Override
    public String toString() {
        return "Menu Nino: " + nombre
                + "\n  Plato: " + plato + " | Bebida: " + bebida + " | Sorpresa: " + sorpresa
                + "\n  Valor inicial: " + getValorInicial()
                + "\n  Calculo: " + getValorInicial() + " * 0.50 (50% descuento)"
                + "\n  Valor final: " + valorf;
    }
}
