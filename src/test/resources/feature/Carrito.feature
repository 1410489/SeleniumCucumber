Feature: Comprar articulo con nuna tarjeta de Credito
  Yo como usuario de la pagina guru99
  Quiero comprar un articulo con una tarjeta de credito
  Para ahorrar tiempo en hacer  un tramite personal

  Scenario: Comprar un solo producto
    Given la pagina esta estable
    When doy click en generar tarjeta
    And capturamos datos de la tarjeta
    And capturamos el cvv de la tarjeta
    And capturamos la fecha de la tarjeta
    And capturamos el monto disponible de la tarjeta
    When doy click en Check Credit
    And ingreso el dato de la tarjeta y doy click


