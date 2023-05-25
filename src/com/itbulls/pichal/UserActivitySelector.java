package com.itbulls.pichal;
import java.util.Scanner;
public class UserActivitySelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please, enter action name: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		switch (userInput){
		    case "login":
		        System.out.println("enter ur username");
		        break;
		        case "sign_up":
		        System.out.println("welcome");
		        break;
		        case "terminate_program":
		        System.out.println("bye!");
		        break;
		         case "main_menu":
		        System.out.println("menu");
		        break;
		        case "about_app":
		        System.out.println("created by Pichal");
		        break;
		        default:
		        System.out.println("choose other word");
		        
		}
	}

}
