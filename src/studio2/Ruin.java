package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Amount of money you want to start with: ");
		double startAmount = in.nextDouble();
		System.out.println("Win probability (0-.99): ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to play: ");
		int daysplayed = in.nextInt();
		double y = startAmount;
		int totalwin = 0;
		int totalloss = 0;
		for(int day = 1; day<=daysplayed; day++)
		{
			int x = 0;
			int gamewon = 0;
			int gamelost = 0;
			while (startAmount <= winLimit && startAmount>0) {
				if (Math.random() <= winChance)
				{
					startAmount ++;
					gamewon ++;
					totalwin ++;
				}
				else
				{
					startAmount --;
					gamelost ++;
					totalloss ++;
				}
				x++;
			}
			System.out.println("Day " + day +  " total games played: " + x);
			System.out.println("Games won on Day " + day +  ": " + gamewon);
			System.out.println("Games lost on Day " + day +  ": " + gamelost);
			startAmount = y;
			

		}
		System.out.println("In " + daysplayed + " games, you won " + totalwin + " games");
		double a = (double)totalwin/(totalwin + totalloss);
		double m = Math.round(a*100.0)/100.0;
		System.out.println("This means you won " + (
				m*100) + "% of the time");
		
	}


}