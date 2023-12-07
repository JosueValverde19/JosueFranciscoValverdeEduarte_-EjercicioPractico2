
package EjercicioPractico2_Josue.demo.controller;

import EjercicioPractico2_Josue.demo.dao.VuelosDao;
import EjercicioPractico2_Josue.demo.domain.Vuelos;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/vuelos")
public class VuelosController {

    private final VuelosDao vuelosDao;

    public VuelosController(VuelosDao vuelosDao) {
        this.vuelosDao = vuelosDao;
    }

    @GetMapping("/Vuelos")
    public String vuelos(Model model) {
        List<Vuelos> vuelosList = vuelosDao.findAll();
        model.addAttribute("vuelos", vuelosList);
        return "vuelos/Vuelos";
    }

    
}


