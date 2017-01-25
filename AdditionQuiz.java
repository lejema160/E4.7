import java.util.Scanner;

public class AdditionQuiz {
	
	public static int[] first = new int [10];
	public static int[] second = new int [10];
	public static int[] answers = new int[10];

	public static void main(String[] args) {
		System.out.println("!! WELCOME IN THE ADDITION QUIZ !!");
		System.out.println("There is ten additions... Let's go !");
		getQuiz();
		answerQuiz();
		endQuiz();
	}
	
	public static void getQuiz(){
		for (int i=0; i<10; i++){
			first[i] = (int)(Math.random()*(150+1));
			second[i] = (int)(Math.random()*(150+1));
		}
	}
	
	public static void answerQuiz(){
		for (int i=0; i<10; i++){
			System.out.println("Question "+(i+1)+" : "+first[i]+" + "+second[i]+" = ?");
			Scanner sc = new Scanner(System.in);
			answers[i]=sc.nextInt();
		}
		System.out.println("");
		System.out.println("The Quiz is OVER!");
		System.out.println("");
	}
	
	public static void endQuiz(){
		int score = 0;
		for (int i=0; i<10; i++){
			int result = first[i]+second[i];
			int j=i+1;
			System.out.println(j);
			System.out.println("Question "+j+" : "+first[i]+" + "+second[i]+" = "+result);
			System.out.println("You answered : "+answers[i]);
			if (answers[i]==result) {
				System.out.println("It's right ! You win a point.");
				score++;
			}
			else System.out.println("It's wrong ! You don't win a point...");
		}
		System.out.println("");
		System.out.println("The quiz is over, your score : "+score+"/10");
	}

}
