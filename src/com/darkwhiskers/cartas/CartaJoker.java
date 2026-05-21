/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */

package com.darkwhiskers.cartas;

public class CartaJoker extends Carta {

    private final boolean color;

    public CartaJoker(boolean color) {
        this.color = color;
    }

    @Override
    public String nombreCarta() {
        return "Joker " + (color ? "color." : "blanco y negro.");
    }
}
