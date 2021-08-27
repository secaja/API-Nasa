package apoloonce2.demo.controlador;

import apoloonce2.demo.modelo.ImagenApolo;
import apoloonce2.demo.servicio.ServicioApoloOnce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ObtenerImagenesApoloControlador {

    @Autowired
    private ServicioApoloOnce servicioApoloOnce;

    @GetMapping
    public List<ImagenApolo> obtenerImagenes(){

        return servicioApoloOnce.obtenerInformacionImagenesApoloOnce();
    }

}
