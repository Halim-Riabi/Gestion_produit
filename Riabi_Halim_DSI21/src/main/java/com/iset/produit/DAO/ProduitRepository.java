package com.iset.produit.DAO;

import com.iset.produit.entities.Categorie;
import com.iset.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    @Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
    List<Produit> findByNomPrix (String nom, Double prix);

    @Query("select p from Produit p where p.categorie = ?1")
    List<Produit> findByCategorie (Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAsc();
    @Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
            List<Produit> trierProduitsNomsPrix ();


}

