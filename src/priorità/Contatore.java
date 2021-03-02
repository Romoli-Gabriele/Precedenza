/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorità;

/**
 *
 * @author gabbo
 */
public class Contatore implements Runnable {
   private String n;
    private int v;
  

    public Contatore(String n) {
        this.n = n;
        v = 0;
       
    }
 
    public void run(){
        while(1==1){
    v++;
    System.out.println(n+": "+v);
        }
    }
}
