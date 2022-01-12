#language: es
@CASOS
  Característica: Comprar boletos de distintos trenes
  Yo un cliente
  Quiero comprar pasajes para dos rutas distintas
  Primera ruta: BELMOND ANDEAN EXPLORER (Arequipa>Puno>Cusco)
  Segunda ruta: EXPEDITION (Cusco>Machu Picchu)

    @CASO1
      Escenario: Compra de boletos de la ruta 1
      Dado que la web PeruRail esta disponible
      Cuando elijo las opciones para el viaje y doy click en el boton buscar viajes
      | destino   | ruta   |  tren    |
      | <destino> | <ruta> |  <tren>  |
      Entonces elijo la fecha del viaje
      Y la cantidad de cabinas  y doy click en el boton continuar
        | destino   | ruta   |  tren    |
        | <destino> | <ruta> |  <tren>  |
      Entonces lleno el formulario con mis datos y doy click en el boton continue
      Entonces selecciono el metodo de pago y doy click en aceptar los terminos
      Y doy click en entrar numero de tarjeta
      Y verifico las cantidades y los datos ingresados en la compra

      Ejemplos:
      |destino | ruta  | tren |
      |   3    |  31   |   2  |






