/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.kisiteluyg.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tr.gov.ptt.kisiteluyg.entity.Kullanici;
import tr.gov.ptt.kisiteluyg.facade.KullaniciFacade;

/**
 *
 * @author Administrator
 */
@Stateless
public class LoginService {
    
    @EJB
    private KullaniciFacade kullaniciFacade = new KullaniciFacade();
    
    public boolean loginControl(Kullanici kul)
    {
       boolean result = false;
       
       Kullanici k = kullaniciFacade.loginControl(kul);
       
       if(k != null)
           result = true;
       return result;
    }
}
