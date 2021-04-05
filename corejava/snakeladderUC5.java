public class SnakeLadderUC5 {

	public static void main(String[] args)
	{
		int ladder_Position=0;

		while(ladder_Position<100)
		{
			int random_Check=(int)Math.floor(Math.random()*10)%6;
			if(random_Check!=0)
			{

				ladder_Position=ladder_Position+random_Check;

				System.out.println(ladder_Position);



				if(random_Check+ladder_Position==100)
				{
					System.out.println(random_Check+" "+ladder_Position);

					break;
				}


			}


		}
	}

}
