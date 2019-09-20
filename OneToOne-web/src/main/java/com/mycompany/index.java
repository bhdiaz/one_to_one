/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.entity.Cuenta;
import com.mycompany.entity.Inversor;
import com.mycompany.interfaces.InversorFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author brayan
 */

@Named
@ViewScoped
public class index implements Serializable {
    /**
     * variables de la clase index 
     */
    @EJB
    private InversorFacadeLocal inversorFacade;
    @EJB
    private com.mycompany.interfaces.CuentaFacadeLocal cuentaFacade;

    public void generar (){   
        Cuenta cuenta = new Cuenta();
        Inversor inversor = new Inversor();
        inversor.setNombre("mortesino");
        cuenta.setNumeroCuenta("cualquiercosa");
        
        inversor.setCuenta(cuenta);
        cuenta.setInversor(inversor);
        
        inversorFacade.create(inversor);
        
        
        
        
    
 }    
    
}
