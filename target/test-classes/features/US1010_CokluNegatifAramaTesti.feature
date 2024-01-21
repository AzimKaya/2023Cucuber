Feature: US1010 kullanıcı verilen yanlis bilgilerle giris yapamaz

  Scenario: TC16 liste olarak verilen yanlıs kullanıcı bilgileri ile giris yapilamamali

    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak "<verilenEmail>" girer
    And password olarak "<verilenPassword>" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    Then sayfayi kapatir


    Examples:
      |verilenEmail    |verilenPassword    |
      |toGecerliEmail  |toGecersizPassword |
      |toGecersizEmail |toGecerliPassword  |
      |toGecersizEmail |toGecersizPassword |
      |toGecersizEmail2|toGecersizPassword2|
      |toGecersizEmail3|toGecersizPassword3|
