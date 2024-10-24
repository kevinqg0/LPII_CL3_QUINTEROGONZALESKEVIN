package com.CL3MEDICO.crud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CL3MEDICO.crud.modelo.ClassMedico;
import com.CL3MEDICO.crud.repositorio.IMedicoRepository;
@Service
public class ClassMedicoServicioImp implements IMedicoServicio{
	@Autowired
	private IMedicoRepository imedicorepository;
	@Override
	public void RegistrarMedico(ClassMedico clmedico) {
		//INVOCAMOS EL METODO GUARDAR
		imedicorepository.save(clmedico);
		
	}

	@Override
	public void EliminarMedico(Integer id) {
		// Invocamos El METODO ELIMINAR
		imedicorepository.deleteById(id);
		
	}

	@Override
	public List<ClassMedico> ListadoMedico() {
		// INVOCAMOS EL METODO LISTADO
		return (List<ClassMedico>)imedicorepository.findAll();
	}

	@Override
	public ClassMedico BuscarporId(Integer id) {
		//INVOCAMOS EL METODO BUSCAR POR ID
		return imedicorepository.findById(id).orElse(null);
	}

}
