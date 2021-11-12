package node.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.LibroEntity;
import node.model.LibroDto;
import node.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	public LibroRepository libriRepository;
	
	public List<LibroDto> getAllLibri() {
		
		// JEE STYLE CON HIBERNATE E NAMEDQUERY
		//em.createNamedQuery(Padrone.NAMED_QUERY_ALL, Padrone.class)
		//.getResultList();
		
		// SPRING REPOSITORY
		List<LibroEntity> listLibroEntity = libriRepository.findAll();
		
		return listLibroEntity.stream()
				.map(entity -> {
					LibroDto dto = new LibroDto();
					dto.setTitolo(entity.getTitolo());
					dto.setNumero_pagine(entity.getNumero_pagine());
					dto.setId(entity.getId());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
	public void saveLibro(LibroEntity libro) {
		libriRepository.save(libro);
	}


	
}

