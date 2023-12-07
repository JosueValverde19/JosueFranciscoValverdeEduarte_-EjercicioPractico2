
package EjercicioPractico2_Josue.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Se dice que es una entidad y una tabla
@Entity
@Table(name = "roles")
public class Roles {
    
    //Atributos
    @Id
    //Se dice que tiene un id y se incrementa solo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero_vuelo;

    //Constructor
    public Roles(Integer id, String numero_vuelo) {
        this.id = id;
        this.numero_vuelo = numero_vuelo;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    @Override
    public String toString() {
        return "Roles{" + "id=" + id + ", numero_vuelo=" + numero_vuelo + '}';
    }

}
