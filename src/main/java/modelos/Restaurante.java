package modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Restaurante {

    private String nombre;
    private String localizacion;
    private Integer mesas;
    private Double dimensiones;
    private Integer num_trabajadores;
    private LocalTime hora_apertura;
    private LocalTime hora_cierre;
    private Boolean mercancia;
    private Double aforo;

    public Restaurante(String nombre, String localizacion, Integer mesas, Double dimensiones, Integer num_trabajadores, LocalTime hora_apertura, LocalTime hora_cierre, Boolean mercancia, Double aforo) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.mesas = mesas;
        this.dimensiones = dimensiones;
        this.num_trabajadores = num_trabajadores;
        this.hora_apertura = hora_apertura;
        this.hora_cierre = hora_cierre;
        this.mercancia = mercancia;
        this.aforo = aforo;
    }

    public Restaurante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Integer getMesas() {
        return mesas;
    }

    public void setMesas(Integer mesas) {
        this.mesas = mesas;
    }

    public Double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Integer getNum_trabajadores() {
        return num_trabajadores;
    }

    public void setNum_trabajadores(Integer num_trabajadores) {
        this.num_trabajadores = num_trabajadores;
    }

    public LocalTime getHora_apertura() {
        return hora_apertura;
    }

    public void setHora_apertura(LocalTime hora_apertura) {
        this.hora_apertura = hora_apertura;
    }

    public LocalTime getHora_cierre() {
        return hora_cierre;
    }

    public void setHora_cierre(LocalTime hora_cierre) {
        this.hora_cierre = hora_cierre;
    }

    public Boolean getMercancia() {
        return mercancia;
    }

    public void setMercancia(Boolean mercancia) {
        this.mercancia = mercancia;
    }

    public Double getAforo() {
        return aforo;
    }

    public void setAforo(Double aforo) {
        this.aforo = aforo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(localizacion, that.localizacion) && Objects.equals(mesas, that.mesas) && Objects.equals(dimensiones, that.dimensiones) && Objects.equals(num_trabajadores, that.num_trabajadores) && Objects.equals(hora_apertura, that.hora_apertura) && Objects.equals(hora_cierre, that.hora_cierre) && Objects.equals(mercancia, that.mercancia) && Objects.equals(aforo, that.aforo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, localizacion, mesas, dimensiones, num_trabajadores, hora_apertura, hora_cierre, mercancia, aforo);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre= " + nombre +
                ", localizacion= " + localizacion +
                ", mesas= " + mesas +
                ", dimensiones= " + dimensiones +
                ", num_trabajadores= " + num_trabajadores +
                ", hora_apertura= " + hora_apertura +
                ", hora_cierre= " + hora_cierre +
                ", mercancia= " + mercancia +
                ", aforo= " + aforo +
                '}';
    }
}
