package es.fpdual.eadmin.eadmin.modelo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TablaModulos {
	private final Integer idModulo;
	private final String nombre;
	private final Integer duracion;
	private final String curso;

	public TablaModulos(Integer idModulo, String nombre, Integer duracion, String curso) {
		super();
		this.idModulo = idModulo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.curso = curso;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public int hashCode() {
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
		
			hashCodeBuilder.append(idModulo);
			hashCodeBuilder.append(nombre);
			hashCodeBuilder.append(duracion);
			hashCodeBuilder.append(curso);
		
		return hashCodeBuilder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaModulos) {
			
			final TablaModulos param = (TablaModulos)obj;
			final EqualsBuilder equalsBuilder = new EqualsBuilder();
			
			equalsBuilder.append(this.idModulo, param.idModulo);
			equalsBuilder.append(this.nombre, param.nombre);
			equalsBuilder.append(this.duracion, param.duracion);
			equalsBuilder.append(this.curso, param.curso);
			
			return equalsBuilder.isEquals();
			
		}
		return false;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}