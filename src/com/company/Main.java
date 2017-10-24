package com.company;
//Travis Gray
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> ingredients = new ArrayList<String>();
        ArrayList<String> directions = new ArrayList<String>();

        int option = 0;
        String newingredient ="";
        String m = "";
        String newstep = "";


        //Adding ingredientents to Array List
        ingredients.add("whole chicken ");
        ingredients.add("butternut squash");
        ingredients.add("coriander ");
        ingredients.add("Thai red curry paste");
        ingredients.add(" coconut milk ");
        //Adding directions to Array List

        directions.add("Sit the chicken in a large, deep pan. ");
        directions.add("Carefully halve the squash lengthways");
        directions.add("Slice the coriander stalks, add to the pan with the squash, curry paste and coconut milk");
        directions.add(" Pour in 1 litre of water");
        directions.add("Cover and simmer on a medium heat for 1 hour 20 minutes");

        do {

            //Display menu to user ask for prompt
            System.out.println("This recipe is Packed full of flavour, from Jamie's 5 Ingredients – Quick & Easy cookbook is just delicious!");
            System.out.println("Please read the following options to modify the recipe");
            System.out.println("1.Add a new ingredient");
            System.out.println("2.Delete an ingredient");
            System.out.println("3.Add a new Step");
            System.out.println("4.Print this delicious recipe now!");
            System.out.println("5.Type any number greater than or equal to 5 to Quit");
            System.out.println("Please type a number: ");
            option = keyboard.nextInt();
            keyboard.nextLine();


            if (option == 1) {
                do {
                    System.out.println("Enter your ingredient to add to Ingredients section: ");
                    newingredient = keyboard.nextLine();

                    //Add new ingredient to arrayList ingredients
                    ingredients.add(newingredient);
                    System.out.println("Do you want to type another ingredient yes/no");
                    m = keyboard.nextLine();
                } while (m.equalsIgnoreCase("yes") && !m.equalsIgnoreCase("no"));}

                if (option == 2) {
                    System.out.println("Enter the ingredient you would like to Delete?");
                    newingredient = keyboard.nextLine();
                    //Search if ingredients is included in list
                    if (ingredients.contains(newingredient)) {

                        //Remove ingredients for ingredients list
                        ingredients.remove(newingredient);
                    } else {
                        System.out.println("Ingredient is included in recipe");
                    }
                }


                if (option == 3) {
                    do {
                        System.out.println("Enter your steps of your recipe?");
                        newstep = keyboard.nextLine();
                        directions.add(newstep);
                        System.out.println("Would you like to add a new step to your recipe?");
                        m = keyboard.nextLine();
                    } while (m.equalsIgnoreCase("yes") && !m.equalsIgnoreCase("no"));
                }

                //Print out
                if (option == 4) {
                    System.out.println("<---------------INGREDIENTS---------------->");
                    for (Object eachingred: ingredients
                         ) {
                        System.out.println(eachingred);

                    }
                    System.out.println("<----------------DIRECTIONS---------------->");
                    for (Object eachstep:directions
                         ) {
                        System.out.println(eachstep);
                    }
                }
        } while (option <= 5) ;

    }
}
