# Prac01
## Первый опыт работы с Java + Spring Boot + Swagger-UI. Созданы необходимые по ТЗ тесты. Добавлена In-Memory БД (/flush/all). Кауров Михаил 319/1 - 23.05.2023

Заголовок Swagger-UI:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/2c0feca1-cb76-436c-a454-fa37c7111c20)

Вся страница:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/1352c6b8-5cac-4480-9c7a-945ba8b1f024)

Контроллер калькулятора (+):
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/d676330e-ff8f-4ce6-bd67-b642d1081d6c)

(-):
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/7e6af112-0703-4c8a-a38e-37f83683e0f0)

Контроллер БД:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/546fefc2-addc-4c2d-aebb-ec4323e2daef)

Вид вывода всех данных БД в PostMan:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/12f8cd14-02d5-4437-b670-c5ea392528a0)

Тесты:
![image](https://github.com/MethylBenzol/Prac01/assets/101063637/2b8a6f33-dddc-45c1-a78f-4e72a0366d57)

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
