/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progamamedia;

import java.util.Scanner;
/**
 *
 * @author root
 */
public class ProgamaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua media foi: "+m);
        if(m>9)
        {
            System.out.println("Parbens, pequeno gafanhoto!!");
        }
        
    }
    
}
