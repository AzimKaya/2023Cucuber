Feature: US1009 Kullanıcı coklu arama yapar

  Scenario Outline: TC15 kullanıcı bir listedeki elementleri aratabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aracakKelimeler>" yazip ENTER tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    Then sayfayi kapatir

    Examples:
    |aracakKelimeler  |
    |phone            |
    |java             |
    |samsung          |
    |apple            |
    |nutella          |
