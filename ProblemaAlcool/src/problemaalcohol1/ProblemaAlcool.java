/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaalcohol1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author junjo
 */
public class ProblemaAlcool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     EntityManagerFactory fx = Persistence.createEntityManagerFactory("problemaAlcool");
        
        EntityManager em = fx.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
        ProblemaTipes  pr= new ProblemaTipes();
        pr.setFamiliar("separação");
        pr.setSocial("isolamento");
        pr.setTransito("Acidente");
        em.persist(pr);
        et.commit();

        em.close();
        fx.close();
    }
    
}
