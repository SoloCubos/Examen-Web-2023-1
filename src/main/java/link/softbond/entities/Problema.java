package link.softbond.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "problema")
public class Problema implements Serializable{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    private String nombre;

    private String descripcion;

    private String docente;

    private Integer estado;

    @Column(name = "nombrebase")
    private String nombreBase;

}
