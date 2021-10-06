
// Name: Ahshanul Haque Chodhury
// ID: 2012020107
// Section: C
// Email: cse_2012020107@lus.ac.bd
// Date: 10-06-2021


package ahsan;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display()
    {
        System.out.println("Match type : " + matchType);
        System.out.println("Total over : " + over);
        System.out.println("Player's name : " + player.playerName);
        System.out.println("Jersey Number : " + player.jerseyNumber);
    }
}


