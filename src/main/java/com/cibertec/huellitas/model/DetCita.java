package com.cibertec.huellitas.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_detcita")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetCita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddetcita;

    @ManyToOne
    @JoinColumn(name = "idcita")
    private Cita cita;

    @ManyToOne
    @JoinColumn(name = "idservicio")
    private Servicios servicios;

}
