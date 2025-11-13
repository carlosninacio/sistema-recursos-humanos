package cr.rh.controlador;

import cr.rh.modelo.Empleado;
import cr.rh.servicio.EmpleadoServicio;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rh-app") //http://localhost:8080/rh-app/... Contexto aplicación
@CrossOrigin
public class EmpleadoControlador {
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;

    // http://localhost:8080/rh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {
        var empleados = empleadoServicio.listarEmpleados();
        empleados.forEach(empleado -> logger.info(empleado.toString()));
        return empleados;
    }
}