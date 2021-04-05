public class SnakeLadderUC4 {

	public static void main(String[] args)
	{

		int random_number=0;

		int Snake_Position1=43;

		int Snake_Position2=65;

		while(random_number < 100 )
		{
			int random_Check=(int)Math.floor(Math.random()*10)%6;

			if(random_Check != 0)
			{
			random_number=random_number+random_Check;
			}

			if(random_number==Snake_Position1)
			{


				System.out.println("Dies Moved to Snakes positions and moved towards backward direction:");

				random_number=0;
			}
			else if(random_number==Snake_Position2)
			{


				System.out.println("Dies Moved to Snakes positions and moved towards backward direction:");

                random_number=0;
			}

			if(random_Check !=0)
			{
			   System.out.println("Dies got a Number "+random_Check+" My Ladder Moved to the position "+random_number);
			}
		}
	}

}
