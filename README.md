## Diagrama de Classes


```mermaid


classDiagram
   
  class Iphone{
      
  }


  class interface ReprodutorMusical{
    + Tocar
    + Pausar
    + Silenciar   
  }

  class interface AparelhoTelefonico{
    + Ligar
    + Anteder
    + InciarCorreioVoz
    
  }

 class inteface NavegadoInternet{
    + ExibirPagina
    + AdicionarNovaAba
    + AtualizarPagina	
 }

Iphone"1" *-->"1" interface ReprodutorMusical
Iphone"1" *-->"1" interface AparelhoTelefonico
Iphone"1" *-->"1" inteface NavegadoInternet


```
