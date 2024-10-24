package com.CL3MEDICO.crud.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CL3MEDICO.crud.modelo.ClassMedico;
import com.CL3MEDICO.crud.servicio.IMedicoServicio;

@Controller
@RequestMapping("/VISTAS")
public class MedicoController {
	//Inyeccion de depenedicas
		@Autowired
		private IMedicoServicio imedicoservicio;
		@GetMapping("ListadoMedicos")
		public String ListadoMedico(Model modelo) {
			//RECUPERAMOS LOS DATOS DE LA BD
			List<ClassMedico> listado=imedicoservicio.ListadoMedico();
			//ENVIAMOS HACIA LA VISTA
			modelo.addAttribute("listado",listado);
			//RETORNAMOS
			return "/VISTAS/ListadoMedicos";
			}//FIN DEL METODO LISTAR
		
		//CREAMOS METODO PARA REGISTRAR DATOS	
		@GetMapping("/RegistrarMedico")

		   public String RegistrarMedico(Model modelo) {

			   //realizamos la respectiva instancia..

			   ClassMedico clmedico=new ClassMedico();

			   //enviamos hacia la vista

			   modelo.addAttribute("regmedico",clmedico);

			   //retornamos

			   return "VISTAS/FrmRegistrarMedico";

		   }  //fin del metodo registrar...
		
		//REALIZAMOS EL MAPEO 
		
		@PostMapping("/GuardarMedico")
		public String GuardarProducto(@ModelAttribute ClassMedico clmedico,Model modelo) {
			imedicoservicio.RegistrarMedico(clmedico);
			//EMITIMOS MENSAJE POR CONSOLA
			System.out.println("Datos registrados en bd");
			//Retornamos el listado
			return "redirect:/VISTAS/ListadoMedicos";
		}
		//Fin del metodo GUARDAR
		
		//CREAMOS EL METODO EDITAR
		@GetMapping("/editarmedico/{id}")
		public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
		    ClassMedico clmedico = imedicoservicio.BuscarporId(idmedico);
		    modelo.addAttribute("regmedico", clmedico);
		    // En lugar de redirect, simplemente retornamos la vista
		    return "VISTAS/FrmRegistrarMedico";
		}
		@GetMapping("/eliminarmedico/{idmedico}")
		public String eliminar(@PathVariable("idmedico") Integer idmedico, Model modelo) {
		    // Aplicamos la inyección de dependencias
		    imedicoservicio.EliminarMedico(idmedico);
		    
		    // Actualizar el listado
		    List<ClassMedico> listado = imedicoservicio.ListadoMedico();
		    modelo.addAttribute("listado", listado);
		    
		    // Return
		    return "redirect:/VISTAS/ListadoMedicos";
		} // FIN DEL METODO ELIMINAR

}
