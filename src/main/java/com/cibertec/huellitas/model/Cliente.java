package com.cibertec.huellitas.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;

    @Column(length = 45, nullable = false)
    private String nombres;
    @Column(length = 45, nullable = false)
    private String apepat;
    @Column(length = 45, nullable = false)
    private String apemat;
    @Column( nullable = false)
    private int dni;
    @Column( nullable = false)
    private int telefono;


}
