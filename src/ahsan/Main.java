
// Name: Ahshanul Haque Chodhury
// ID: 2012020107
// Section: C
// Email: cse_2012020107@lus.ac.bd
// Date: 10-06-2021


package ahsan;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Shakib", 75);
        Cricket cricket = new Cricket("International Match", 20, player);
        cricket.display();
        Football football = new Football();
    }
}