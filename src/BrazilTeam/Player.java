package BrazilTeam;

public class Player {
    private String name;
    private int shirt;
    private Team team;

    public Player(String name, int shirt, Team team) {
        this.name = name;
        this.shirt = shirt;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getShirt() {
        return shirt;
    }

    public int getTeamYear (){
        return team.getYear();
    }

    //  TODO HOME WORK: criar um get (funcao) para pegar o time do jogador - A PARTIR DO JOGADOR


}
