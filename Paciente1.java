/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

import javax.swing.JOptionPane;

public class Paciente1 extends Paciente{
 /**
 * @param nombre
 */
    public Paciente1(int codigo,String nombre,String apellidos,String sexo,String direccion,String lugartAtendido,String motivoConsulta,String medico,String fecha) {
        super(codigo,nombre,apellidos,sexo,direccion,lugartAtendido,motivoConsulta,medico,fecha);
    }
 @Override
 public void imprimir(){
 System.out.println("Fin del registro");
}
}

