package problema.pkg2_restaurant.modelo;

/**
 * Menu del dia: entrada + plato fuerte + postre. 10% de descuento.
 *
 * @author user
 */
public class Problema2_MenuDia extends Problema2_Menu {

    private double entrada;
    private double platoFuerte;
    private double postre;

    public Problema2_MenuDia(String nombre, double entrada, double platoFuerte, double postre) {
        super(nombre);
        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
    }

    @Override
    public double getValorInicial() {
        return entrada + platoFuerte + postre;
    }

    @Override
    public void CalcularValor() {
        valorf = getValorInicial() * 0.90;
    }

    @Override
    public String toString() {
        return "Menu del Dia: " + nombre
                + "\n  Entrada: " + entrada + " | Plato fuerte: " + platoFuerte + " | Postre: " + postre
                + "\n  Valor inicial: " + getValorInicial()
                + "\n  Calculo: " + getValorInicial() + " * 0.90 (10% descuento)"
                + "\n  Valor final: " + valorf;
    }
}
