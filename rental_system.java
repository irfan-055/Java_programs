interface vehicle{
    public void start();
    public void stop();
}
interface fuelbased{
    public void refuel();
}
class car implements vehicle,fuelbased{
    public void start(){
        System.out.println("Car engine started");
    }
    public void stop(){
        System.out.println("Car engine stoped");
    }
    public void refuel(){
        System.out.println("Car is refueling at the station");
    }
}
class electricscooter implements vehicle{
    public void start(){
        System.out.println("Electric scooter powered on");
    }
    public void stop(){
        System.out.println("Electric scooter powered off");
    }
}
public class rental_system{

    public static void main(String[] args) {
        car c=new car();
        electricscooter ev=new electricscooter();
        c.start();
        c.stop();
        c.refuel();

        ev.start();
        ev.stop();
    }
}