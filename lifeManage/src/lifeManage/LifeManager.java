package lifeManage;

import java.util.Scanner;

import Profile.User;

public class LifeManager {

	static User me = new User("niki");
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.print("==> ");
			String input = in.nextLine();
			String[] cmd = input.split(" ");
			System.out.println(CmdParser.ParseCommand(cmd));
				
			//TODO more cases
		}
		
		
		
	}
}
