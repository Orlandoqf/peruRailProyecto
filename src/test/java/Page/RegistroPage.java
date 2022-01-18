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

    public void escogerViaje(String valueDestino, String valueRuta, String valueTren) {
//        regPage.elegir("3", regPath.elegirDestino);
//        regPage.elegir("31", regPath.elegirRuta);
//        regPage.elegir("2", regPath.elegirTren);
//        regPage.click(regPath.btnSearch);
        regPage.elegir(valueDestino,regPath.elegirDestino);
        regPage.elegir(valueRuta,regPath.elegirRuta);
        regPage.elegir(valueTren,regPath.elegirTren);
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
       // type("Orlando", regPath.firstName);
       // type("Quispe", regPath.lastName);
       // click(regPath.fechaCumple);
       // regPage.elegir("4", regPath.mesCumple);
       // regPage.elegir("1999", regPath.añoCumple);
       // click(regPath.diaCumple);
       // elegir("PER",regPath.nacionalidad);
       // elegir("DNI",regPath.documento);
       // type("72251553",regPath.docNumero);
       // elegir("M",regPath.sexo);
       // findElement(regPath.numCelular).clear();
       // type("993969806",regPath.numCelular);
       // type("orlandoqf123@gmail.com",regPath.email);
       // type("orlandoqf123@gmail.com",regPath.confirEmail);
        //click(regPath.agreeBtn);
    }

    public void llenarNombre(String nombre) {
        regPage.type(nombre, regPath.firstName);
    }

    public void llenarApellido(String apellido) {
        regPage.type(apellido, regPath.lastName);
    }

    public void llenarmesCumple(String mesCumple) {
        regPage.click(regPath.fechaCumple);
        regPage.elegir(mesCumple, regPath.mesCumple);
    }
    public void llenarañoCumple(String añoCumple) {
        regPage.elegir(añoCumple, regPath.añoCumple);
        regPage.click(regPath.diaCumple);
    }


    public void llenarNacionalidad(String nacionalidad) {
        regPage.elegir(nacionalidad,regPath.nacionalidad);
    }

    public void llenardocumento(String documento) {
        regPage.elegir(documento,regPath.documento);
    }

    public void llenardocNumero(String docNumero) {
        regPage.type(docNumero,regPath.docNumero);
    }

    public void llenarsexo(String sexo) {
        regPage.elegir(sexo,regPath.sexo);
    }

    public void llenarnumCelular(String numCelular) {
        regPage.type(numCelular,regPath.numCelular);
    }

    public void llenaremail(String email) {
        regPage.type(email,regPath.email);
    }

    public void llenarconfirnEmail(String confirnEmail) {
       regPage.type(confirnEmail,regPath.confirEmail);
       regPage.click(regPath.agreeBtn);
    }


    public void llenarNombre2(String nombre2) {
        regPage.click(regPath.pasajero2Btn);
        regPage.type(nombre2, regPath.firstName2);
    }

    public void llenarApellido2(String apellido2) {
        regPage.type(apellido2, regPath.lastName2);
    }

    public void llenarmesCumple2(String mesCumple2) {
        regPage.click(regPath.fechaCumple2);
        regPage.elegir(mesCumple2, regPath.mesCumple2);
    }

    public void llenarañoCumple2(String añoCumple2) {
        regPage.elegir(añoCumple2, regPath.añoCumple2);
        regPage.click(regPath.diaCumple2);
    }

    public void llenarNacionalidad2(String nacionalidad2) {
        regPage.elegir(nacionalidad2,regPath.nacionalidad2);
    }

    public void llenardocumento2(String documento2) {
        regPage.elegir(documento2,regPath.documento2);
    }

    public void llenardocNumero2(String docNumero2) {
        regPage.type(docNumero2,regPath.docNumero2);
    }

    public void llenarsexo2(String sexo2) {
        regPage.elegir(sexo2,regPath.sexo2);
    }

    public void llenarnumCelular2(String numCelular2) {
        regPage.type(numCelular2,regPath.numCelular2);
    }

    public void llenaremail2(String email2) {
        regPage.type(email2,regPath.email2);
    }

    public void llenarconfirnEmail2(String confirnEmail2) {
        regPage.type(confirnEmail2,regPath.confirEmail2);
        regPage.click(regPath.agreeBtn2);
        regPage.click(regPath.continueBtn);
    }

    public void seleccionarMetodoPago() {
        regPage.click(regPath.seleccionarTarjeta);
        regPage.click(regPath.agreeBtnMetodoPago);

    }

    public void clickBtnEntrarNumero() {
        regPage.click(regPath.enterCardNumber);
    }
}



