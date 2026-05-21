/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.cartas;

public class CartaConNumero extends CartaConPalo {

    private final int numero;

    public CartaConNumero(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }

    @Override
    public String nombreCarta() {
        return numero + super.nombreCarta();
    }
}
