import java.util.Scanner;
import java.util.Random;

class game {
    public int no;
    public int inputNumber;
    public int guess = 0;

    public int getguess() {
        return guess;
    }

    public void setguess(int guess) {
        this.guess = guess;
    }

    game() {
        Random rand = new Random();
        this.no = rand.nextInt(100);
    }

    void takeuserinput() {
        System.out.print("Guess a no. between 1 to 100 : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean Iscorrectno() {
        guess++;
        if (inputNumber == no) {
            System.out.format("right guessed it was %d you guessed in it %d attempts", no, guess);
            return true;

        } else if (inputNumber < no) {
            System.out.println("Please choose higher no!!!");
        } else if (inputNumber > no) {
            System.out.println("Please choose lower no!!!");
        }

        return false;
    }
}

public class NumberGuessing {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.Iscorrectno();
        }
    }
}
