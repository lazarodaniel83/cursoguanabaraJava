
package operadorternario;


public class OperadorTernario {

    public static void main(String[] args) 
    {
        /*int n1,n2,r;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1;
        
        System.out.println(r);
      
        String nome1 = "Daniel";
        String nome2 = "Lazaro";
        String nome3 = new String ("Daniel");
        String res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
         */
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y==z)?true:false;
        System.out.println(r);
    }
    
}
