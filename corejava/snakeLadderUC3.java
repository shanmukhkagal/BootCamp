

public class SnakeLadderUC3 {

	public static void main(String[] args)
	{

		int random_number=0;

		int Snake_Position1=25;

		int Snake_Position2=78;

		while(random_number < 100 )
		{
			int random_Check=(int)Math.floor(Math.random()*10)%6;

			if(random_Check != 0)
			{
			random_number=random_number+random_Check;
			}

			if(random_number==Snake_Position1)
			{


				System.out.println("if Ladder Moved to Snakes positions and moved towards backward direction:");

				random_number=random_number-random_Check;
			}
			else if(random_number==Snake_Position2)
			{

                System.out.println("if Ladder Moved to Snakes positions and moved towards backward direction:");

                random_number=random_number-random_Check;
			}

			if(random_Check !=0)
			{
			   System.out.println("Ladder got a Number "+random_Check+" My Ladder Moved to the position "+random_number);
			}
		}
	}

}
