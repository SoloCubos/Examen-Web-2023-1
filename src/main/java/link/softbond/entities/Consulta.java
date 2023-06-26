package link.softbond.entities;

import java.io.Serializable;

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
@Table(name = "consulta")
public class Consulta implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idproblema")
    private Problema problema;

    private String descripcion;

    private String explicacion;

    private String solucion;

    private String explicsolucion;

    private String solucionalternativa;

    private Integer numeropracticas;

    private Integer estado;
}
