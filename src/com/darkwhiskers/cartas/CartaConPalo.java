/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.cartas;

public class CartaConPalo extends Carta {
    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }
    
    @Override
    public String nombreCarta(){
        return " de " + getPalo().name() + " " + nombreColor();
    }
    
    public String nombreColor(){
        return getPalo().getColor().name();
    }
    
}
