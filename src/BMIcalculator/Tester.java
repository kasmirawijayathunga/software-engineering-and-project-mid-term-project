/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMIcalculator;

/**
 *
 * @author kasmira
 */

import java.util.Scanner;
import java.util.HashMap;

public class Tester {
    private static Scanner scn = new Scanner(System.in);
    private static HashMap<String, Bmi> userList = new HashMap<String, Bmi>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = displayMenu();
        while (choice != 5){
            
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    index();
                    break;
                case 3:
                    System.out.print("Enter user id: ");
                    int id = scn.nextInt();
                    view(id);
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // Show menu again
            choice = displayMenu();
        }
        exit();
    }

    public static int displayMenu(){
        System.out.println("Please select an option");
        System.out.println("    1) Create a record");
        System.out.println("    2) Show BMI data for all users");
        System.out.println("    3) Show BMI data for a selected user");
        System.out.println("    4) Delete all");
        System.out.println("    5) Exit application");
        System.out.print("Your option: ");
        int choice = scn.nextInt();
        return choice;
    }

    public static void index(){
        for( Bmi obj : userList.values()){
            obj.display();
        }
        System.out.println("---------------------------");
    }

    public static void view(int id){
        userList.get(String.valueOf(id)).display();
        System.out.println("---------------------------");
    }

    public static void create(){
        System.out.print("Enter an ID: ");
        int id = scn.nextInt();
        System.out.print("Enter name: ");
        scn.nextLine();
        String name = scn.nextLine();
        System.out.print("Enter year of birth: ");
        int yob = scn.nextInt();
        System.out.print("Enter height (in meter): ");
        int height = scn.nextInt();
        System.out.print("Enter weight (in kilogram): ");
        int weight = scn.nextInt();
        
        userList.put(String.valueOf(id),new Bmi(id, height, weight, yob, name));
    }

    public static void delete(){
        userList.clear();
    }

    public static void exit(){
        System.out.println("Exiting Application...");
        scn.close();
        System.exit(0);
    }
}
