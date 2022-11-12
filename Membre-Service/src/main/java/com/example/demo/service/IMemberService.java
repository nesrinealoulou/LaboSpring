package com.example.demo.service;

import java.util.List;

import com.example.demo.PublicationBean;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

public interface IMemberService {
	//Crud sur les membres 
	public Membre addMember(Membre m);
	public void deleteMember(Long id) ;
	public Membre updateMember(Membre p) ;
	public Membre findMember(Long id) ;
	public List<Membre> findAll();
	//Filtrage par propriété
	public Membre findByCin(String cin);
	public Membre findByEmail(String email);
	public List<Membre> findByNom(String nom);
	//recherche spécifique des étudiants
	public List<Etudiant> findAllEtudiants();
	public List<Etudiant> findByDiplome(String diplome);
	//recherche spécifique des enseignants
	public List<EnseignantChercheur> findAllEnseignants();
	public List<EnseignantChercheur> findByGrade(String grade);
	public List<EnseignantChercheur> findByEtablissement(String etablissement);
	
	//other ...
	
	public Etudiant affecterencadrantToetudiant(Long idetd, Long idens);
	public void affecterauteurTopublication(Long idauteur, Long idpub);
	public List<PublicationBean> findPublicationparauteur(Long idauteur);
}
