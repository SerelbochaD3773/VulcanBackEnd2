package listGames.models;

public class ListGames {
  private String idGame;
  private String nameGame;
  private String descriptionGame;
  private boolean statusGame;

  public ListGames (String idGame, String nameGame, String descriptionGame, boolean statusGame) {
    this.idGame = idGame;
    this.nameGame = nameGame;
    this.descriptionGame = descriptionGame;
    this.statusGame = statusGame;
  }

      public void setIdGame(String idGame) {
        this.idGame = idGame;
    }

    public void setNameGame(String nameGame){
        this.nameGame = nameGame;
    }

    public void setDescriptionGame(String descriptionGame) {
        this.descriptionGame = descriptionGame;
    }

    public void setStatusGame(boolean statusGame) {
      this.statusGame = statusGame;
    }

        public String getIdGame() {
        return idGame;
    }

    public String getNameGame() {
        return nameGame;
    }   

    public String getDescriptionName() {
        return descriptionGame;
    }
    public boolean getStatusGame() {
        return statusGame;
    }

}

