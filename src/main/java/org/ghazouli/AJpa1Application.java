package org.ghazouli;

import java.util.List;

import org.ghazouli.dao.CategorieRepository;
import org.ghazouli.dao.ProduitRepository;
import org.ghazouli.entities.Categorie;
import org.ghazouli.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AJpa1Application.class, args);
		//EntityRepository<Produit> produitDao = ctx.getBean(EntityRepository.class);
		CategorieRepository categorieRepository = ctx.getBean(CategorieRepository.class);
		Categorie c1 = new Categorie("Ordinateurs");
		Categorie c2 = new Categorie("Imprimantes");
		Categorie c3 = new Categorie("Logiciels");
		
		categorieRepository.save(c1);
		categorieRepository.save(c2);
		categorieRepository.save(c3);
		
		ProduitRepository produitDao = ctx.getBean(ProduitRepository.class);
		produitDao.save(new Produit("LX123", 7000, 10,c1));
		produitDao.save(new Produit("EY456", 8000, 20,c2));
		produitDao.save(new Produit("SH789", 9000, 30,c3));
		
		//springData
		//List<Produit> produits = produitDao.findAll();
		List<Produit> produits = produitDao.produitsByMC("%S%");
		//List<Produit> produits = produitDao.findByDesignation("%E%");
		//List<Produit> produits = produitDao.findAll();
		for (Produit p : produits) {
			System.out.println("des : "+p.getDesignation());
			System.out.println("prix : "+p.getPrix());
		}		
	}
}
