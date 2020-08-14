package exercise2;

public class Match {
    private String hosts;
    private String guests;
    private int hostsScore;
    private int guestsScore;

    public Match(String hosts, String guests, int hostsScore, int guestsScore) {
        this.hosts = hosts;
        this.guests = guests;
        this.hostsScore = hostsScore;
        this.guestsScore = guestsScore;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public int getHostsScore() {
        return hostsScore;
    }

    public void setHostsScore(int hostsScore) {
        this.hostsScore = hostsScore;
    }

    public int getGuestsScore() {
        return guestsScore;
    }

    public void setGuestsScore(int guestsScore) {
        this.guestsScore = guestsScore;
    }

    @Override
    public String toString() {
        return hosts + " - " + guests + " (" + hostsScore + ":" + guestsScore + ")";
    }

    String[] getTeamNames(){
        return new String[]{hosts,guests};
    }

    int getGoalsSum(){
        return hostsScore+guestsScore;
    }
}
