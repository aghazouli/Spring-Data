//package org.ghazouli.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;
//
//import org.ghazouli.entities.Produit;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//@Transactional
//public class ProduitDaoImpl implements EntityRepository<Produit>{
//	
//	@PersistenceContext
//	private EntityManager em;
//	@Override
//	public Produit save(Produit p) {
//		em.persist(p);
//		return p;
//	}
//
//	@Override
//	public List<Produit> findAll() {
//		Query query = em.createQuery("select p from Produit p");
//		return query.getResultList();
//	}
//
//	@Override
//	public Produit findOne(Long id) {
//		Produit p=em.find(Produit.class, id);
//		return p;
//	}
//
//	@Override
//	public List<Produit> findByDesignation(String mc) {
//		Query query = em.createQuery("select p from Produit p where p.designation like :x");
//		query.setParameter("x", mc);
//		return query.getResultList();
//	}
//
//	@Override
//	public Produit update(Produit p) {
//		em.merge(p);
//		return p;
//	}
//
//	@Override
//	public void delete(Long id) {
//		Produit p = em.find(Produit.class, id);
//		em.remove(p);
//		
//	}
//
//}
