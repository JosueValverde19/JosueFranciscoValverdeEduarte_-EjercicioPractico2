
package EjercicioPractico2_Josue.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class ReservaController {

    @GetMapping("/compraTiquetes")
    public String create(){
        return "/administrador/compraTiquetes";//Ruta Completa
    }
    
        
     @GetMapping("/admin")
    public String admin(){
        return "/administrado/admin";
    }
    
}
