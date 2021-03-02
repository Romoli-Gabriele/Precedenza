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
        Runnable C1 = new Contatore("Bassa");
	Thread T1 = new Thread(C1);
       T1.setPriority(1);
       Runable C2 = new Contatore("Normale");
	Thread T2 = new Thread(C2);
       T2.setPriority(5);
       Runnable C3 = new Contatore("Alta");
	Thread T3 = new Thread(C3);
       T3.setPriority(10);
       
       
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
