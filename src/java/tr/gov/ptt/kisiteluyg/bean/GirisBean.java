/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.kisiteluyg.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tr.gov.ptt.kisiteluyg.entity.Kullanici;
import tr.gov.ptt.kisiteluyg.service.LoginService;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class GirisBean {
    private Kullanici k;
    private LoginService loginService;

    public GirisBean() {
        k = new Kullanici();
        loginService = new LoginService();
    }

    public Kullanici getK() {
        return k;
    }

    public void setK(Kullanici k) {
        this.k = k;
    }
    
    public String loginControl()
    {
        boolean result = loginService.loginControl(this.k);
        
        if(result)
            return "ekle.xhtml?faces-redirect = true";
        
        return "giris.xhtml?faces-redirect = true";
    }
    
}
