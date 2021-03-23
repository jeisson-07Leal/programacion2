package Semana6;

import javax.swing.JOptionPane;

public class Test {
public static void main (String[] arg){
int opcion=0;
 Paciente p;
 Verificar v = null;
    do {        
       opcion=Integer.parseInt((JOptionPane.showInputDialog("|MENU|"+'\n'+"1)registrar"+'\n'+"2)Consultar"+'\n'+"0)salir")));
    switch(opcion){
        case 1:{
            int codigo=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo"));
            String nombre=(JOptionPane.showInputDialog("Cual es el nombre"));
            String apellidos  = (JOptionPane.showInputDialog("Cuales son los apellidos"));
            String sexo  = (JOptionPane.showInputDialog("Cual es el sexo"));
            String direccion  = (JOptionPane.showInputDialog("Direccion de residencia"));
            String lugarAtendido  = (JOptionPane.showInputDialog("Lugar donde fue atendido"));
            String motivoConsulta  = (JOptionPane.showInputDialog("Motivo de su consulta"));
            String medico  = (JOptionPane.showInputDialog("Cual es el nombre del medico que lo atendio"));
            String fecha = (JOptionPane.showInputDialog("Fecha(dd/mm/aa)"));
            p= new Paciente1(codigo,nombre,apellidos,sexo,direccion,lugarAtendido,motivoConsulta,medico,fecha);
            v = new Verificar(p);
            p.imprimir();
            System.out.println();
        }break;
        case 2:{
            String paciente=(JOptionPane.showInputDialog("Nombre del paciente"));
            String nMedico=(JOptionPane.showInputDialog("Nombre del Medico"));
            String lugar=(JOptionPane.showInputDialog("Centro de atencion"));
            v.imprimir(paciente, nMedico, lugar);
        }break;
        case 0:{
            JOptionPane.showMessageDialog(null, "saliendo...");
        }break;
    }
   } while (opcion !=0);
  }
}
