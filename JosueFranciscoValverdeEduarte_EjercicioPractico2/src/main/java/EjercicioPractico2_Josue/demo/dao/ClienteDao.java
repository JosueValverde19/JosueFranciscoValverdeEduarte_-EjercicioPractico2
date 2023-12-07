
package EjercicioPractico2_Josue.demo.dao;

import EjercicioPractico2_Josue.demo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Integer>{
    
}
