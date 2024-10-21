public class Animal {
    public void sound(){
        System.out.println("The animal makes a sound ");

    }
}
class Cat extends Animal{
 @Override
    public void sound(){
     System.out.println("The cat meows");
 }
}
class Birds extends Animal{
    @Override
    public void sound(){
        System.out.println("The birds chirps");
    }
}
