package prueba.com.prueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.com.prueba.Model.Ventas;
import prueba.com.prueba.Service.VentasService;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

    @Autowired
    private VentasService ventasService;

    @PostMapping
    public Ventas crearVenta(@RequestBody Ventas venta) {
        return ventasService.crearVenta(venta);
    }

    @GetMapping
    public List<Ventas> listarVentas() {
         return ventasService.listarVentas();
}
}
