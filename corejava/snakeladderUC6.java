 public class SnakeLadderUC6 {

	public static void main(String[] args)
	{

		int dies_Count=0;

		int snake_Position1=42;

		int snake_Position2=72;

		int random_number=0;


		while(random_number<100)
		{
			int random_Check=(int)Math.floor(Math.random()*10)%6;

			if(random_Check !=0)
			{
				random_number=random_number+random_Check;

				dies_Count=dies_Count+1;
			}

			if(random_number==snake_Position1)
			{

				random_number=0;

				System.out.println("My Dies meets the Snakes position and Moved to "+random_number);

			}

            else if(random_number==snake_Position2)
			{

				random_number=0;

				System.out.println("My Dies meets the Snakes position and Moved to "+random_number);
			}

			if(random_Check !=0 )
			{

			System.out.println("Dies got a Number "+random_Check+" Moved to the position " +random_number);

			}
		}

		System.out.println("Number of Counts "+dies_Count);
	}

}

