/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microordenes;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional; 
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 * @author Carlos
 */
@Path("/ordenes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrdenResource {

    @Inject
    @RestClient
    ProductoClient productoClient;

    @POST
    @Transactional 
    public String crearOrden(Orden orden) {

        Producto p = productoClient.getProducto(orden.productoId);

        if (p == null) {
            return "Producto no existe";
        }

        orden.persist();

        return "Orden creada con producto: " + p.nombre;
    }
}