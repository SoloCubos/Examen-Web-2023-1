package link.softbond.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "practica")
public class Practica implements Serializable{
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idconsulta")
    private Consulta consulta;

    private Integer ssql;

    private LocalDate fecha;

    private String resultado;

    private Integer estado;

    private String ip;
}
