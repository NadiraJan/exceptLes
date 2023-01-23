package be.nadira;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Car car = new Car(0, 4, true);
        System.out.println("Car is driving");

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your fm radiostation:");
        String input = kbd.next();
        try {
            int radiostation = Integer.parseInt(input);
            car.setRadiostation(radiostation/0);
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("There was an exception");
        } catch (ArithmeticException e){
            e.printStackTrace();

        } finally {
            System.out.println("run this code anyway");
            kbd.close();
        }

            System.out.println("Car is still driving");
        }

    }
