package listGames.controllers;

import listGames.useCases.ListGamesUsesCases;

import listGames.models.ListGames;

public class ListGamesController {
 
  public ListGamesUsesCases listGamesUsesCases;

  public ListGamesController() {
    this.listGamesUsesCases = new ListGamesUsesCases ();
  }

  public String findByIndex(int index) {
    return this.listGamesUsesCases.findByIndex (index);
  }

  public String create(String idGame, String nameGame, String descriptionGame, boolean statusGame) {
    return this.listGamesUsesCases.create(new ListGames(idGame, nameGame, descriptionGame, statusGame));
  }

  public String update(int index, String idGame, String nameGame, String descriptionGame, boolean statusGame) {
    return this.listGamesUsesCases.update( index, new ListGames ( idGame, nameGame, descriptionGame, statusGame));
  }
  
  public String delete(int index) {
    return this.listGamesUsesCases.delete(index); {
      return this.listGamesUsesCases.delete (index);
    }
  }


}
