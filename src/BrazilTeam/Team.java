package BrazilTeam;

public class Team {
    private String name;
    private int year;
    private Player[] players;

    public void addPlayer(String name, int shirt) {
        Player newPlayer = new Player(name, shirt, this);
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = newPlayer;
                System.out.println("Registered players of " + players[i].getTeamYear());
                break;
            }
        }
        printPlayers();
    }

    public Team(int year) {
        this.name = "BRAZIL";
        this.year = year;
        players = new Player[3]; // List of players empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void printPlayers() {
        // TODO: Imprimir organizado por ANO uma lista de jogadores
        int i = 0;
        for (i = 0; i < players.length; i++) {
            if (players[i] == null) {
                break;
            }
            System.out.println(players[i].getTeamYear() + " | " + players[i].getName() + " - " + players[i].getShirt());
        }

        if (i == players.length) {
            System.out.println("The number of players has reached the limit of " + players.length + " players");
        }
        System.out.println("..............................................................");
    }


//    public void print() {
//        String[] players = new String[4];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the names of " + players.length + " players below to create a TEAM: ");
//
//        for (int i = 0; i < players.length; i++) {
//            System.out.printf("Enter player " + (i + 1) + ": ");
//            players[i] = input.nextLine();
//        }
//
//        System.out.println("------------------------");
//        System.out.println("*** Added players ***");
//
//        for (int x = 0; x < players.length; x++) {
//            System.out.println(x + 1 + ") " + players[x]);
//        }
//
//    }

}
