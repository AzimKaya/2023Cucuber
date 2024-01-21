Feature: US1014 Scenario faild oldugunda fotograf cekilmeli


  Scenario:  TC20 kullanıcı testotomasyonu sayfasinda Nutella bulabilmeli

    Given kullanici "toUrl" anasayfasina gider
    Then arama kutusuna "nutella" yazip ENTER tusuna basar
    And arama sonucunda urun bulunamadigini test eder
