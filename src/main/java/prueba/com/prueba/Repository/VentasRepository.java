package prueba.com.prueba.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prueba.com.prueba.Model.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Long> {
    
}
