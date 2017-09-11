/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corse;

/**
 *
 * @author Alessio
 */
public class Corridore implements Runnable {
    //coordinate del corridore e nome
    private int x;
    private int y;
    private String nome;
    private int velocita;
    
    public Corridore(int x, int y,String nome,int velocita){
        this.x=x; 
        this.y=y;
        this.nome=nome;
        this.velocita=velocita+1;
    }
    public Corridore(int x, int y,int velocita){
        this.x=x;
        this.y=y;
        this.velocita=velocita+1;
        this.nome="prova "+this.velocita;
        
        
    }
    public void avanza(){
        x+=(velocita*1);
        System.out.println(x);
        System.out.println(nome);
        
    }
    public int getX(){ return this.x;}
    public int getY(){ return this.y;}
    public String getNome(){return this.nome;}
    public void setVelocita(int velocita){this.velocita=velocita;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}

    @Override
    public void run() {
        x+=(velocita*1);
        System.out.println(x);
        System.out.println(nome);}
    
}