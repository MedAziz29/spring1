package com.aziz.animateurs.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { animateur.class })
public interface ProduitProjection {
public String getNomProduit();
}