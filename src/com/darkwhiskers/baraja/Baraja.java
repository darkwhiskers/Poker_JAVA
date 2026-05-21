/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.baraja;

import com.darkwhiskers.cartas.Carta;
import com.darkwhiskers.cartas.CartaConFigura;
import com.darkwhiskers.cartas.CartaConNumero;
import com.darkwhiskers.cartas.CartaJoker;
import com.darkwhiskers.cartas.Palo;
import java.util.ArrayList;

public final class Baraja {

    private final ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }

    public void generarCartas() {
        generarCartasJokers();
        generarCartasNumeros();
        generarCartasFiguras();
    }

    private void generarCartasJokers() {
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    }

    private void generarCartasNumeros() {
        int MIN = 2;
        int MAX = 10;
        Palo[] palos = Palo.values();
        for (Palo actual : palos) {
            for (int i = MIN; i <= MAX; i++) {
                this.cartas.add(new CartaConNumero(i, actual));
            }
        }

    }

    private void generarCartasFiguras() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();
        for (Palo actual : palos) {
            for (int i = 0; i < letras.length; i++) {
                this.cartas.add(new CartaConFigura(letras[i], actual));
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }
}
