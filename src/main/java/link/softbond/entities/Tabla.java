package link.softbond.entities;

import java.io.Serializable;

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
@Table(name = "tabla")
public class Tabla implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    private String nombre;

    private String descripcion;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idproblema")
    private Problema problema;
}
