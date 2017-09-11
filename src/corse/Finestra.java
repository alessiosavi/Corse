/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corse;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alessio
 */
public class Finestra extends JFrame implements ActionListener,WindowListener,KeyListener {
    public JPanel pannello;
    public JLabel inserisciNome;
    public JTextField scriviNome;
    public JLabel etiGiocatore;
    public JComboBox giocatore1,giocatore2,giocatore3,giocatore4,giocatore5,giocatore6;
    public String[] velocita={"lento","medio","veloce","fulmine"};
    public JButton start;
    public Grafica campo;
    //public Corridore atleta;
    public int[] velocitaN={0,0,0,0,0,0};

    public String nomeGiocatore;

    public Finestra(int x, int y){
        this.setSize(x,y);
        this.setLayout(null);
        this.addWindowListener(this);
        this.addKeyListener(this);
        this.setFocusable(false);
        
        pannello=new JPanel();
        pannello.setBounds(0,0,x/3,y);
        pannello.addKeyListener(null);
        pannello.setFocusable(false);
        pannello.setLayout(null);
        pannello.setBackground(Color.LIGHT_GRAY);
        this.add(pannello);
        pannello.setFocusable(false);
        
        inserisciNome=new JLabel("Inserisci nome: ");
        inserisciNome.setBounds(0,10,100,20);
        pannello.add(inserisciNome);
        inserisciNome.setFocusable(false);
        
        scriviNome=new JTextField("");
        scriviNome.setBounds(0,40,100,20);
        pannello.add(scriviNome);
        scriviNome.addActionListener(this);
        this.setVisible(true);
        scriviNome.setFocusable(true);
        
        giocatore1=new JComboBox(velocita);
        giocatore1.setSelectedIndex(0);
        giocatore1.addActionListener(this);
        giocatore1.setBounds(0,100,100,20);
        pannello.add(giocatore1);
        giocatore1.setFocusable(false);
        
        giocatore2=new JComboBox(velocita);
        giocatore2.setSelectedIndex(0);
        giocatore2.addActionListener(this);
        giocatore2.setBounds(0,130,100,20);
        pannello.add(giocatore2);
        giocatore2.setFocusable(false);
        
        giocatore3=new JComboBox(velocita);
        giocatore3.setSelectedIndex(0);
        giocatore3.addActionListener(this);
        giocatore3.setBounds(0,160,100,20);
        pannello.add(giocatore3);
        giocatore3.setFocusable(false);
        
        giocatore4=new JComboBox(velocita);
        giocatore4.setSelectedIndex(0);
        giocatore4.addActionListener(this);
        giocatore4.setBounds(0,190,100,20);
        pannello.add(giocatore4);
        giocatore4.setFocusable(false);
        
        giocatore5=new JComboBox(velocita);
        giocatore5.setSelectedIndex(0);
        giocatore5.addActionListener(this);
        giocatore5.setBounds(0,220,100,20);
        pannello.add(giocatore5);
        giocatore5.setFocusable(false);
        
        giocatore6=new JComboBox(velocita);
        giocatore6.setSelectedIndex(0);
        giocatore6.addActionListener(this);
        giocatore6.setBounds(0,250,100,20);
        pannello.add(giocatore6);
        giocatore6.setFocusable(false);
        
        start=new JButton("START!");
        start.setBounds(0,400,50,30);
        start.addActionListener(this);
        pannello.add(start);
        start.setFocusable(false);

        //campo=new Grafica(x,y);
        this.add(campo);
        campo.setFocusable(false);

        

        this.setVisible(true);
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String[] velocitaGiocatore={"","","","","",""};
        if(e.getSource()==scriviNome){
            nomeGiocatore=scriviNome.getText();
            System.out.println(nomeGiocatore);
            scriviNome.setFocusable(false);
            scriviNome.setDisabledTextColor(Color.yellow);    
        }
        if(e.getSource()==giocatore1){
            velocitaGiocatore[0]=(String)giocatore1.getSelectedItem();
            System.out.println(velocitaGiocatore[0]);
            velocitaN[0]=converti(velocitaGiocatore[0])+1;
            
        }
        if(e.getSource()==giocatore2){
            velocitaGiocatore[1]=(String)giocatore2.getSelectedItem();
            System.out.println(velocitaGiocatore[1]);
            velocitaN[1]=converti(velocitaGiocatore[1])+1;
        }
        if(e.getSource()==giocatore3){
            velocitaGiocatore[2]=(String)giocatore3.getSelectedItem();
            System.out.println(velocitaGiocatore[2]); 
            velocitaN[2]=converti(velocitaGiocatore[2])+1;
        }
        if(e.getSource()==giocatore4){
            velocitaGiocatore[3]=(String)giocatore4.getSelectedItem();
            System.out.println(velocitaGiocatore[3]);
            velocitaN[3]=converti(velocitaGiocatore[3])+1;
        }
        if(e.getSource()==giocatore5){
            velocitaGiocatore[4]=(String)giocatore5.getSelectedItem();
            System.out.println(velocitaGiocatore[4]);
            velocitaN[4]=converti(velocitaGiocatore[4])+1;
        }
        if(e.getSource()==giocatore6){
            velocitaGiocatore[5]=(String)giocatore6.getSelectedItem();
            System.out.println(velocitaGiocatore[5]);
            velocitaN[5]=converti(velocitaGiocatore[5])+1;
        }
        if(e.getSource()==start){
            setFocusable(true);
            System.out.println("PARTITI!!!");
            //setFocusable(true);
            scriviNome.setFocusable(false);
            
        }   
    }
        public int converti(String velocita){
        if("lento".equals(velocita)) {
            return 0;
        }
        if("medio".equals(velocita)) {
            return 1;
        }
        if("veloce".equals(velocita)) {
            return 2;
        }    
        if("fulmine".equals(velocita)) {
            return 3;
        }
        return -1;
    }
        

    @Override
    public void windowOpened(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent we) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void keyReleased(KeyEvent k) {
       // throw new UnsupportedOperationException("Not supported yet.");
        if(k.getKeyChar()==' '){
            System.out.print("Premuto!");
        }
    }
    
}
