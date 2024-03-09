import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n1, n2, n3;
        boolean b1=false, b2=false, b3=false;
        Scanner leitura = new Scanner(System.in);

        do{
            System.out.println("Entre como um valor:");
            n1 = leitura.nextInt();
        }while(n1<0 || n1>1);
        
        do{
            System.out.println("Entre como um valor:");
            n2 = leitura.nextInt();
        }while(n2<0 || n2>1);

        do{
            System.out.println("Entre como um valor:");
            n3 = leitura.nextInt();
        }while(n3<0 || n3>1);
        
        if(n1 == 1)
            b1 = true;
        
        if(n2 == 1)
            b2 = true;

        if(n3 == 1)
            b3 = true;

        
        

        PortaAndTres port3 = new PortaAndTres(b2, b1, b3);
        port3.input();
        System.out.println("saida: "+ port3.output(b2, b1, b3));
    }
}
