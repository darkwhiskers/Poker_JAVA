/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.cartas;

public abstract class Carta {

    private boolean visible;

    public Carta() {

    }

    public void darVuelta() {
        visible = !visible;
    }

    public void mostrar() {
        if (visible) {
            System.out.println(nombreCarta());
        } else {
            System.out.println("##############");
        }
    }

    public abstract String nombreCarta();
}
