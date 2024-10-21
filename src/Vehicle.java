public abstract class Vehicle {
    protected int speed = 0;
    public void speedUp(){
        System.out.println("The vehicle speeds up ");
    }
    public int getspeed(){
        return speed;
    }

    public abstract void speedup();
}
class Bicycle extends Vehicle{
    @Override
    public void speedup(){
        speed+=3;
        System.out.println("The bicycle pedals faster.Current speed;"+ speed+"km/h");

    }
}
class Car extends Vehicle{
    @Override
    public void speedup(){
        speed+=10;
        System.out.println("The car accerlerates.Current speed;"+ speed+"km/h");

    }
}