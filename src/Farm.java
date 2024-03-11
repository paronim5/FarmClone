import java.util.List;

public class Farm {

   private List<Animal> animals;
   private List<Flower> flowers;
   private int pozemek = 100;
   //for flower

public void zasadit(){
}
public void zavlazovat (){}
public void sklizet (){}
   // for animal
   public void kupovat(){}
   public void prodat(){}
   public void pohladit(Animal animal){
      System.out.println("pohladili jste "+ animal.name);
   }




}
