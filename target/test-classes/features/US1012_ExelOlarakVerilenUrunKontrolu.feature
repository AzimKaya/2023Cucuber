Feature: US1012 Exel olarak verilen urunler ve min.stok miktarlari testi

  Scenario:  TC18 exel olarak verilen listedeki urunler min. stock bulundurmali

  Scenario Outline: : TC18 excel olarak verilen listedeki urunler min. stok bulundurmali

    Given kullanici "toUrl" anasayfaya gider
    Then stok excelindeki "<istenenSatir>" daki urunun stok miktarini bulur
    And stok miktarinin "<istenenSatir>" da verilen stok miktarindan fazla oldugunu test eder
    And sayfayi kapatir

    Examples:
      |istenenSatir|
      |2           |
      |3           |
      |4           |
      |5           |
      |6           |
      |7           |
      |8           |
      |9           |