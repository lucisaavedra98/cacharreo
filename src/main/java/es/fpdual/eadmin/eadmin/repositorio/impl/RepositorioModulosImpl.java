package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.*;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import es.fpdual.eadmin.eadmin.mapper.*;
import es.fpdual.eadmin.eadmin.modelo.*;
import es.fpdual.eadmin.eadmin.repositorio.*;

@Repository
@ManagedBean
@ApplicationScoped
public class RepositorioModulosImpl implements RepositorioModulos {

    private ModuloMapper mapper;

    @Autowired
    public RepositorioModulosImpl(ModuloMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<TablaModulos> obtenerTodosLosDocumentos() {
        return this.mapper.seleccionarTodosLosDocumentos();
    }

}
