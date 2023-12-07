
package EjercicioPractico2_Josue.demo.service.impl;

import EjercicioPractico2_Josue.demo.dao.VuelosDao;
import EjercicioPractico2_Josue.demo.domain.Vuelos;
import EjercicioPractico2_Josue.demo.service.VuelosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

//Se implementan los metodos del VuelosService
public class VuelosServiceImpl implements VuelosService{

    
    @Autowired
    private VuelosDao vuelosDao;

    //Metodo de guadar
    @Override
    public Vuelos save(Vuelos vuelos) {
        return vuelosDao.save(vuelos);
    }

    @Override
    public Optional<Vuelos> get(Integer id) {
        return vuelosDao.findById(id);
    }

    //Metodo de actualizar
    @Override
    public void update(Vuelos vuelos) {
        vuelosDao.save(vuelos);
    }

    //Metodo de eliminar
    @Override
    public void delete(Integer id) {
        vuelosDao.deleteById(id);
    }

    //Metodo de findAll
    @Override
    public List<Vuelos> findAll() {
        return vuelosDao.findAll();
    }

}
