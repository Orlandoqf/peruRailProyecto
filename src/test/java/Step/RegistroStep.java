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

        String nombre2 = Base.getValueFromDataTable(dataTable,"firstName2");
        String apellido2 = Base.getValueFromDataTable(dataTable,"lastName2");
        String mesCumple2 = Base.getValueFromDataTable(dataTable,"mesCumple2");
        String añoCumple2 = Base.getValueFromDataTable(dataTable,"añoCumple2");
        String Nacionalidad2 = Base.getValueFromDataTable(dataTable,"Nacionalidad2");
        String documento2 = Base.getValueFromDataTable(dataTable,"documento2");
        String docNumero2 = Base.getValueFromDataTable(dataTable,"docNumero2");
        String sexo2 = Base.getValueFromDataTable(dataTable,"sexo2");
        String numCelular2 = Base.getValueFromDataTable(dataTable,"numCelular2");
        String email2 = Base.getValueFromDataTable(dataTable,"email2");
        String confirnEmail2 = Base.getValueFromDataTable(dataTable,"confirnEmail2");

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
        regPage.llenarNombre2(nombre2);
        regPage.llenarApellido2(apellido2);
        regPage.llenarmesCumple2(mesCumple2);
        regPage.llenarañoCumple2(añoCumple2);
        regPage.llenarNacionalidad2(Nacionalidad2);
        regPage.llenardocumento2(documento2);
        regPage.llenardocNumero2(docNumero2);
        regPage.llenarsexo2(sexo2);
        regPage.llenarnumCelular2(numCelular2);
        regPage.llenaremail2(email2);
        regPage.llenarconfirnEmail2(confirnEmail2);



    }

    public void seleccionarMetodoPago() {
        regPage.seleccionarMetodoPago();
    }

    public void clickBtnEntrarNumero() {
        regPage.clickBtnEntrarNumero();
    }
}
