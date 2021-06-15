Feature: Signing un in a commercial page

  This feature is about making a registration and then validating that registration in Guru

  Scenario Outline: Sign up and verify Log in
    Given that andres enters the Guru page
    When andres signs up
      | nombre   | apellido   | telefono   | email   | direccion   | ciudad   | departamento   | codigoPostal   | usuario   | contrasena   | confContrasena   |
      | <nombre> | <apellido> | <telefono> | <email> | <direccion> | <ciudad> | <departamento> | <codigoPostal> | <usuario> | <contrasena> | <confContrasena> |
    And logs in
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then andres can validate that the login and therefore the registration were successful with the banner Login Successfully

    Examples:
      | nombre | apellido | telefono | email                 | direccion                | ciudad   | departamento | codigoPostal | usuario               | contrasena | confContrasena |
      | Andres | Devia    | 123      | andres12377@gmail.com | Avenida Siempre Viva 123 | Medellin | Antioquia    | 00000        | andres12377@gmail.com | 123456     | 123456         |
      | Zoraya | Devia    | 321      | zmdg@gmail.com        | Viva Siempre Avenida 321 | Medellin | Antioquia    | 11111        | zmdg@gmail.com        | 654321     | 654321         |