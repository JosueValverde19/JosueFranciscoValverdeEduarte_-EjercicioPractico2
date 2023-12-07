
package EjercicioPractico2_Josue.demo.dao;

import EjercicioPractico2_Josue.demo.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interface RolesDao
@Repository
public interface RolesDao extends JpaRepository<Roles, Integer>{
    
    
    
}
