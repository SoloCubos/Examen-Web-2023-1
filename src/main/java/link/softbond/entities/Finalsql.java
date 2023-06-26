package link.softbond.entities;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "finalsql")
@Data
public class Finalsql implements Serializable{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idconsulta")
    private Consulta consulta;

    private String ssql;

    private LocalDate fecha;

    private String resultado;
}
