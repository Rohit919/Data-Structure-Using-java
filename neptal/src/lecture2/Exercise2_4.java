package lecture2;
class Answer{
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){	
		this();
		System.out.println("You got "+marks+" for an "+ type);
	}
} 
public class Exercise2_4 {
	// This is the main class Question
	public static void main(String[] args) {
		Answer a = new Answer(10, "MCQ");
	}
}
