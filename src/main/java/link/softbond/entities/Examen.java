package link.softbond.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "examen")
public class Examen implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    private String descripcion;

    @Column(name = "fechainicio")
    private LocalDate fechaInicio;

    @Column(name = "fechafin")
    private LocalDate fechaFin;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "problema")
    private Problema problema;

    private Integer cantidad;
}
