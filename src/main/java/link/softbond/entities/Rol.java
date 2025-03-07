package link.softbond.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="rol")
@Data
public class Rol implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    private String desccipcion;
}
