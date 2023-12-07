
package EjercicioPractico2_Josue.demo.dao;

import EjercicioPractico2_Josue.demo.domain.Vuelos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelosDao extends JpaRepository<Vuelos, Integer>{
    
    
}

