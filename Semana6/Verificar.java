package Semana6;

import javax.swing.JOptionPane;

public class Verificar {
        private String nombre;
        private String medico;
        Paciente ver;

    public Verificar(Paciente ver) {
        this.ver=ver;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getLugarAtencion() {
        return lugarAtencion;
    }

    public void setLugarAtencion(String lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }
        private String lugarAtencion;
        public Verificar(String nombre,String lugartAtendido,String medico){
          this.nombre = nombre;
          this.medico = medico;
          this.lugarAtencion = lugartAtendido;
       }
        public void imprimir(String paciente, String nMedico, String lugar) {
            //tenia dos objetos diferentes, solo se puede tener un solo objeto y mandarlo a otras clases
            if (ver.getNombre().equals(paciente)&& ver.getMedico().equals(nMedico) && ver.getLugarAtendido().equals(lugar)) {
                JOptionPane.showMessageDialog(null, "Codigo del paciente:"+ver.getCodigo());
                JOptionPane.showMessageDialog(null, "Nombres del paciente:"+ver.getNombre());
                JOptionPane.showMessageDialog(null, "Apellidos del paciente:"+ver.getApellidos());
                JOptionPane.showMessageDialog(null, "Sexo del paciente:"+ver.getSexo());
                JOptionPane.showMessageDialog(null, "Direccion del paciente:"+ver.getDireccion());
                JOptionPane.showMessageDialog(null, "Medico del paciente:"+ver.getMedico());
                JOptionPane.showMessageDialog(null, "Motivo consulta del paciente:"+ver.getMotivoConsulta());
                JOptionPane.showMessageDialog(null, "Lugar atencion del paciente:"+ver.getLugarAtendido());
                JOptionPane.showMessageDialog(null, "Fecha atencion del paciente:"+ver.getFecha());
            }else{
                JOptionPane.showMessageDialog(null,"Revisa Bien los datos");
            }
       }
}
