
package EjercicioPractico2_Josue.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;


//Se dice que es una entidad y una tabla
@Entity
@Table(name = "vuelos")
public class Vuelos {
    
    //Atributos
    @Id
    //Se dice que tiene un id y se incrementa solo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String destino;
    private String numero_vuelo;
    private String lugar_salida;
    private Time hora_salida;
    private Date fecha_salida; 
    private Date fecha_llegada;
    private String modelo_avion;

    //Constructor vacio
    public Vuelos() {
    }

    //Constructor
    public Vuelos(Integer id, String numero_vuelo, String destino, String lugar_salida, Time hora_salida, Date fecha_salida, Date fecha_llegada, String modelo_avion) {
        this.id = id;
        this.numero_vuelo = numero_vuelo;
        this.destino = destino;
        this.lugar_salida = lugar_salida;
        this.hora_salida = hora_salida;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.modelo_avion = modelo_avion;
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getModelo_avion() {
        return modelo_avion;
    }

    public void setModelo_avion(String modelo_avion) {
        this.modelo_avion = modelo_avion;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "id=" + id + ", numero_vuelo=" + numero_vuelo + ", destino=" + destino + ", lugar_salida=" + lugar_salida + ", hora_salida=" + hora_salida + ", fecha_salida=" + fecha_salida + ", fecha_llegada=" + fecha_llegada + ", modelo_avion=" + modelo_avion + '}';
    }
}
