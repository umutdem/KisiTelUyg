/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.kisiteluyg.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tr.gov.ptt.kisiteluyg.entity.Kullanici;

/**
 *
 * @author Administrator
 */
@Stateless
public class KullaniciFacade extends AbstractFacade<Kullanici> {
    @PersistenceContext(unitName = "KisiTelUygPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KullaniciFacade() {
        super(Kullanici.class);
    }
    
    public Kullanici loginControl (Kullanici k)
    {
        Kullanici kul = em.createNamedQuery("Kullanici.loginControl",Kullanici.class)
                .setParameter("kad", k.getUsername()).setParameter("sifre", k.getPassword()).getSingleResult();
        return kul;
    }
    
}
