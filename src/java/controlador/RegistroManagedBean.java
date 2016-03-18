/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jose_
 */
//@Named(value = "registroManagedBean")
//@Dependent
@ManagedBean
@RequestScoped
public class RegistroManagedBean {
    private String test_name;
    /**
     * Creates a new instance of RegistroManagedBean
     */
    public RegistroManagedBean() {
        test_name = "PRUEBA";
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }
    
}
