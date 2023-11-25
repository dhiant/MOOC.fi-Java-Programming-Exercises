import java.nio.file.Paths;
import java.util.Scanner;

class SportStatistics {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("File;");
    String file = scan.nextLine();

    System.out.println("Team:");
    String team = scan.nextLine();

    int gamePlayed = 0;
    int wins = 0;
    int loses = 0;

    // read a file
    try {
      Scanner readFile = new Scanner(Paths.get(file));

      while (readFile.hasNextLine()) {
        String row = readFile.nextLine();

        if (row.contains(team)) {
          gamePlayed++;

          String[] teams = row.split(",");
          String homeTeam = teams[0];
          String visitingTeam = teams[1];
          int homeTeamPoints = Integer.valueOf(teams[2]);
          int visitingTeamPoints = Integer.valueOf(teams[3]);

          // if given team is home team and home team points has greater points
          if (team.equals(homeTeam)) {
            if (homeTeamPoints > visitingTeamPoints) {
              wins++;
            } else {
              loses++;
            }
          } else if (team.equals(visitingTeam)) {
            if (homeTeamPoints < visitingTeamPoints) {
              wins++;
            } else {
              loses++;
            }
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    System.out.println("Games: " + gamePlayed);
    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + loses);
    scan.close();
  }
}
