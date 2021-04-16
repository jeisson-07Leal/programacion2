package Mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
   private Modelo mod;
   private Vista vid;                                       
   public Controlador(Modelo mod, Vista vid) {
        this.mod = mod;
        this.vid = vid;
        this.vid.total.addActionListener(this);
        this.vid.menu.addActionListener(this);
        this.vid.it1.addActionListener(this);
        this.vid.it2.addActionListener(this);
        this.vid.it3.addActionListener(this);
    }
   public void iniciarVista() {
vid.setTitle("Lavado de autos la Estrella");
vid.pack();
vid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
vid.setBounds(100, 100, 600, 350);
vid.setVisible(true);
}   
    public void actionPerformed(ActionEvent e) {
        String dia,mes,año; 
        dia = vid.d.getText();
        mes = vid.m.getText();
        año = vid.a.getText();
        if(vid.total == e.getSource() && vid.c1.isSelected() == true) {
            mod.setValTi(5000.0);
        }
        if(vid.total == e.getSource() && vid.c2.isSelected() == true) {
            mod.setValTi(8000.0);
        }
        if(vid.total == e.getSource() && vid.c3.isSelected() == true){
            mod.setValS(25000.0);
            mod.setProLa(25000.0);
            mod.setEmpl1(25000.0);
            mod.proLA();
            mod.pro1();
        }
        if(vid.total == e.getSource() && vid.c4.isSelected() == true){
            mod.setValS(35000.0);
            mod.setProLa(35000.0);
            mod.setEmpl2(35000.0);
            mod.proLA();
            mod.pro2();
        }
        if(vid.total == e.getSource() && vid.c5.isSelected() == true){
            mod.setValS(20000.0);
            mod.setProDes(20000.0);
            mod.setEmpl3(20000.0);
            mod.prodD();
            mod.pro3();
        }
        if(vid.total == e.getSource() && vid.c6.isSelected() == true){
            mod.setValS(30000.0);
            mod.setProDes(30000.0);
            mod.setEmpl4(30000.0);
            mod.prodD();
            mod.pro4();
        }
        if(vid.total == e.getSource() && vid.c7.isSelected() == true){
            mod.setValS(35000.0);
            mod.setProdCom(35000.0);
            mod.setEmpl5(35000.0);
            mod.pro();
            mod.pro5();
        }
        if(vid.total == e.getSource() && vid.c8.isSelected() == true){
            mod.setValS(40000.0);
            mod.setProdCom(40000.0);
            mod.setEmpl6(40000.0);
            mod.pro();
            mod.pro6();
        }
        if(vid.total == e.getSource() && vid.c9.isSelected() == true){
            mod.setValS(50000.0);
            mod.setProdCom(50000.0);
            mod.setEmpl7(50000.0);
            mod.pro();
            mod.pro7();
        }
        String contra;
        if(e.getSource() == vid.it1){
            contra = JOptionPane.showInputDialog(null, "Escriba la contraseña (es 123)");
            if(contra.equalsIgnoreCase("123")){
                String confir = JOptionPane.showInputDialog("Le recomendamos que solo lo haga cuando acabe el dia. \n ¿Ya"
                    + " acabo el dia? si/no");
            if(confir.equalsIgnoreCase("si")){
             mod.proLavad();
            mod.proDesi();
            mod.proCombos();   
            }
            }else{
                JOptionPane.showInputDialog(null, "Intente de nuevo.");
            }
        }
        if(e.getSource() == vid.it2){
            contra = JOptionPane.showInputDialog(null, "Escriba la contraseña (es 123)");
            if(contra.equalsIgnoreCase("123")){
                String confir = JOptionPane.showInputDialog("Le recomendamos que solo lo haga cuando acabe el dia. \n ¿Ya"
                    + " acabo el dia? si/no");
            if(confir.equalsIgnoreCase("si")){
                    mod.impEmpl1();
            mod.impEmpl2();
            mod.impEmpl3();
            mod.impEmpl4();
            mod.impEmpl5();
            mod.impEmpl6();
            mod.impEmpl7();
            }
            }else{
                JOptionPane.showInputDialog(null, "Intente de nuevo.");
            }
        }
        if(e.getSource() == vid.it3){
            contra = JOptionPane.showInputDialog(null, "Escriba la contraseña (es 123)");
            if(contra.equalsIgnoreCase("123")){
                String confir = JOptionPane.showInputDialog("Le recomendamos que solo lo haga cuando acabe el dia. \n ¿Ya"
                    + " acabo el dia? si/no");
            if(confir.equalsIgnoreCase("si")){
             mod.setDia(Integer.parseInt(dia));
            mod.setAño(Integer.parseInt(año));
            mod.setMes(Integer.parseInt(mes));
            mod.report3();   
            }
            }else{
                JOptionPane.showInputDialog(null, "Intente de nuevo.");
            }
        }
        mod.total();
        vid.lResultado.setText("$"+mod.getTotal());
    }
}
