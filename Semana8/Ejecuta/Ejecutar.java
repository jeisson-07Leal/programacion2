package Ejecuta;
import Mvc.Controlador;
import Mvc.Modelo;
import Mvc.Vista;
public class Ejecutar {
    public static void main(String[] args){
      eje();
    }
    public static void eje() {
         Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
}
        
