/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alessio
 */
public class Grafica extends JPanel implements ActionListener,KeyListener {
    public JLabel prova1;
    public int x,y;
    public Corridore atleta0,atleta1,atleta2,atleta3,atleta4,atleta5;
    @Override
    public int getX(){return x;}
    @Override
    public int getY(){return y;}
    
            
            
            
    public Grafica(){
        this.setLayout(null);
        this.setBounds(getX()/3,0,getX()-(getX()/3),getY());
        
            atleta0=new Corridore(200,20*1,0);
            atleta1=new Corridore(200,20*2,1);
            atleta2=new Corridore(200,20*3,2);
            atleta3=new Corridore(200,20*4,3);
            atleta4=new Corridore(200,20*5,4);
            atleta5=new Corridore(200,20*6,5);
            
                for(int i=0;i<200;i++) {
                    atleta0.run();
                    atleta1.run();
                    atleta2.run();
                    atleta3.run();
                    atleta4.run();
                    atleta5.run();
                }
                prova1=new JLabel("prova");
                prova1.setBounds(400, 250, 100, 20);
                //this.add(prova1);
                this.setVisible(true);
                this.repaint();
    }   
    
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()/3,0, this.getX()-(this.getX()/3), this.getY());
        /*
        for(int a=0;a<6;a++){
            for(int i=0;i<1200;i++){
                g.drawLine(atleti[a].getX(),atleti[a].getY(),atleti[a].getX(),atleti[a].getY());
                atleti[a].avanza
        }
                }*/
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
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
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
