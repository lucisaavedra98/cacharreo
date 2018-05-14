package es.fpdual.eadmin.eadmin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import es.fpdual.eadmin.eadmin.modelo.TablaModulos;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioModulos;
import es.fpdual.eadmin.eadmin.servicio.ServicioModulos;

@Component
public class CargarDatosIniciales implements ApplicationRunner {

	private final ServicioModulos servicioModulo;
	
	private static final Date FECHA = new Date();
	
	@Autowired
	public CargarDatosIniciales(ServicioModulos servicioModulo) {
		this.servicioModulo =servicioModulo;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<TablaModulos> list = this.servicioModulo.obtenerTodosLosDocumentos();
		System.out.println(list.size());
		System.out.println(list.get(0));
	}
	
	

}
