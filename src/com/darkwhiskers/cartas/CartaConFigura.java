/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.cartas;

public class CartaConFigura extends CartaConPalo {

    private final char letra;

    public CartaConFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String nombreCarta() {
        return letra + super.nombreCarta();
    }
}
