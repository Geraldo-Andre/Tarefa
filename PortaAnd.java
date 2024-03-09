public class PortaAnd {

    public boolean a;
    public boolean b;

    public PortaAnd (boolean a, boolean b){
        this.a = a;
        this.b = b;
    }
    public void input () {
        System.out.println("Valores de entrada: ");
        System.out.println(" "+this.a);
        System.out.println(" "+this.b);
        System.out.println("====================");
    }
    public boolean output (boolean x, boolean y){
        return x && y;
    }
}