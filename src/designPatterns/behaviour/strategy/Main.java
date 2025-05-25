package designPatterns.behaviour.strategy;

import designPatterns.behaviour.strategy.ducks.DecoyDuck;
import designPatterns.behaviour.strategy.ducks.Duck;
import designPatterns.behaviour.strategy.ducks.MallardDuck;
import designPatterns.behaviour.strategy.ducks.RubberDuck;
import designPatterns.behaviour.strategy.flyBehaviours.RocketPoweredFly;
import designPatterns.behaviour.strategy.quackBehaviours.RedheadDuck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Mallard\t2. Red Head\t3. Decoy\t4. Rubber");
        System.out.println("choose which duck to create");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Duck duck = null;
        switch (choice) {
            case 1 -> duck = new MallardDuck();
            case 2 -> duck = new RedheadDuck();
            case 3 -> duck = new DecoyDuck();
            case 4 -> duck = new RubberDuck();
            default -> System.out.println("Invalid choice!");
        }

        if(duck==null) {
            return;
        }
        System.out.println("Your duck is ready.");
        duck.display();
        System.out.println("Your duck when");
        System.out.print("fly: ");
        duck.fly();
        System.out.print("quack: ");
        duck.quack();

        System.out.println("Do you wanna put rocket powered fly for your duck? Y/N");
        String ans = sc.next();
        if(ans.equals("Y") || ans.equals("y") || ans.equals("Yes") || ans.equals("yes")){
            duck.setFlyBehaviour(new RocketPoweredFly());
            System.out.println("Lets fly your duck with rocket");
            duck.fly();
        }
    }
}
