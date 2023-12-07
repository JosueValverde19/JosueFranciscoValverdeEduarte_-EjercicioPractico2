
package EjercicioPractico2_Josue.demo.service;

import EjercicioPractico2_Josue.demo.domain.Vuelos;
import java.util.List;
import java.util.Optional;

public interface VuelosService {
    
    //Metodos del CRUD
    public Vuelos save(Vuelos vuelos);
    public Optional<Vuelos>get(Integer id);
    public void update (Vuelos vuelos);
    public void delete(Integer id);
    public List<Vuelos> findAll();
 
}
