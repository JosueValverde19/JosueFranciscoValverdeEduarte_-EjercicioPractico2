
package EjercicioPractico2_Josue.demo.dao;

import EjercicioPractico2_Josue.demo.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaDao extends JpaRepository<Reserva, Integer>{
    
    
    
}
