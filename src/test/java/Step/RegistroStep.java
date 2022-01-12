package Step;

import Page.RegistroPage;

public class RegistroStep {

    RegistroPage regPage = new RegistroPage();

    public void validarPagina(){
        regPage.validarPagina();
    }

    public void escogerViaje(){
        regPage.escogerViaje();
    }

    public void elegirFecha(){
        regPage.elegirFecha();
    }

    public void elegirCabina(){
        regPage.elegirCabina();
    }

    public void llenarFormulario(){
        regPage.llenarFormulario();
    }

}
