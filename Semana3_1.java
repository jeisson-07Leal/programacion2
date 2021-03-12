/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3_1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jeiss
 */
public class Semana3_1 extends JFrame  implements ActionListener {//extender la clase JFrame implements eventos
//ventana de JFrame
        JPanel p1;//declaro panels
        JButton b1;//declaro
        JTextField t1;
        JLabel l1;
        //JColorChooser j1;//declaro
    public Semana3_1(){//constructor que no retorna nada
          //declaro,instancio y agrego
        setBounds(300,200,500,500);//cuatro atributos ubicacion x,y & ancho,alto
        setLayout(new BorderLayout());//distribuidor
        setTitle("Saludador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);//hacer que se cierre cuando acabe
        p1 = new JPanel();//instanci
        b1 = new JButton("¡Saludar!");//instancio
        t1 = new JTextField(10);
        l1 = new JLabel("Escribe un nombre para saludar");
        //escuchar con action listener el componente
        b1.addActionListener(this);
        //j1 = new JColorChooser();
        p1.setBackground(Color.yellow);//darle color las propiedades con .
        p1.setLayout(new FlowLayout());//distribuidor pone uno al lado del otro y queda resposibe
        add(p1);//agrego
        p1.add(l1);
        //p1.add(j1);//agrego
        p1.add(t1);
        p1.add(b1);//agrego
        setVisible(true);//hacerlo visible
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semana3_1 miInterfaz = new Semana3_1();//crear objeto y constructor de la clase
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento,nombre;
        evento = b1.getActionCommand();
        if (evento.equals("¡Saludar!")) {
            nombre = t1.getText();
            JOptionPane.showMessageDialog(this,"¡Hola!"+nombre);
        }
    }
    
}
