import java.util.*;

/**
 * Составить программу, которая ведет учет очков, набранных каждой командой
 * при игре в баскетбол. Количество очков, полученных командами в ходе игры,
 * может быть равно 1, 2 или 3. После любого изменения счет выводить на
 * экран. После окончания игры выдать итоговое сообщение и указать номер
 * команды-победительницы. Окончание игры условно моделировать вводом
 * количества очков, равного нулю.
 */

public class TaskCh06N087 {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        System.out.println(game.result());
    }
}

class Game{
    Map<Integer, Team> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    void play(){
        System.out.println("Enter team #1");
        Team team1 = new Team();
        team1.setName(scanner.next());
        map.put(1, team1);

        System.out.println("Enter team #2");
        Team team2 = new Team();
        team2.setName(scanner.next());
        map.put(2, team2);

        System.out.println("Game got started..");
        while (true) {
            System.out.println("Enter team to score (1 or 2 or 0 to finish game)");
            int num = scanner.nextInt();
            if (num == 0) break;
            Team team = map.get(num);
            if (team != null) {
                System.out.println("Enter score (1 or 2 or 3)");
                int points = scanner.nextInt();
                if (points == 1 || points == 2 || points == 3) {
                    team.setPersonalScore(team.getPersonalScore() + points);
                }
                map.put(num, team);
                System.out.println("Score is: " + score());
            } else {
                System.out.println("There is no such team in the game");
            }
        }
    }

    String score(){
        String score = "[";
        for (Map.Entry<Integer, Team> entry: map.entrySet()) {
            Team team = entry.getValue();
            score = score + team.getName() + "-" + team.getPersonalScore() + ":";
        }
        score = score.substring(0, score.length() - 1) + "]";
        return score;
    }

    String result(){
        System.out.println("This game is over!");
        Team winner = new Team();
        List<Team> list = new ArrayList<>();

        int max = -1;
        for (Map.Entry<Integer, Team> entry: map.entrySet()) {
            Team team = entry.getValue();
            if (team.getPersonalScore() == max) {
                list.add(team);
            } else if (team.getPersonalScore() > max) {
                max = team.getPersonalScore();
                winner = team;
            }
        }
        if (list.size() > 0) {
            return "There is no winner! It's a dead heat with score " + score() + "!" ;
        } else {
            return "The winner is " + winner.getName() + " with TOTAL score " +  score() + "!";
        }
    }
}

class Team {
    private String name;
    private int personalScore;

    Team(){
        personalScore = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalScore() {
        return personalScore;
    }

    public void setPersonalScore(int personalScore) {
        this.personalScore = personalScore;
    }
}