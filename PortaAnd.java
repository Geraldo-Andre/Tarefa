    /**
    6 * Esta classe  simula a porta logica And.
    8 * @author Geraldo Pedro Andre.
    9 */
public class PortaAnd {
    //Atributos
    public boolean a;
    public boolean b;

    /**

    Faz a operacao logica AND a partir de dois valores de entrada

    @param a O primeiro bit a ser digitado.

    @param b O segundo bit da conta.

    */
    public PortaAnd (boolean a, boolean b){
        this.a = a;
        this.b = b;
    }

    /**

    Mostra os valores de entrada.

    */
    public void input () {
        System.out.println("Valores de entrada: ");
        System.out.println(" "+this.a);
        System.out.println(" "+this.b);
        System.out.println("====================");
    }

    /**

    Devolve o valor logico da operacao
    @param x primeiro bit a ser digitado.
    @param y segundo bit a ser digitado
    @return O valor logico.

    */
    public boolean output (boolean x, boolean y){
        return x && y;
    }
}