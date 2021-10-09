package sadiajahan;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over,Player player ){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display(){
        System.out.println("MatchType :"+matchType);
        System.out.println("Over :"+over);
        System.out.println("Player Name :"+player.playerName);
        System.out.println("jerseyNumber :"+player.jerseyNumber);
    }
}




/*
Name: Sadia Jahan Ani
ID: 2012020171
Section: 5D
email: cse_2012020171@lus.ac.bd
 */
