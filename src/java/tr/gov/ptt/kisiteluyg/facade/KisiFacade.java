/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.kisiteluyg.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tr.gov.ptt.kisiteluyg.entity.Kisi;

/**
 *
 * @author Administrator
 */
@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {
    @PersistenceContext(unitName = "KisiTelUygPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }
    
}
