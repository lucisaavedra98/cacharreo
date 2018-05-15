package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.eadmin.eadmin.modelo.TablaModulos;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioModulos;
import es.fpdual.eadmin.eadmin.servicio.ServicioModulos;

@Service
@ManagedBean
@ApplicationScoped
public class ServicioModulosImpl implements ServicioModulos {

	@ManagedProperty("#{RepositorioModulos}")
	public RepositorioModulos repositorioDocumento;
	
	@Autowired
	public ServicioModulosImpl (RepositorioModulos repositorioDocumento) {
		this.repositorioDocumento = repositorioDocumento;
	}

	@Override
	public List<TablaModulos> obtenerTodosLosDocumentos() {
		return repositorioDocumento.obtenerTodosLosDocumentos();
	}

}
