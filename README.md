# Prac01
## Первый опыт работы с Java + Spring Boot + Swagger-UI. Созданы необходимые по ТЗ тесты. Добавлена In-Memory БД (/flush/all). Кауров Михаил 319/1 - 23.05.2023

Заголовок Swagger-UI:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/f5cbc626-f20d-48d4-8a2b-07362bceb3a4)

Вся страница:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/c8e89abf-306a-4a0a-bd48-cdb741a0525a)

Контроллер калькулятора (+):
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/79e9d70d-5b41-486a-b652-04bcd4562f01)

(-):
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/af5dcf67-d74e-4746-8b56-91ead7c78fae)

Контроллер БД:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/5c30c330-1ca2-4d13-b058-a62ce12e6290)

Вид вывода всех данных БД в PostMan:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/2b5eacfb-211b-41f9-a217-2cbdea7ccad4)

Тесты:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/a4793c3b-37d8-420d-a7bb-0b5ce830b86d)

Лог тестирования:
```
MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /minus/120/2147483648
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#minus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.method.annotation.MethodArgumentTypeMismatchException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 400
    Error message = null
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /plus/1/1
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#plus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = 2
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /minus/4627/5645
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#minus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = -1018
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /minus/120/11
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#minus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = 109
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /plus/-2147483648/-568
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#plus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = 2147483080
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /plus/-730/880
       Parameters = {}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = ru.neoflex.prac01.controller.CalcController
           Method = ru.neoflex.prac01.controller.CalcController#plus(int, int)

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = null

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = 150
    Forwarded URL = null
   Redirected URL = null
          Cookies = []
```
