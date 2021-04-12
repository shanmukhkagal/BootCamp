 class snakeladderUC7
{
     public static void main(String[] args) {
           int snake_position = 25;
           int snake_position1=55;
           int player_position1=0;
           int player_position2=0;
          
	     while (player_position1<=100) {
        	   int random_check1 = (int)Math.floor(Math.random()* 10)%6;
        	   int random_check2 = (int)Math.floor(Math.random()* 10)%6;
        	   if(random_check1!=0) {
        		  player_position1=player_position1+random_check1;
        		  player_position2=player_position2+random_check2;
                          System.out.println("Dies moved to te position "+ player_position1);
                           System.out.println("Dies moved to te position "+ player_position2);
		   }
			   if(player_position1==snake_position) {
                             System.out.println("Snake");
			      player_position1=0;
			   }
	            if(player_Position1 == ladder_Position) { 
		System.out.println("Player1's Dies meets the Ladder..........");
		player_Position1 = new_Ladder_Position;
	    }
	   else if(player_Position2 == ladder_Position) { 
		System.out.println("Player2'sDies meets the Ladder..........");
		player_Position2 = new_Ladder_Position;  
	   }
	   if(random_Check1 != 0 && random_Check2 != 0) {
	       System.out.println("First Person Dies :"+player_Position1);
	       System.out.println("Second Person dies :"+player_Position2);
	   }
	   if(player_Position1 >= 100) {
	        System.out.println("First Person Won the Game................................");
		break;
	   }
	   else if(player_Position2 >= 100) {
		System.out.println("Second Person won the Game................................");
		break;
	     }	
	}
    }
}
