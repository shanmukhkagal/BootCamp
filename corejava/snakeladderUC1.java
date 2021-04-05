class snakeLadderUC1
{
     public static void main(String[] args)
     {
           int singe_player_position = 0;

           System.out.println("Games starts wit "+ singe_player_position);  
           int random = (int)Math.floor(Math.random() * 10)%6;
           if(random!=0)
{
            
            singe_player_position= singe_player_position+random;
              System.out.println("player moved to  "+ singe_player_position);
 
            }  

           
     }
          
          
}
