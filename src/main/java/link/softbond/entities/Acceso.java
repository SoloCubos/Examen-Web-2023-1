package link.softbond.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "accesos")
public class Acceso implements Serializable{
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    private Integer usuario;

    private LocalDate fecha;

    private String ip;
}
