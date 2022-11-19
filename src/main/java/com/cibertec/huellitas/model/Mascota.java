package com.cibertec.huellitas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_mascota")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmascota;

    @OneToOne
    @JoinColumn(name = "idtipo")
    private TipoMascota tipoMascota;

    //@Column(length = 45, nullable = false)
    //private String nombre;

    @Column(length = 45, nullable = false)
    private String raza;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

}
