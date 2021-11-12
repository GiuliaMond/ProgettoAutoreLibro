package node.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;

import lombok.extern.slf4j.Slf4j;
import node.entity.AutoreEntity;
import node.model.AutoreDto;
import node.repository.AutoreRepository;
import node.service.AutoreService;


@RestController
@Slf4j
@RequestMapping("/autori")
public class AutoreController {

	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	AutoreService autoreService;
	
	@GetMapping(value="/helloWorld")
	public ResponseEntity<String> gethelloWorld(){

		return ResponseEntity.ok().body("Hello World");
	}
	
	
	// JEE STYLE CON EJB
	// creare il metodo per ottenere TUTTI i gatti
	//@GET
	//@Produces(MediaType.APPLICATION_JSON) //formato di dato
	//@Path("allGatti") //variabile {}
	
	// SPRING
	/**
	 * Get list of roles
	 * @return list of Ruoli existing on DB
	 */
	@GetMapping("/getListAutori")
	public ResponseEntity<List<AutoreDto>> getListAutori() {
		//log.info("getListRuoli - START");
		List<AutoreDto> response = autoreService.getAllAutori();
		//log.info("getListRuoli - response of count : {}", response.size());
		
		
		/*return Optional
				.ofNullable(response)
				.map( list -> ResponseEntity.ok().body(list))  
				.orElseGet( () -> ResponseEntity.notFound().build() );
		*/
		if(!response.isEmpty()) {
			return ResponseEntity.ok().body(response);
		} else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
	@PostMapping("/insertAutori")
	public ResponseEntity<AutoreDto> inserireAutore(AutoreDto autore) {
	   autoreService.saveAutore(autore);
		return ResponseEntity.ok().body(autore);
	
	}
}

