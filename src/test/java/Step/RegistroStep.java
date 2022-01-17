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

    public void llenarFormulario(DataTable dataTable){
        String nombre = Base.getValueFromDataTable(dataTable,"firstName");
        String apellido = Base.getValueFromDataTable(dataTable,"lastName");
        String mesCumple = Base.getValueFromDataTable(dataTable,"mesCumple");
        String añoCumple = Base.getValueFromDataTable(dataTable,"añoCumple");
        String Nacionalidad = Base.getValueFromDataTable(dataTable,"Nacionalidad");
        String documento = Base.getValueFromDataTable(dataTable,"documento");
        String docNumero = Base.getValueFromDataTable(dataTable,"docNumero");
        String sexo = Base.getValueFromDataTable(dataTable,"sexo");
        String numCelular = Base.getValueFromDataTable(dataTable,"numCelular");
        String email = Base.getValueFromDataTable(dataTable,"email");
        String confirnEmail = Base.getValueFromDataTable(dataTable,"confirnEmail");

        regPage.llenarNombre(nombre);
        regPage.llenarApellido(apellido);
        regPage.llenarmesCumple(mesCumple);
        regPage.llenarañoCumple(añoCumple);
        regPage.llenarNacionalidad(Nacionalidad);
        regPage.llenardocumento(documento);
        regPage.llenardocNumero(docNumero);
        regPage.llenarsexo(sexo);
        regPage.llenarnumCelular(numCelular);
        regPage.llenaremail(email);
        regPage.llenarconfirnEmail(confirnEmail);
    }

}
