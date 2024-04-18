package assignments.week6.day4;
public class Athletes implements Comparable<Athletes> {

    private String name;
    private int wins;
    private int events;

// constructor
    Athletes(String name, int wins, int events) {
        this.name = name;
        this.wins = wins;
        this.events = events;
    }
    public double getWinPercentage() { // method to get win %
        return (double) wins / events * 100;
    }
// getters and setters
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

    public int getEvents() {
        return events;
    }

    public void setEvents(int events) {
        this.events = events;
    }
// compare to in order to sort by win %
    @Override
    public int compareTo(Athletes obj) {
        return (int) (this.getWinPercentage() - obj.getWinPercentage());
    }
    @Override
    public String toString() {
        return "Athletes [name=" + name + ", wins=" + wins + ", events=" + events + ", getWinPercentage()="
                + getWinPercentage() + "]";
    }

}
