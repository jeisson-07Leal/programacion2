/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;
public abstract class Paciente implements IPaciente {
private int codigo;
private String nombre;
private String apellidos;
private String sexo;
private String direccion;
private String lugarAtendido;
private String motivoConsulta;
private String medico;
private String fecha;
/**
 * Constructor de la clase Paciente
 * 
 */
public Paciente (int codigo,String nombre,String apellidos,String sexo,String direccion,String lugartAtendido,String motivoConsulta,String medico,String fecha){
 this.codigo = codigo;
 this.nombre=nombre;
 this.apellidos = apellidos;
 this.sexo = sexo;
 this.direccion = direccion;
 this.lugarAtendido =lugartAtendido;
 this.medico = medico;
 this.motivoConsulta = motivoConsulta;
 this.fecha = fecha;
}
public String getNombre(){
 return nombre;
}
//metodos getters y setters
public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

