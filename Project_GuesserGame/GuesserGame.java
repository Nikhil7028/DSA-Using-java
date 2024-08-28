
package Project_GuesserGame;
import java.util.Scanner;
class Guesser {
    int guserNum;
    int GuesserNum(){
        System.out.print("\nEnter the the gusser num: ");
        Scanner sc=new Scanner(System.in);
        guserNum=sc.nextInt();
        return guserNum;
    }
}

class Player {
    int plyerNum;
    int PlayerNum(){
        Scanner sc=new Scanner(System.in);
        plyerNum=sc.nextInt();
        return plyerNum;
    } 
}

class Umpire{
    int gussernum;
    int player1;
    int player2;
    int player3;

    void collectGusserNum(){
        Guesser gu= new Guesser();
        gussernum=gu.GuesserNum();
    }
    // collect number from all the players
    void collectPlayerNum(){
        System.out.print("\n Enter the player 1 num: ");
        Player p1= new Player();
        player1= p1.PlayerNum();

        System.out.print("\n Enter the player 2 num: ");
        Player p2= new Player();
        player2= p2.PlayerNum();

        System.out.print("\n Enter the player 3 num: ");
        Player p3= new Player();
        player3= p3.PlayerNum();
    }

    // check 
    void check(){
        if(gussernum==player1){
            if (gussernum == player2 && gussernum == player3) {
                System.out.println("All the player will won the game");                
            }
            else if (gussernum==player3) {
                System.out.println("player 1 and player 3 won the game");                
            }
            else if (gussernum == player2) {
                System.out.println("Player 1 and player 2 won the game");                
            }
            else{
                System.out.println("only player 1 won the game");
            }
        }
        else if (gussernum==player2) {
            if (gussernum==player3) {
                System.out.println("Player 2 and player 3 won the game");                
            }
            else{
                System.out.println("Player 2 won the game");
            }            
        }
        else if (gussernum==player3) {
            System.out.println("Only player 3 won the game");
        }
        else{
            System.out.println("All the player lost the game play again");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int round=1;
        while (true) {        
        System.out.println("---- Game started ----round "+round);
        Umpire um= new Umpire();
        um.collectGusserNum();
        um.collectPlayerNum();
        um.check();
        System.out.println("---- Game Over ----");
        System.out.println("1 : play again  2:exit");
        int in= sc.nextInt();
        if (in==2)  break;       
        round++;
        }
        sc.close();
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
}
