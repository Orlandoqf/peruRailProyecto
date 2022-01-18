package StepDefinition;

import Step.RegistroStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class RegistroStepDef {

    RegistroStep regStep = new RegistroStep();


    @Dado("que la web PeruRail esta disponible")
    public void queLaWebPeruRailEstaDisponible() {
        regStep.validarPagina();
    }

    @Cuando("elijo las opciones para el viaje y doy click en el boton buscar viajes")
    public void elijoLasOpcionesParaElViajeYDoyClickEnElBotonBuscarViajes(DataTable dataTable){
        regStep.escogerViaje(dataTable);
    }

    @Entonces("elijo la fecha del viaje")
    public void elijoLaFechaDelViaje() {
        regStep.elegirFecha();
    }

    @Y("la cantidad de cabinas  y doy click en el boton continuar")
    public void laCantidadDeCabinasYDoyClickEnElBotonContinuar() {
        regStep.elegirCabina();
    }

    @Entonces("lleno el formulario con mis datos y doy click en el boton continue")
    public void llenoElFormularioConMisDatosYDoyClickEnElBotonContinue(DataTable dataTable) {
        regStep.llenarFormulario(dataTable);
    }

    @Entonces("selecciono el metodo de pago y doy click en aceptar los terminos")
    public void seleccionoElMetodoDePagoYDoyClickEnAceptarLosTerminos() {
        regStep.seleccionarMetodoPago();
    }

    @Y("doy click en entrar numero de tarjeta")
    public void doyClickEnEntrarNumeroDeTarjeta() {
        regStep.clickBtnEntrarNumero();
    }

    @Y("lleno los datos de la tarjeta")
    public void llenoLosDatosDeLaTarjeta() {
      //  regStep.llenarDatosTarjeta();
    }
}
