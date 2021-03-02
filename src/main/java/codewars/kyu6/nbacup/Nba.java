package codewars.kyu6.nbacup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * url: https://www.codewars.com/kata/5a420163b6cfd7cde5000077/train/java
 */
public class Nba {
    
    public static String nbaCup(String resultSheet,
                                String toFind) {
        List<NbaTeam> teams = new ArrayList<>();
        for (String s : resultSheet.split(",")) {
            String[] split = s.split("(?<=\\d)\\b");
            String firstTeamName = split[0].substring(0, split[0].length() - 3).trim();
            String secondTeamName = split[1].substring(0, split[1].length() - 3).trim();
            int firstTeamPoints;
            int secondTeamPoints;
            try {
                firstTeamPoints = Integer.parseInt(split[0].substring(split[0].length() - 3).trim());
                secondTeamPoints = Integer.parseInt(split[1].substring(split[1].length() - 3).trim());
            } catch (NumberFormatException nfe) {
                return "Error(float number):" + s;
            }
            
            NbaTeam team = getNbaTeam(teams, firstTeamName);
            NbaTeam otherTeam = getNbaTeam(teams, secondTeamName);
            
            if (firstTeamPoints > secondTeamPoints) {
                team.addWin();
                otherTeam.addLoss();
            } else if (firstTeamPoints < secondTeamPoints) {
                otherTeam.addWin();
                team.addLoss();
            } else {
                team.addDraw();
                otherTeam.addDraw();
            }
            
            team.addScored(firstTeamPoints);
            otherTeam.addScored(secondTeamPoints);
            team.addConceded(secondTeamPoints);
            otherTeam.addConceded(firstTeamPoints);
        }
        Optional<NbaTeam> team = teams.stream()
                .filter(nbaTeam -> nbaTeam.getName().equals(toFind))
                .findFirst();
        String result = toFind.isBlank() ? "" : toFind + ":This team didn't play!";
        if (team.isPresent()) {
            NbaTeam nbaTeam = team.get();
            result = nbaTeam.toString();
            if (nbaTeam.getDraws() == 0 && nbaTeam.getWins() == 0 && nbaTeam.getLoss() == 0) {
                result = nbaTeam.getName() + ":This team didn't play!";
            }
        }
        return result;
    }
    
    private static NbaTeam getNbaTeam(List<NbaTeam> teams, String name) {
        return teams.stream()
                .filter(nbaTeam -> nbaTeam.getName().equals(name))
                .findFirst()
                .orElseGet(() -> {
                    NbaTeam newTeam = new NbaTeam(name);
                    teams.add(newTeam);
                    return newTeam;
                });
    }
    
    static class NbaTeam {
        private String name;
        private int wins = 0;
        private int draws = 0;
        private int loss = 0;
        private int scored = 0;
        private int conceded = 0;
        private int points = 0;
        
        public NbaTeam(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getWins() {
            return wins;
        }
        
        public void setWins(int wins) {
            this.wins = wins;
        }
        
        public int getLoss() {
            return loss;
        }
        
        public void setLoss(int loss) {
            this.loss = loss;
        }
        
        public int getDraws() {
            return draws;
        }
        
        public int getScored() {
            return scored;
        }
        
        public void setScored(int scored) {
            this.scored = scored;
        }
        
        public int getPoints() {
            return points;
        }
        
        public void addWin() {
            this.wins++;
            this.points += 3;
        }
        
        public void addDraw() {
            this.draws++;
            this.points++;
        }
        
        public void addLoss() {
            this.loss++;
        }
        
        public void addScored(int scored) {
            this.scored += scored;
        }
        
        public void addConceded(int conceded) {
            this.conceded += conceded;
        }
        
        @Override
        public String toString() {
            return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                    name,
                    wins,
                    draws,
                    loss,
                    scored,
                    conceded,
                    points);
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NbaTeam nbaTeam = (NbaTeam) o;
            return name.equals(nbaTeam.name);
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
