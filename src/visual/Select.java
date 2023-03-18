package visual;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.event.*;

public class Select  extends JFrame implements ActionListener, ItemListener {
    private JComboBox select;
    private JButton boton1;
    private JLabel label1;
    public static String texto="";

    public Select(String selectTexto1,String selectTexto2, String selectTexto3, String selectTexto4){    
        setLayout(null);  

        label1= new JLabel("Programa de conversión");
        label1.setBounds(60,20,250,18);
        add(label1);

        select= new JComboBox();
        select.setBounds(75,50,240,20);
        add(select);
        select.addItem("--Seleccione--");
        select.addItem(selectTexto1);
        select.addItem(selectTexto2);
        select.addItem(selectTexto3);
        select.addItem(selectTexto4);
        select.addItemListener(this);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(120,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    

    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==select){
            texto = select.getSelectedItem().toString();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1 ){
            if(texto == "conversion de peso colombiano a divisas"){
                Select2 formulario3= new Select2("COP a USD","COP a EUR","COP a GBP","COP a JPY", "COP a KRW","conversion de peso colombiano a divisas");
                formulario3.setBounds(0,0,350,200);
                formulario3.setVisible(true);
                formulario3.setResizable(false);
                formulario3.setLocationRelativeTo(null); 
                this.setVisible(false);
            }
            if(texto == "conversion de divisas a peso colombiano"){
                Select2 formulario2= new Select2("USD a COP","EUR a COP","GBP a COP","JPY a COP","KRW a COP","conversion de divisas a peso colombiano");
                formulario2.setBounds(0,0,350,200);
                formulario2.setVisible(true);
                formulario2.setResizable(false);
                formulario2.setLocationRelativeTo(null);
                this.setVisible(false);
             }
           if(texto == "conversion de mph a km/h"){
            Input formulario3 = new Input("conversion de mph a km/h");
            formulario3.setBounds(0,0,400,300);
            formulario3.setVisible(true);
            formulario3.setResizable(false);
            formulario3.setLocationRelativeTo(null); 
            this.setVisible(false);
            }

            if(texto == "conversion de km/h a mph"){
                Input formulario3 = new Input("conversion de km/h a mph");
                formulario3.setBounds(0,0,400,300);
                formulario3.setVisible(true);
                formulario3.setResizable(false);
                formulario3.setLocationRelativeTo(null); 
                this.setVisible(false);
                }
        }
    }
    
   
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static void main(String[] args) {
    
        Select formulario1= new Select("conversion de peso colombiano a divisas","conversion de divisas a peso colombiano","conversion de mph a km/h","conversion de km/h a mph");

        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null); 
     
      

       

    }
}
