import java.util.List;

public class Farm {

    List<Animal> animals;
    List<Flower> flowers;
    int pozemek = 100;

   public Farm() {
   }
   //for flower


public void zasadit(){

}
public void zavlazovat (){}
public void sklizet (){}
   // for animal
   public void kupovat(Animal animal){
         animals.add(animal);
         System.out.println("koupili jste "+ animal.type + " named "+ animal.name);

   }
   public  void prodat(Animal animal){
if (animals.contains(animal)){
   animals.remove(animal);
   System.out.println("prodali jste "+ animal.type+ " named "+ animal.name );
}
   }
   public static void pohladit(Animal animal){
      System.out.println("pohladili jste "+ animal.type+" named " + animal.name);
   }




}
