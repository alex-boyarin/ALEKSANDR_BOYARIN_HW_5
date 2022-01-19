Feature: Test for the presence of catalog items on the page

  Scenario: Catalog elements on page.
    Given User open main page.
    When User selects the Catalog section.
    Then User should see all the catalog elements of the section.

      | Электроника       |
      | Компьютеры и сети |
      | Бытовая техника   |
      | Стройка и ремонт  |
      | Дом и сад         |
      | Авто и мото       |
      | Красота и спорт   |
      | Детям и мамам     |
      | Работа и офис     |
      | Еда               |

    And User close page.

  Scenario: Computers_And_Networks elements.
    Given User open main page.
    When User selects the Catalog section.
    And User selects the section Computers and networks.
    Then User should see all the Computers and networks elements of the section.

      | Ноутбуки, компьютеры, мониторы |
      | Комплектующие                  |
      | Хранение данных                |
      | Сетевое оборудование           |

    And User close page.

    Scenario: Component for computer has price, name, quantity
      Given User open main page.
      When User selects the Catalog section.
      And User selects the section Computers and networks.
      And User selects category Components.
      Then User should see all Components for computer have price, name, quantity.
      And User close page.

