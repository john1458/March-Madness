import java.util.Scanner;
import java.util.Random;

class ChooseBetweenTwo {
    
    //main method
    public static void main(String[] args) {
        ChooseBetweenTwo obj = new ChooseBetweenTwo();
        
        System.out.println(obj.run()); //change run to finalScore at the end   
    }
 
    //1 = higher seed (1 - 8) 
    //2 = lower seed (9 - 16)
    public int run() {
        
        
        Random rand = new Random();
        
        
        int r = rand.nextInt(3); //Gives #1 seed higher odds (2/3)
        if (r == 2) {
            return 2;
        }
        
        else {
            return 1;
        }
        
    }
    
    //Will run until the first score > second
    
    public String finalScore() {
        ChooseBetweenTwo cbt = new ChooseBetweenTwo();
        Random rand = new Random();
        int teamOne = rand.nextInt(40) + 60; // Minimum score is 60, max 100
        int teamTwo = rand.nextInt(40) + 60;
        
        while (teamOne < teamTwo) { //Makes sure first score > second
            cbt.finalScore();
        }
        return(teamOne + "\t" + teamTwo);
        
    }
    
}
