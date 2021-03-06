#language: es
@CASOS
  Característica: Comprar boletos de distintos trenes
  Yo un cliente
  Quiero comprar pasajes para dos rutas distintas
  Primera ruta: BELMOND ANDEAN EXPLORER (Arequipa>Puno>Cusco)
  Segunda ruta: EXPEDITION (Cusco>Machu Picchu)

    @CASO1
    Esquema del escenario: Compra de boletos de la ruta 1
      Dado que la web PeruRail esta disponible
      Cuando elijo las opciones para el viaje y doy click en el boton buscar viajes
        | destino   | ruta   | tren   |
        | <destino> | <ruta> | <tren> |
      Entonces elijo la fecha del viaje
      Y la cantidad de cabinas  y doy click en el boton continuar
        | cabina    | adultos      | niños    |
        | <cabina>  | <adultos>    | <niños>  |
      Entonces lleno el formulario con mis datos y doy click en el boton continue
        | firstName   | lastName   | mesCumple   | añoCumple   | Nacionalidad   | documento   | docNumero   | sexo   | numCelular   | email   | confirnEmail   | firstName2   | lastName2   | mesCumple2   | añoCumple2   | Nacionalidad2   | documento2   | docNumero2   | sexo2   | numCelular2   | email2   | confirnEmail2   |
        | <firstName> | <lastName> | <mesCumple> | <añoCumple> | <Nacionalidad> | <documento> | <docNumero> | <sexo> | <numCelular> | <email> | <confirnEmail> | <firstName2> | <lastName2> | <mesCumple2> | <añoCumple2> | <Nacionalidad2> | <documento2> | <docNumero2> | <sexo2> | <numCelular2> | <email2> | <confirnEmail2> |
      Entonces selecciono el metodo de pago y doy click en aceptar los terminos
      Y doy click en entrar numero de tarjeta
      Y verifico las cantidades y los datos ingresados en la compra
        | destino   | ruta   | tren   |
        | <destino> | <ruta> | <tren> |
      Ejemplos:
        | destino | ruta         | tren                             | firstName | lastName | mesCumple | añoCumple | Nacionalidad | documento | docNumero | sexo | numCelular | email                  | confirnEmail            | firstName2 | lastName2  | mesCumple2 | añoCumple2 | Nacionalidad2 | documento2 | docNumero2 | sexo2 | numCelular2 | email2             | confirnEmail2        | cabina    | adultos      | niños    |
        | Cusco   | Puno > Cusco | Andean Explorer, A Belmond Train | Orlando   | Quispe   | 4         | 1999      | PER          | DNI       | 72251553  | M    | 993969806  | orlandoqf123@gmail.com | orlandoqf123@gmail.com> | Juan       | Rebatta    | 5          | 1999       | PER           | DNI        | 71251553   | M     | 993929806   | juanf123@gmail.com | juanf123@gmail.com>  | 1         | 2            | 0        |








