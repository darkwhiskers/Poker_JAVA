package com.darkwhiskers.cartas;

public enum Palo {
    CORAZON(Color.ROJO),
    DIAMANTE(Color.ROJO),
    ESPADA(Color.NEGRO),
    TREBOL(Color.NEGRO);
    
    private final Color color;
    
    private Palo(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
