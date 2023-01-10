package demoapp.controller;

import demoapp.service.AdiosService;
import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdiosController {

    private final AdiosService service;

    @Autowired
    public AdiosController(AdiosService service) {
        this.service = service;
    }

    @RequestMapping("/adios/{nombre}")
    public @ResponseBody String adios(@PathVariable(value = "nombre") String nombre) {
        return  service.adios(nombre);
    }
}
