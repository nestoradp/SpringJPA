package com.example.gestioncamiones.model;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "trabajador")
@Validated
public class Trabajador implements Serializable {
       @Id
       @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
     @Column(unique = true)
     @NotNull(message = "No puede estar vacia")
     @Size(min = 11, max = 11)
    private String carnet;
    @NotNull(message = "No puede estar vacia")
    private String nombre;
    @NotNull(message = "No puede estar vacia")
    @NumberFormat
    private int a_experiencia;
    @NotNull(message = "No puede estar vacia")
    private char tipolicencia;


    public int getId() {
        return id;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public int getA_experiencia() {
        return a_experiencia;
    }

    public char getTipolicencia() {
        return tipolicencia;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setA_experiencia(int a_experiencia) {
        this.a_experiencia = a_experiencia;
    }

    public void setTipolicencia(char tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "carnet='" + carnet + '\'' +
                ", nombre='" + nombre + '\'' +
                ", a_experiencia=" + a_experiencia +
                ", tipolicencia=" + tipolicencia +
                '}';
    }
}
