package node.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import node.entity.LibroEntity;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long> { 
	
	
}