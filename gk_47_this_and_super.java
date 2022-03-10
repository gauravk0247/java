class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }

    public int returnone(){
        return 1;
    }
}

class Doclass extends EkClass{
    Doclass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class gk_47_this_and_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        System.out.println(e.getA());
        Doclass d = new Doclass(5);
    }
}
