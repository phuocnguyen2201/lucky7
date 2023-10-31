import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        
        Car car1 = new Car();

        car1.printData();
        car1.accelerate();
        car1.printData();

        System.out.println("Enter the amount of fuel to refuel: ");
        car1.refuel(in.nextInt());

        System.out.println("---------------------------------");
        System.out.println();

        Car car2 = new Car("Toyota", "Camry", 10);

        car2.printData();
        car2.accelerate();
        car2.printData();

        System.out.println("Enter the amount of fuel to refuel: ");
        car2.refuel(in.nextInt());
    }
        // 1. Function to check if the number is 7 or not.
    public static boolean lucky7() {
        Random rand = new Random();
		
		int[] arr = new int[3];
		int max = 10;
		int min = 1;
		boolean flag = false;
		
		for(int i = 0; i<2; i++) {
			arr[i]= rand.nextInt((max - min) + 1) + min;
		}
		
		for(int item : arr) {
			System.out.print(item+" ");
            if(!flag && item ==7)
                flag =true;
		}
        System.out.println();
        if(flag)
            System.out.println("You won");
        else
            System.out.println("You lost");
            return flag;
    }
}

class Car{
    public String brand;
    public String model;
    public int amountOfFuel;

    public Car(){
        brand = "BMW";
        model = "i3";
        amountOfFuel = 100;
    }

    public Car(String brand, String model, int amountOfFuel){
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }

    void brake(){
        System.out.println("Car is Braking.");
    }

    void accelerate(){
        System.out.println("Car is Accelerating.");
        amountOfFuel = amountOfFuel-- > 0 ? amountOfFuel : 0;
    }
    void printData(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Amount of fuel: "+amountOfFuel);
    }

    void refuel(int amountOfFuel){
        this.amountOfFuel += amountOfFuel;
        System.out.println("Amount of fuel: "+this.amountOfFuel);
    }
}

class Controller {

    boolean powerButton;
    boolean selectButton;
    boolean menuButton;
    boolean arrowUp;
    boolean arrowDown;
    int volume;

    //Default constructor.
    public Controller() {
        powerButton = false;
        menuButton = true;
        volume = 5;
    }

    // Constructor with menu button signal as parameter.
    public Controller(boolean menuButton){
        this.powerButton = true;
        this.menuButton = menuButton;
        volume = 5;
    }

    // power on and off the machine.
    boolean powerOnOff() {
        return powerButton == false ? true :false;
    }

    //Signal from menu button.
    boolean showMainMenu() {
        return menuButton;
    }
    
    //Initialize sequense and log to the console. 
    void initializePower(){
        System.out.println("Power status: " + powerButton);
        System.out.println("Initializing ...");
        powerOnOff();

        System.out.println("Power status: " + powerOnOff());

        showMainMenu();

        System.out.println("Signal from menu button: " + (showMainMenu() == true? "Good signal"  : "Bad singal"));

        System.out.println("Volume value: " + volume);
    }

    //Change volume value.
    void changeVolumeValue(int volume){

        // Validate volume value must be within from 0 to 10.
        this.volume = volume > 11 ? 10 : volume < 0 ? 0 : volume;

        // Log to the console on why the volume value is not within the range.
        if(volume > 11 || volume < 0)
            System.out.println("Volume value is from [0 - 10]");

        System.out.println("Volume: " + this.volume);
        //Testing comment
    }
}
