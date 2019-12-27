import java.util.*;
/*
Steven Li
31647656
Assignment 11
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that defines methods to interact with arrays
 */
public class collections{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List <String> test = new ArrayList<String>();

//		System.out.println("Keep entering names, please type 0 to exit");
//		String keepGoing = scn.nextLine();
		Set <String> original = new HashSet<String>();
		Map <String, Integer> phoneBook = new HashMap<String, Integer>();
		List <String> woah = new Stack<String>();
		List <String> list = new LinkedList<String>();
	

		//Problem 1
//		while(!keepGoing.equals("0")) {
//			test.add(keepGoing);
//			System.out.println("Keep entering strings, please type 0 to exit");
//			keepGoing = scn.nextLine();
//		}
//		System.out.println("Now enter Strings to check whether or not they are in the list. Type 0 to exit");
//		keepGoing = scn.nextLine();
//		while(!keepGoing.equals("0")) {
//			if(test.contains(keepGoing)) {
//				System.out.println("It's here at index: " + test.indexOf(keepGoing));
//			}
//			System.out.println("That's not here. Keep entering strings, please type 0 to exit");
//			keepGoing = scn.nextLine();
//		}

		

		
		//Problem 2
//		while(!keepGoing.equals("0")){
//			original.add(keepGoing);
//			System.out.println("Keep entering names!");
//			keepGoing = scn.nextLine();
//		}
//		System.out.println("Now enter Strings to check whether or not they are in the list. Type 0 to exit");
//		keepGoing = scn.nextLine();
//		while(!keepGoing.equals("0")) {
//			if(original.contains(keepGoing)) {
//				System.out.println("It's here!");
//			}if(!original.contains(keepGoing)) {
//				System.out.println("It's not here!");
//			}
//			System.out.println("Keep entering strings, please type 0 to exit");
//			keepGoing = scn.nextLine();
//		}
		
		

		//Problem 3
//		while(!keepGoing.equals("0")) {
//			String[] splitKeep = keepGoing.split(" ");
//			phoneBook.put(splitKeep[0], Integer.parseInt(splitKeep[1]));
//			System.out.println("Keep entering strings, please type 0 to exit");
//			keepGoing = scn.nextLine();
//		}
//		System.out.println("Now enter names to get their numbers! Please type 0 to exit");
//		keepGoing = scn.nextLine();
//		while(!keepGoing.equals("0")) {
//			if(!phoneBook.containsKey(keepGoing)) {
//				System.out.println("The phone book does not contain that name! Please enter a new one");
//				keepGoing = scn.nextLine();
//			}else {
//				System.out.println(keepGoing+ "'s number is: "+ phoneBook.get(keepGoing));
//				System.out.println("Now enter a new name! Please type 0 to exit");
//				keepGoing = scn.nextLine();
//			}
//		}
		
		List <String> bom = new ArrayList<String>();
		bom.add("Steven");
		bom.add("Ryan");
		bom.add("Miles");
		bom.add("Anish");
		bom.add("Larry");
		
		if(quizQuestion(bom, "Miles")) {
			System.out.println("Yes!");
		}else {
			System.out.println("No!");
		}

		

	}
	
	public static boolean quizQuestion(List<String> test,String find) {
		boolean answer = false;
		for(int i = 0; i < test.size(); i++) {
			if(find.equalsIgnoreCase(test.get(i))) {
				answer = true;
			}
		}
		return answer;
		
	}
}
