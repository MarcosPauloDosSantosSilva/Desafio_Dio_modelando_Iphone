## Diagrama de Classes


```mermaid


classDiagram

class Iphone{  
      
  }

 class AppInternet{
 }

 class AppMusical{
 }

 class AppTelefonico{
 }




  class ReprodutorMusical{
       <<interface>>
    + Tocar
    + Pausar
    + Silenciar   
  }

  class AparelhoTelefonico{
       <<interface>>
    + Ligar
    + Anteder
    + InciarCorreioVoz    
  }

 class NavegadorInternet{
       <<interface>>
    + ExibirPagina
    + AdicionarNovaAba
    + AtualizarPagina	
 }

AppInternet--|>NavegadorInternet
AppMusical--|>ReprodutorMusical
AppTelefonico--|>AparelhoTelefonico


Iphone--|>AppInternet
Iphone--|>AppMusical
Iphone--|>AppTelefonico


```
