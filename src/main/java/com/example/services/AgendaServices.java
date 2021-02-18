package com.example.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.model.Agenda;
import com.example.repository.AgendaRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
@Service
public class AgendaServices {
	
    @Autowired
    AgendaRepositorio agendaRepositorio;
    
    public Agenda CreateAgenda(Agenda agenda) {
    	return agendaRepositorio.save(agenda);
    }
    public List getAllAgenda() {
        return agendaRepositorio.findAll();
    }
 
    public ResponseEntity<Agenda> GetByIdAgenda(int id) {
       return agendaRepositorio
          .findById(id)
          .map(record -> ResponseEntity.ok().body(record))
          .orElse(ResponseEntity.notFound().build());
         
    }
    public Optional<Agenda> GetByIdAgenda2(Integer id){
    	return agendaRepositorio.findById(id);
    	
    }
    
    // ATUALIZAR 
    public ResponseEntity<Agenda> UpdateAgenda(Integer i) {
        return agendaRepositorio
           .findById(i)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
          
     }
    // EXCLUIR 
    public ResponseEntity<?> DeleteAgenda(Integer id) {
    	
   	 return agendaRepositorio.findById(id)
   			        .map(record ->{agendaRepositorio.deleteById(id);
   			              return ResponseEntity.ok().build();
   			        })
   			        .orElse(ResponseEntity.notFound().build());
                     
   	
   }
    public void DeleteAgenda2(Integer id) {
    	 agendaRepositorio.deleteById(id);
    	
    }
   //atualizar
    public ResponseEntity<Agenda> UpdateAgenda(Integer id,Agenda Agenda) {
    	
    return agendaRepositorio.findById(id)
    	     .map(record -> {
    	    	 record.setNome(Agenda.getNome());
    	    	 record.setCep(Agenda.getCep());
    	    	 Agenda UpdateNowAgenda = agendaRepositorio.save(record);
    	    	 return ResponseEntity.ok().body(UpdateNowAgenda);
    	     }).orElse(ResponseEntity.notFound().build());
    	
    	
    }
    public void UpdateAgenda2(Agenda Agenda) {
    	
    	agendaRepositorio.save(Agenda);
    }
}
