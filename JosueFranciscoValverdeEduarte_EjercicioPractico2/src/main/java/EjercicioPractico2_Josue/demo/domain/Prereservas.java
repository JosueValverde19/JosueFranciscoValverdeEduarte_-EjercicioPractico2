
package EjercicioPractico2_Josue.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prereserva")
public class Prereservas {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int id_vuelo;
    private int id_cliente;

    //Constructor
    public Prereservas(Integer id, int id_vuelo, int id_cliente) {
        this.id = id;
        this.id_vuelo = id_vuelo;
        this.id_cliente = id_cliente;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Prereservas{" + "id=" + id + ", id_vuelo=" + id_vuelo + ", id_cliente=" + id_cliente + '}';
    }

}
