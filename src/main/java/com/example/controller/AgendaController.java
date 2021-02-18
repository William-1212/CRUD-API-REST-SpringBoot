package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;  
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.*;
import com.example.repository.*;
import com.example.services.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
@Controller
public class AgendaController {
	@Autowired
	AgendaServices agendaServices;
	
	@GetMapping("/get")
	@ResponseBody
    private List GetAllAgenda() {
    	
        return agendaServices.getAllAgenda();
    }
	@GetMapping("/get/{id}")
	@ResponseBody
    private ResponseEntity<Agenda>GetAgendaById(@PathVariable("id") int id) {
    	
        return agendaServices.GetByIdAgenda(id);
    }
	//INSERCAO DE DADOS
	@PostMapping("/post")
	@ResponseBody
    public Agenda CreateAgenda(Agenda agenda) {
    	
        return agendaServices.CreateAgenda(agenda);
    }
	//ATUALIZAR OS DADOS
	@PutMapping("/put/{id}")
	@ResponseBody
	public ResponseEntity<Agenda> UpdateAgenda(@PathVariable("id")  Integer id,Agenda Agenda) {
    	
        return agendaServices.UpdateAgenda(id,Agenda);
    }
	//DELETAR DADOS
	@DeleteMapping("/delete/{id}")
	@ResponseBody
    public ResponseEntity<?> DeleteAgenda(@PathVariable("id") Integer id) {
    	
        return agendaServices.DeleteAgenda(id);
    }
    @GetMapping("/")
    public ModelAndView ola(ModelAndView modelAndView) {
     
    	modelAndView.setViewName("valores");   	
    	
    	return modelAndView;
    }
	  


}
