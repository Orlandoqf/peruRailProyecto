package Step;

import Base.Base;
import Page.RegistroPage;
import io.cucumber.datatable.DataTable;

public class RegistroStep {

    RegistroPage regPage = new RegistroPage();

    public void validarPagina(){
        regPage.validarPagina();
    }

    public void escogerViaje(DataTable dataTable){
        String destino = Base.getValueFromDataTable(dataTable,"destino");
        String ruta = Base.getValueFromDataTable(dataTable,"ruta");
        String tren = Base.getValueFromDataTable(dataTable,"tren");

        regPage.escogerViaje(destino,ruta,tren);
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
