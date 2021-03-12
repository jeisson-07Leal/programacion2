/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanae;


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
public class SemanaE extends JFrame  implements ActionListener {//extender la clase JFrame implements eventos
//ventana de JFrame
        JPanel p1;//declaro panels
        JButton b1;
        JLabel l1;
        //JColorChooser j1;//declaro
    public SemanaE(){//constructor que no retorna nada
          //declaro,instancio y agrego
        setBounds(300,200,500,500);//cuatro atributos ubicacion x,y & ancho,alto
        setLayout(new BorderLayout());//distribuidor
        setTitle("My first GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);//hacer que se cierre cuando acabe
        p1 = new JPanel();//instanci
        b1 = new JButton("Press");
        l1 = new JLabel("Hola mundo");
        //escuchar con action listener el componente
        b1.addActionListener(this);
        p1.setBackground(Color.yellow);//darle color las propiedades con .
        p1.setLayout(new FlowLayout());//distribuidor pone uno al lado del otro y queda resposibe
        add(p1);//agrego
        p1.add(b1);
        p1.add(l1);
        l1.setVisible(false);
        setVisible(true);//hacerlo visible
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SemanaE miInterfaz = new SemanaE();//crear objeto y constructor de la clase
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento,nombre;
        evento = b1.getActionCommand();
        if (evento.equals("Press")) {
           b1.setVisible(false);
           l1.setVisible(true);
        }
    }
    
}
