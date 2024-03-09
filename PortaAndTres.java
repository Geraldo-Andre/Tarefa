    /**
    6 * Esta classe  simula a porta logica And.
    8 * @author Geraldo Pedro Andre.
    9 */
public class PortaAndTres {
    //Atributos
    public boolean a;
    public boolean b;
    public boolean c;

    /**

    Faz a operacao logica AND a partir de dois valores de entrada

    @param a O primeiro bit a ser digitado.

    @param b O segundo bit da digitado.

    @param c O terceiro bit da digitado.

    */
    public PortaAndTres (boolean a, boolean b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**

    Mostra os valores de entrada.

    */
    public void input () {
        System.out.println("Valores de entrada: ");
        System.out.println(" "+this.a);
        System.out.println(" "+this.b);
        System.out.println(" "+this.c);
        System.out.println("====================");
    }

    /**

    Devolve o valor logico da operacao
    @param x primeiro bit a ser digitado.
    @param y segundo bit a ser digitado
    @param z terceiro bit a ser digitado
    @return O valor logico.

    */
    public boolean output (boolean x, boolean y, boolean z){
        return x && y && z;
    }
}
