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
public class Priorità {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread C1 = new Contatore("Bassa");
       C1.setPriority(1);
       Thread C2 = new Contatore("Normale");
       C2.setPriority(5);
       Thread C3 = new Contatore("Alta");
       C3.setPriority(10);
       
       
       C3.start();
       C2.start();
       C1.start();
       
long start = System.currentTimeMillis();
long end = start + 5*1000;
while (System.currentTimeMillis() < end) {
       
}
       C1.stop();
       C2.stop();
       C3.stop();
       
   
       
    }
    
}
