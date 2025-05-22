package prueba.com.prueba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.com.prueba.Model.Ventas;
import prueba.com.prueba.Repository.VentasRepository;



@Service
public class VentasService {

    @Autowired
    private VentasRepository ventasRepository;

    public List<Ventas> listarVentas() {
        return ventasRepository.findAll();
    }


    public Ventas crearVenta(Ventas venta) {
        return ventasRepository.save(venta);
    }



   
}