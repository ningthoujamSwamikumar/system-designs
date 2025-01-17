package structural.decorator;

import structural.decorator.components.Cappuccino;
import structural.decorator.components.Coffee;
import structural.decorator.components.Expresso;
import structural.decorator.decorators.Biscuit;
import structural.decorator.decorators.Cream;
import structural.decorator.decorators.Sugar;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your order?");
        System.out.println("\t1. Cappuccino \t2. Expresso");
        Scanner sc = new Scanner(System.in);
        Coffee coffee = null;
        int inputCoffee = sc.nextInt();
        if(inputCoffee==1){
            coffee = new Cappuccino();
        }else if(inputCoffee==2){
            coffee = new Expresso();
        }else{
            System.out.println("Invalid choice of coffee!");
            exit(1);
        }
        System.out.println("Please select your add ons - ");
        System.out.println("\t1. Cream\t2. Sugar\t3. Biscuit\t4. Done");
        while(true){
            int inputAddon = sc.nextInt();
            switch (inputAddon){
                case 1: coffee = new Cream(coffee); break;
                case 2: coffee = new Sugar(coffee); break;
                case 3: coffee = new Biscuit(coffee); break;
                case 4: break;
                default:
                    System.out.println("Invalid add on option provided!");
                    exit(1);
            }
            if(inputAddon==4) break;
        }

        int totalCost = coffee.cost();
        System.out.println("total cost: " + totalCost);
    }
}
