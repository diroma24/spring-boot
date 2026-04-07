package es.romadie.da2d1a.ejercicio5;

import java.time.LocalDate;

public class PrediccionDia {
    private LocalDate fecha;
    private int probabilidadPrecipitacion;
    private int tempMin;
    private int tempMax;
    private int nivelUV;

    public PrediccionDia() {}

    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setProbabilidadPrecipitacion(int probabilidadPrecipitacion) { this.probabilidadPrecipitacion = probabilidadPrecipitacion; }
    public void setTempMin(int tempMin) { this.tempMin = tempMin; }
    public void setTempMax(int tempMax) { this.tempMax = tempMax; }
    public void setNivelUV(int nivelUV) { this.nivelUV = nivelUV; }

    public LocalDate getFecha() { return fecha; }
    public int getProbabilidadPrecipitacion() { return probabilidadPrecipitacion; }
    public int getTempMin() { return tempMin; }
    public int getTempMax() { return tempMax; }
    public int getNivelUV() { return nivelUV; }

    public String getUrlImagen() {
        if (probabilidadPrecipitacion < 25) return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        if (probabilidadPrecipitacion < 50) return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        if (probabilidadPrecipitacion < 75) return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }
}