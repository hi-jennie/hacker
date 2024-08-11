package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = scan.next();
            int score = scan.nextInt();
            Player player = new Player(name, score);
            players.add(player);
        }

        Collections.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }

    static class Player {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            int temp = o2.score - o1.score;
            temp = temp == 0 ? o1.name.compareTo(o2.name) : temp;
            return temp;
        }
    }
}
