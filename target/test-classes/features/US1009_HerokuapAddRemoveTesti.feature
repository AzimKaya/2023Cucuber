Feature: US1009 Kullanıcı sayfadaki butonlari test eder


  Scenario:TC14 Kullanıcı add ve delete

    Given kullanici "sauceUrl" anasayfasina gider
    When kullanici Add Element butonuna basar
    And Delete butonu’nun gorunur oldugunu test eder
    Then Delete tusuna basar
    And Add Remove Elements yazisinin gorunur oldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir