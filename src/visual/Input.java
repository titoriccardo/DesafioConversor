package visual;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Input extends JFrame implements ActionListener{
 
    private JTextField input;
    private JButton boton1;
    private JButton boton2;
    private JLabel label1;
   private static String textoInput;
    public Input(String texto){
        setLayout(null);

        label1= new JLabel(texto + " Ingrese en la cantidad a convertir");
        label1.setBounds(50,20,300,20);
        add(label1);


        input = new JTextField();
        input.setBounds(120,70,150,20);
        add(input);

        boton1= new JButton("Aceptar");
        boton1.setBounds(80,150, 90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2= new JButton("Regresar");
        boton2.setBounds(220,150, 90,30);
        add(boton2);
        boton2.addActionListener(this);
        this.textoInput= texto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            if(textoInput == "COP a USD"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                    JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/4883)*100d)/100d) +" Dolares.");
                };
            
                
            }
            if(textoInput == "COP a EUR"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                    JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/5221)*100d)/100d) +" Euros.");
                }
            }
            if(textoInput == "COP a GBP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/5876)*100d)/100d) +" Libras esterlinas.");
                }
            }
            if(textoInput == "COP a JPY"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/36.37)*100d)/100d) +" yenes japoneses.");
                }
            }
            if(textoInput == "COP a KRW"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/3.77)*100d)/100d) +" won sur coreano.");
                }
            }
            if(textoInput == "USD a COP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*4883)*100d)/100d) +" COP.");
                }
            }
            if(textoInput == "EUR a COP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*5221)*100d)/100d) +" COP.");
                }
            }
            if(textoInput == "GBP a COP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*5876)*100d)/100d) +" COP.");
                }
            }
            if(textoInput == "JPY a COP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*36.37)*100d)/100d) +" COP.");
                }
            }
            if(textoInput == "KRW a COP"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*3.77)*100d)/100d) +" COP.");
                }
            }
            if(textoInput == "conversion de km/h a mph"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*0.62)*100d)/100d) +" Millas por hora.");
                }
            }
            if(textoInput == "conversion de mph a km/h"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/0.62)*100d)/100d) +" KM/H.");
                }
            }

            
        }
        if(e.getSource() == boton2){
            Select formulario1= new Select("conversion de peso colombiano a divisas","conversion de divisas a peso colombiano","conversion de mph a km/h","conversion de km/h a mph");
            formulario1.setBounds(0,0,350,200);
            formulario1.setVisible(true);
            formulario1.setResizable(false);
            formulario1.setLocationRelativeTo(null);
            this.setVisible(false); 
        }
        
    }
   
}



