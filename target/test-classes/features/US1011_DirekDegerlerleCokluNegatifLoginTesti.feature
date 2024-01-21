Feature: US1011 scenarioda verilen yanlıs bilgilerle negatif login testi


  Scenario: TC16 liste olarak verilen yanlıs kullanıcı bilgileri ile giris yapilamamali

    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    When email olarak listede verilen "<verilenEmail>" girer
    And password olarak  listede verilen "<verilenPassword>" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    Then sayfayi kapatir


    Examples:
      |verilenEmail     |verilenPassword  |
      |deneme@gmail.com |1256471          |
      |seneme@gmail.com |5896478          |
      |beneme@gmail.com |1456899          |
      | zeneme@gmail.com|toG2564          |
      |tozeme@gmail.com |tosemr1          |
