package cr.rh.controlador;

import cr.rh.servicio.EmpleadoServicio;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("rh-app") //http://localhost:8080/rh-app/... Contexto aplicación
@CrossOrigin
public class EmpleadoControlador {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;
}