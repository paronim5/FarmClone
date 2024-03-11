public class Main {
    public static void main(String[] args) {
        Farm f1 = new Farm();
     Animal a1= new Frog("frog","petr",Size.SMALL,"none");
Farm.pohladit(a1);
f1.kupovat(a1);
f1.prodat(a1);
    }
}