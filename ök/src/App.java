import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        

        String[][] map = new String[5][5];

        int playerRow = 2;
        int playerCol = 2;

        map[0][0] = "Strand";
        map[0][1] = "Strand";
        map[0][2] = "Strand";
        map[0][3] = "Strand";
        map[0][4] = "Avgrund";

        map[1][0] = "Berg";
        map[1][1] = "Flod";
        map[1][2] = "Vetefält";
        map[1][3] = "Skog";
        map[1][4] = "Avgrund";

        map[2][0] = "Berg";
        map[2][1] = "Slumpmark";
        map[2][2] = "Stad";
        map[2][3] = "Mörk skog";
        map[2][4] = "Avgrund";

        map[3][0] = "Berg";
        map[3][1] = "Slumpmark";
        map[3][2] = "Skog";
        map[3][3] = "Skog";
        map[3][4] = "Avgrund";

        map[4][0] = "Den stora muren";
        map[4][1] = "Den stora muren";
        map[4][2] = "Den stora muren";
        map[4][3] = "Den stora muren";
        map[4][4] = "Avgrund";



        
        boolean isGameRunning = true;




        while(isGameRunning)
        {

        System.out.println("Nuvarande Plats " +map[playerRow][playerCol]);

        Scanner tb = new Scanner(System.in);


        System.out.println("Tryck på W för att röra dig uppåt");
        System.out.println("Tryck på A för att röra dig nedåt");
        System.out.println("Tryck på S för att röra dig åt höger");
        System.out.println("Tryck på D för att röra dig åt vänster");

        String input = tb.nextLine();

        if(input.equalsIgnoreCase("W"))
        {
            playerRow--;
        }
        else if(input.equalsIgnoreCase("A"))
        {
            playerCol--;
        }
        else if(input.equalsIgnoreCase("S"))
        {
            playerRow++;
        }
        else if(input.equalsIgnoreCase("D"))
        {
            playerCol++;
        }
        else if(input.equalsIgnoreCase("Q"))
        {
            isGameRunning = false;
        }
        


        if(playerRow==-1)
        {
            playerRow++;
        }
        if(playerRow==5)
        {
            playerRow--;
        }
        if(playerCol==-1)
        {
            playerCol++;
        }
        if(playerCol==5)
        {
            playerCol--;
        }





        
        }
    }

    
}
