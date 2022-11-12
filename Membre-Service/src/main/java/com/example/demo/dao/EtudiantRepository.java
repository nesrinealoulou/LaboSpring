package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;

//@RepositoryRestController  
//exposer les méthodes comme API REST
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	
	List<Etudiant>findByDiplome(String diplome);
	List<Etudiant>findByNomStartingWith(String carctere);
	List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String diplome);
	List<Etudiant>findByEncadrant(EnseignantChercheur  ens);

}
