package com.CL3MEDICO.crud.servicio;

import java.util.List;

import com.CL3MEDICO.crud.modelo.ClassMedico;

public interface IMedicoServicio {
	public void RegistrarMedico(ClassMedico clmedico);
	public void EliminarMedico(Integer id);
	public  List<ClassMedico> ListadoMedico();
	public ClassMedico BuscarporId(Integer id);
}
