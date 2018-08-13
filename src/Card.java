public class Card implements Comparable<Card>{
    char suite;
    int rank;
    char PIP;

    public Card(char suite, char PIP,int rank) {
        this.suite = suite;
        this.PIP = PIP;
        this.rank = rank;
    }

    public char getSuite() {
        return suite;
    }

    public char getPIP() {
        return PIP;
    }

    public void setPIP(char PIP) {
        this.PIP = PIP;
    }

    public void setSuite(char suite) {
        this.suite = suite;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.rank,o.rank);
    }
}
