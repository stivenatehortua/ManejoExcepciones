package com.capacitacion.excepciones.personalizadas;

public class ExcepcionesPersonalizadas extends Exception {

    private final String causa;
    private final String tipoFalla;

    public ExcepcionesPersonalizadas(String causa, String tipoFalla) {
        this.causa = causa;
        this.tipoFalla = tipoFalla;
    }

    public String getCausa() {
        return causa;
    }

    public String getTipoFalla() {
        return tipoFalla;
    }
}
