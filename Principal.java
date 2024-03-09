import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n1, n2;
        boolean b1=false, b2=false;
        Scanner leitura = new Scanner(System.in);

        do{
            System.out.println("Entre como um valor:");
            n1 = leitura.nextInt();
        }while(n1<0 || n1>1);
        
        do{
            System.out.println("Entre como um valor:");
            n2 = leitura.nextInt();
        }while(n2<0 || n2>1);
        
        if(n1 == 1)
            b1 = true;
        
        if(n2 == 1)
            b2 = true;

        PortaAnd port = new PortaAnd(b1, b2);
        port.input();
        System.out.println("saida: "+ port.output(b1, b2));
        
    }
}
