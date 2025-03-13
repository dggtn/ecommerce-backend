package com.ecommerce.ecommerce_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String texto;

    @Column(nullable = false)
    private String rating;

    @ElementCollection
    private List<String> imagenesDelProducto;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_producto",nullable = false)
    private Producto producto ;


    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();







}
