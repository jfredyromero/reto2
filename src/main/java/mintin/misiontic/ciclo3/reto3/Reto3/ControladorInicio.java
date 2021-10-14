/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintin.misiontic.ciclo3.reto3.Reto3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */

@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje = "Mensaje enviado desde el controlador";
        modelo.addAttribute("mensaje", mensaje);
        log.info("Ejecutando el controlador Inicio");
        return "index";
    }
}
