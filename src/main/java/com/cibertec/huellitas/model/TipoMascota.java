package com.cibertec.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="tb_tipomascota")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoMascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipo;

    @Column(name="descripcion", length = 45, nullable = false)
    private String descripcion;

}
