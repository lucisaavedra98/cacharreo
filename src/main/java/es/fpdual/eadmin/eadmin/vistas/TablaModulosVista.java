package es.fpdual.eadmin.eadmin.vistas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import es.fpdual.eadmin.eadmin.CargarDatosIniciales;
import es.fpdual.eadmin.eadmin.EadminApplication;
import es.fpdual.eadmin.eadmin.modelo.TablaModulos;
import es.fpdual.eadmin.eadmin.repositorio.impl.RepositorioModulosImpl;
import es.fpdual.eadmin.eadmin.servicio.ServicioModulos;
import es.fpdual.eadmin.eadmin.servicio.impl.ServicioModulosImpl;

@Component
@ManagedBean
@ViewScoped
public class TablaModulosVista implements Serializable {
	private List<TablaModulos> modulos=new ArrayList<>();

	@ManagedProperty("#{ServicioModulos}")
	public ServicioModulos servicio;
	
	@Autowired
	public TablaModulosVista(ServicioModulos servicio) {
		this.servicio = servicio;
	}
	
	@PostConstruct
	public void init() {
		modulos.addAll(servicio.obtenerTodosLosDocumentos());
	}

	public List<TablaModulos> getModulos() {
		return modulos;
	}

//	public void setServicio(ServicioModulos servicio) {
//		this.servicio = servicio;
//	}

}