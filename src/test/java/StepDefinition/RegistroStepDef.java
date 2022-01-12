package StepDefinition;

import Step.RegistroStep;
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
    public void elijoLasOpcionesParaElViajeYDoyClickEnElBotonBuscarViajes() {
        regStep.escogerViaje();
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
    public void llenoElFormularioConMisDatosYDoyClickEnElBotonContinue() {
        regStep.llenarFormulario();
    }
}
