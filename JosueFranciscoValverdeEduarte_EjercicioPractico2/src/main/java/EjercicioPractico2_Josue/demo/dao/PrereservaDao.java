
package EjercicioPractico2_Josue.demo.dao;

import EjercicioPractico2_Josue.demo.domain.Prereservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrereservaDao extends JpaRepository<Prereservas, Integer>{
    
}
