
package EjercicioPractico2_Josue.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

//Se dice que es una entidad y una tabla
@Entity
@Table(name = "reserva")
public class Reserva {
        
    //Atributos
    @Id
    //Tiene un id y se incrementa solo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int id_vuelo;
    private int id_cliente;
    private Date fecha_reserva;

    //Constructor
    public Reserva(Integer id, int id_vuelo, int id_cliente, Date fecha_reserva) {
        this.id = id;
        this.id_vuelo = id_vuelo;
        this.id_cliente = id_cliente;
        this.fecha_reserva = fecha_reserva;
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

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", id_vuelo=" + id_vuelo + ", id_cliente=" + id_cliente + ", fecha_reserva=" + fecha_reserva + '}';
    }
    
}
