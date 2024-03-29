package com.iset.produit;

import com.iset.produit.entities.Produit;
import com.iset.produit.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {
    @Autowired
    private ProduitServiceImpl service;
    public static void main(String[] args) {
        SpringApplication.run(ProduitApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Produit prod1 = new Produit("PC Asus",1500.500,new Date());
        Produit prod2 = new Produit("PC Dell",2000.500,new Date());
        Produit prod3 = new Produit("PC Toshiba",2500.500,new Date());
        Produit prod4 = new Produit("iphone X",1000.000,new Date());
        service.saveProduit(prod1);
        service.saveProduit(prod2);
        service.saveProduit(prod3);
        service.saveProduit(prod4);
        System.out.println("Hello dsi21");
    }

}
