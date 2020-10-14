#Author: angelatatiana.martinez02@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Barra de busqueda empleos disponibles 
  El usuario debe poder ingresar el dato en palabra clave, localidad o ambas en el formulario de la barra de busqueda y filtrado 
  de empleos, una vez complete el o los campos (no son obligatorios) y al hacer clic en el boton de buscar ofertas 
  la lista de empleos debera filtrar por la palabra clave, localidad o ambas según la información ingresada. 

  @tag1
  Scenario: Se diligencian los dos campos y se realiza la busqueda y filtro exitosamente
    Given Se ingreso la palabra clave "Analista" en el primer campo y en el segundo campo "Bogota"
    And Se hace clic en el botón de buscar ofertas 
    When La barra de busqueda realiza el filtro 
    Then Se presentan las ofertas laborales de Analistas para la ciudad de Bogota 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
