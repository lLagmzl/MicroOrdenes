/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microordenes;

import jakarta.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 *
 * @author Carlos
 */
@Entity
public class Orden extends PanacheEntity {

    public Long productoId;

    public Orden() {
    }

    public Orden(Long productoId) {
        this.productoId = productoId;
    }
}