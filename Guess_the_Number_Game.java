//Guess the Number games
import java.util.Scanner;
import java.util.Random;
class Guess_the_Number_Game
{
    public static void main(String args[])
    {
        int repeat=9,round=1,score=0,Total_score=0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        do{
        int random = rand.nextInt(100);
        int correct=0,iterations=1,diff,no_of_iterations;
        String start;
        
        System.out.println("\nGUESS THE NUMBER -GAME");
        System.out.println("------------------------");
        
        System.out.println("Choose the Difficulty Level : ");
        System.out.println("-----------------------------");
        System.out.println("ENTER '1' for BEGINNER Level Difficulty (ATTEMPTS : 20) \nENTER '2' for NORMAL Level Difficulty (ATTEMPTS : 10) \nENTER '3' for VETERAN Level Difficulty (ATTEMPTS : 5)");
        System.out.println();
        System.out.println("Press 'ENTER' to start the game....");
        start=sc.nextLine();
        if(start.equals(""))
        {
        System.out.print("Enter the Difficulty Level : ");
        diff=sc.nextInt();
        System.out.println();
        System.out.println("--------------------------------------");
        if(diff==1)
        {
           no_of_iterations=20;
        }
        else if(diff==2)
        {
            no_of_iterations=10;
        }
        else{
            no_of_iterations=5;
        }
        System.out.println("Rules : Guess the Number between 0-100");
        System.out.println("      : Total Attempts -> "+no_of_iterations);
        System.out.println("---------------------------------------");
        while(iterations<=no_of_iterations && correct==0)
        {
        System.out.print("Guess the number : ");
        int guess = sc.nextInt();
        if(guess==random)
        { 
            correct++;
            System.out.println("---------------------------------------------");
            System.out.println("You Guessed it CORRECT!!");
            System.out.println("Number of Iterations you took : "+iterations);
            score=iterations*10;
            System.out.println();
            System.out.println("SCORE For this Round : "+score);
            System.out.println("---------------------------------------------");
            Total_score = Total_score+score;
        }
        else if(guess>random)
        {
            System.out.println("Your guess is TOO HIGH");
            iterations++;
        }
        else if(guess<random)
        {
            System.out.println("Your guess is TOO LOW");
            iterations++;
        }
    }
    if(iterations>no_of_iterations)
    {
        System.out.println("All Attempts Exhausted, Better Luck next time!!");
        System.out.println();
    }
    System.out.println("Do you Want to play another round? Enter '1' for YES and '0' for NO");
    System.out.print("Your choice : ");
    repeat=sc.nextInt();
    if(repeat==1)
    {
        round=round+1;
    }
    else{
        System.out.println("---------------------------------------------");
        System.out.println("Total Rounds Played : "+round);
        System.out.println("Total Score : "+Total_score);
        System.out.println("---------------------------------------------");
    }
    start=new String();
}
}
while(repeat==1);
sc.close();
}
}
