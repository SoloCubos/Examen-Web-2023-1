package link.softbond.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity 
@Data
@Table(name = "usuario")
@Builder
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String usuario;

	private String nombre;

	private String clave;

	private String email;

	private String estado;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuariorol", 
				joinColumns = @JoinColumn(name = "usuario"), 
				inverseJoinColumns = @JoinColumn(name = "rol"))
	private Set<Rol> roles;
}