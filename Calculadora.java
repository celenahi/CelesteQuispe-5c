//importacion de librerias para crear la interfaz grafica
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Calculadora extends JFrame implements ActionListener{
 private  JButton bc,bx,b1,b2,b3,br,b4,b5,b6,b7,b8,b9,b0,bs,bR,bp,bd;
 private  JTextField textfield1;
 public float valor1,valor2;
 public String operador;
 //en todas estas lineas se creara el diseño de los JButton y el de el JTextField 
 public Calculadora(){
  setLayout(null);
  setTitle("CALCULADORA");
 
  textfield1=new JTextField();
  textfield1.setBounds(10,10,182,35);
  add(textfield1);

  bc=new JButton("C");
  bc.setBounds(10,70,87,42);
  add(bc);
  bc.setBackground(new Color(175,175,225));
  bc.addActionListener(this); 


  bd=new JButton("/");
  bd.setBounds(100,70,42,42);
  add(bd);
  bd.setBackground(new Color(255,175,175));
  bd.addActionListener(this);
  
  bx=new JButton("X");
  bx.setBounds(145,70,42,42);
  bx.setBackground(new Color(255,175,175));
  add(bx);
  bx.addActionListener(this);

  b1=new JButton("1");
  b1.setBounds(10,115,42,42);
  add(b1);
  b1.setBackground(new Color(255,175,175));
  b1.addActionListener(this);

  b2=new JButton("2");
  b2.setBounds(55,115,42,42);
  b2.setBackground(new Color(255,175,175));
  add(b2);
  b2.addActionListener(this);
  
  b3=new JButton("3");
  b3.setBounds(100,115,42,42);
  b3.setBackground(new Color(255,175,175));
  add(b3);
  b3.addActionListener(this);

  br=new JButton("-");
  br.setBounds(145,115,42,42);
  br.setBackground(new Color(255,175,175));
  add(br);
  br.addActionListener(this);
  
  b4=new JButton("4");
  b4.setBounds(10,160,42,42);
  b4.setBackground(new Color(255,175,175));
  add(b4);
  b4.addActionListener(this);

  b5=new JButton("5");
  b5.setBounds(55,160,42,42);
  b5.setBackground(new Color(255,175,175));
  add(b5);
  b5.addActionListener(this);

  
  b6=new JButton("6");
  b6.setBounds(100,160,42,42);
  b6.setBackground(new Color(255,175,175));
  add(b6);
  b6.addActionListener(this);

  
  bs=new JButton("+");
  bs.setBounds(145,160,42,42);
  bs.setBackground(new Color(255,175,175));
  add(bs);
  bs.addActionListener(this);


  b7=new JButton("7");
  b7.setBounds(10,205,42,42);
  b7.setBackground(new Color(255,175,175));
  add(b7);
  b7.addActionListener(this);

  b8=new JButton("8");
  b8.setBounds(55,205,42,42);
  b8.setBackground(new Color(255,175,175));
  add(b8);
  b8.addActionListener(this);

  b9=new JButton("9");
  b9.setBounds(100,205,42,42);
  b9.setBackground(new Color(255,175,175));
  add(b9);
  b9.addActionListener(this);

  bR=new JButton("=");
  bR.setBounds(145,205,42,84);
  bR.setBackground(new Color(175,255,175));
  add(bR);
  bR.addActionListener(this);

 
  b0=new JButton("0");
  b0.setBounds(10,250,87,42);
  b0.setBackground(new Color(255,175,175));
  add(b0);
  b0.addActionListener(this);

  bp=new JButton(".");
  bp.setBounds(100,250,42,42);
  bp.setBackground(new Color(255,175,175));
  add(bp);
  bp.addActionListener(this);

 }
 //funcionalidad de los JButton
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
     textfield1.setText(textfield1.getText()+"1"); 
      
  } 
  
  if(e.getSource()==b2){
     textfield1.setText(textfield1.getText()+"2");

  }  

  if(e.getSource()==b3){
     textfield1.setText(textfield1.getText()+"3");
  }

  if(e.getSource()==b4){
     textfield1.setText(textfield1.getText()+"4");
  }
 
  if(e.getSource()==b5){
     textfield1.setText(textfield1.getText()+"5");
  }

  if(e.getSource()==b6){
     textfield1.setText(textfield1.getText()+"6");
  }

  if(e.getSource()==b7){
     textfield1.setText(textfield1.getText()+"7");
  }

  if(e.getSource()==b8){
     textfield1.setText(textfield1.getText()+"8");
  }

  if(e.getSource()==b9){
     textfield1.setText(textfield1.getText()+"9");
  }
 
  if(e.getSource()==b0){
     textfield1.setText(textfield1.getText()+"0");
  }

  if(e.getSource()==bs){
     valor1=Float.parseFloat(textfield1.getText());
     operador="+";
     textfield1.setText("");
  }

  if(e.getSource()==br){
     valor1=Float.parseFloat(textfield1.getText());
     operador="-";
     textfield1.setText("");
  }

  if(e.getSource()==bx){
     valor1=Float.parseFloat(textfield1.getText());
     operador="*";
     textfield1.setText("");
  }

  if(e.getSource()==bd){
     valor1=Float.parseFloat(textfield1.getText());
     operador="/";
     textfield1.setText("");
  }
 
  if(e.getSource()==bc){
     textfield1.setText("");  
  }
   

  

  if(e.getSource()==bR){
     valor2=Float.parseFloat(textfield1.getText());
     switch(operador){
       case"+":textfield1.setText(cero(valor1 + valor2));
       break;
         
       case"-":textfield1.setText(cero(valor1 - valor2));
       break; 
       
       case"*":textfield1.setText(cero(valor1 * valor2));
       break;
       
       case"/":if(valor2==0){textfield1.setText("error de syntaxis");
               }
               else{textfield1.setText(cero(valor1 / valor2));
               }
       break; 
       

     }  

  }

  if(e.getSource()==bp){
    if(!(textfield1.getText().contains("."))){
   textfield1.setText(textfield1.getText()+".");
    }  
  }
  
 }
 //estas lineas sirven para eliminar el 0 despues de la coma(,),ej:el resultado es 10.00,ahora con estas lineas sera:10
 public String cero(float resultado){
   String retorno="";
   retorno=Float.toString(resultado);
   if(resultado%1==0){
      retorno=retorno.substring(0,retorno.length()-2);
   }
   return retorno;
       

 }
 //diseño de la interfaz grafica
 public static void main(String args[]){
  Calculadora formulario1=new Calculadora();
  formulario1.getContentPane().setBackground(new Color(0,0,0));
  formulario1.setBounds(0,0,220,350);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  
 }
}
