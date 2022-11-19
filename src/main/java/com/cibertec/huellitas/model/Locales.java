package com.cibertec.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="tb_locales")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Locales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idlocal;

    @Column(name="nombreLocal", length = 45, nullable = false)
    private String nombre;


}
