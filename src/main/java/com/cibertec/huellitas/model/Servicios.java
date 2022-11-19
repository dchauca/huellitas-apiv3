package com.cibertec.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_servicios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idservicio;

    @Column(name="descripserv", length = 45, nullable = false)
    private String descripcion;

}
