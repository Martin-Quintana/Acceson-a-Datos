package demoapp.controller;

import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class SaludoControllerForm {

    @Autowired
    private SaludoService service;

    @GetMapping("/saludoform")
    // Hay que declarar un parámetro con el tipo usado en el modelo del formulario (UserData)
    public String saludoForm(UserData userData) {
        return "formRegistro";
    }

    @PostMapping("/saludoform")
    public String checkPersonInfo(@ModelAttribute @Valid  UserData userData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formRegistro";
        }
        //El model se inicializa y esta vacio hasta que se le añaden atributos.


        //Al model le añadimos dos atributos mensaje y edad para que se guarden cuando sea introducidos desde el formulario
        // y el usuario le de al boton de enviar.

        //Eek formRegistro cuando se le da al boton de enviar, se llama automaticamente a saludo.html y te pone tu edad
        // y el nombre que le pusiste en el formulario.

        //Model 'mensaje'
        model.addAttribute("mensaje", service.saluda(userData.getNombre()));

        //Model 'edad'
        model.addAttribute("edad", service.edad(userData.getEdad().toString()));

        model.addAttribute("dni", service.dni(userData.getDni()));
        return "saludo";
    }
}
