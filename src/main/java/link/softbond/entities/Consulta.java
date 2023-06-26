package link.softbond.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "consulta")
public class Consulta implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

    
}
