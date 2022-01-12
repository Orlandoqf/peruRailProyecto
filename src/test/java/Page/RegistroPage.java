package Page;

import Base.Base;
import Paths.RegistroPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistroPage extends Base {

    RegistroPath regPath = new RegistroPath();
    RegistroPage regPage;

    public RegistroPage(WebDriver driver){
        super(driver);
    }

    public RegistroPage(){
    super();
    }

    public void validarPagina(){
        regPage = new RegistroPage(driver);
        regPage.chromeDriverConnection();
        regPage.visit(regPath.url);
        regPage.maximize();
    }

    public void escogerViaje() {
        regPage.elegir("3", regPath.elegirDestino);
        regPage.elegir("31", regPath.elegirRuta);
        regPage.elegir("2", regPath.elegirTren);
        regPage.click(regPath.btnSearch);
    }

    public void elegirFecha(){
        regPage.click(regPath.elegirFecha);
        regPage.elegir("4", regPath.elegirMes);
        regPage.click(regPath.elegirDia);
        regPage.click(regPath.btnTicket);
    }
    public void elegirCabina(){
        regPage.elegir("1", regPath.elegirCabina);
        regPage.elegir("2", regPath.elegirCantidadAdultos);
        regPage.click(regPath.btnContinuar);
    }

    public void llenarFormulario(){
        regPage.type("Orlando", regPath.firstName);
        regPage.type("Quispe", regPath.lastName);
        regPage.click(regPath.fechaCumple);
        regPage.elegir("4", regPath.mesCumple);
        regPage.elegir("1999", regPath.añoCumple);
        regPage.click(regPath.diaCumple);
        regPage.elegir("PER",regPath.nacionalidad);
        regPage.elegir("DNI",regPath.documento);
        regPage.type("72251553",regPath.docNumero);
        regPage.elegir("M",regPath.sexo);
        regPage.findElement(regPath.numCelular).clear();
        regPage.type("+51 993969806",regPath.numCelular);
        regPage.type("orlandoqf123@gmail.com",regPath.email);
        regPage.type("orlandoqf123@gmail.com",regPath.confirEmail);
        regPage.click(regPath.agreeBtn);
    }
}



