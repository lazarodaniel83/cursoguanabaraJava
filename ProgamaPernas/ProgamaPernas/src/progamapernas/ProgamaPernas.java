
package progamapernas;
import java.util.Scanner;

public class ProgamaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas do animal.");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch(perna)
        {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                
        }
        System.out.println(tipo);
    }
    
}
