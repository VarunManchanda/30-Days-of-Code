import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;
    static int x;
    private int sum = 0;
    static private int avg = 0;
    public Student(String name, String lastname, int id, int[] scores){
        super(name, lastname, id);
        x = scores.length;
        testScores = new int[x];
        for(int i=0; i<x; i++){
            testScores[i] = scores[i];
            sum += testScores[i];
        }
        //testScores = scores;
        calculate();
        
    }
    public char calculate(){
        char sol = 'l';
        for(int j=0; j<x; j++){
            avg = sum/x;
            if(90<=avg && avg<= (int)100)
                sol = 'O';
            else if(80<=avg && avg< (int)90)
                sol = 'E';
            else if(70<= avg && avg< (int)80)
                sol =  'A';
            else if(55<= avg && avg< (int)70)
                sol = 'P';
            else if(40<= avg && avg<(int)55)
                sol = 'D';
            else if(avg<(int)40)
                sol = 'T';
            
        }
return sol;
        
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
