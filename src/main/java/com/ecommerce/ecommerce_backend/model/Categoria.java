package com.ecommerce.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode


public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @NotNull
    @Column(unique = true)
    private String categoriaId;
    @ManyToOne
    private Categoria categoriaPadre;
    @NotNull
    private Integer nivel;

}
