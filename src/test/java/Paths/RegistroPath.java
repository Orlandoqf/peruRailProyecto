package Paths;

import Base.Base;
import org.openqa.selenium.By;

public class RegistroPath extends Base {


    public String url="https://www.perurail.com/";
    public By elegirDestino = By.id("destinoSelect");
    public By elegirRuta = By.id("rutaSelect");
    public By elegirTren = By.id("cbTrenSelect");
    public By btnSearch = By.id("btn_search");
    public By elegirFecha = By.id("date1");
    public By elegirMes = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    public By elegirDia = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a");
    public By btnTicket = By.id("btn_search_bae");
    public By elegirCabina = By.xpath("//*[@id=\"frm_viajes_bae\"]/div[3]/div[2]/div[2]/div[3]/div/div[1]/select");
    public By elegirCantidadAdultos = By.xpath("//*[@id=\"suite\"]/div/div[2]/div[1]/select");
    public By btnContinuar = By.id("continuar_bae");
    public By firstName = By.id("txt_nombre[suite][cab1][1]");
    public By lastName = By.id("txt_apellido[suite][cab1][1]");
    public By fechaCumple = By.id("txt_fecha_nacimiento[suite][cab1][1]");
    public By mesCumple = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    public By añoCumple = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
    public By diaCumple = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a");
    public By nacionalidad = By.id("sel_nacion[suite][cab1][1]");
    public By documento = By.id("sel_tpdoc[suite][cab1][1]");
    public By docNumero = By.id("txt_nroid[suite][cab1][1]");
    public By sexo = By.id("sel_sexo[suite][cab1][1]");
    public By numCelular = By.id("txt_telefono[suite][cab1][1]");
    public By email = By.id("txt_mail[suite][cab1][1]");
    public By confirEmail = By.id("txt_mail_conf[suite][cab1][1]");
    public By agreeBtn = By.id("chk_ofertas[suite][cab1][1]");
    public By pasajero2Btn = By.id("itm1-2");
    public By firstName2 = By.id("txt_nombre[suite][cab1][2]");
    public By lastName2 = By.id("txt_apellido[suite][cab1][2]");
    public By fechaCumple2 = By.id("txt_fecha_nacimiento[suite][cab1][2]");
    public By mesCumple2 = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    public By añoCumple2 = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
    public By diaCumple2 = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a");
    public By nacionalidad2 = By.id("sel_nacion[suite][cab1][2]");
    public By documento2 = By.id("sel_tpdoc[suite][cab1][2]");
    public By docNumero2 = By.id("txt_nroid[suite][cab1][2]");
    public By sexo2 = By.id("sel_sexo[suite][cab1][2]");
    public By numCelular2 = By.id("txt_telefono[suite][cab1][2]");
    public By email2 = By.id("txt_mail[suite][cab1][2]");
    public By confirEmail2 = By.id("txt_mail_conf[suite][cab1][2]");
    public By agreeBtn2 = By.id("chk_ofertas[suite][cab1][2]");
    public By continueBtn = By.id("btnContinuarPas");
    public By seleccionarTarjeta = By.className("visa");
    public By agreeBtnMetodoPago = By.id("chk_tercon");
    public By enterCardNumber = By.id("ingresar_tarjeta");
    public By validarRuta = By.xpath("//*[@id=\"compra\"]/div/div[2]/div[3]/div[1]/div[2]");
    public By ValidarCompra = By.xpath("//*[@id=\"compra\"]/a");
    public By ValidarFechaSalida = By.xpath("//*[@id=\"compra\"]/div/div[2]/div[3]/div[2]/div[2]");





}
