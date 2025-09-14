package listGames.useCases;

import java.util.ArrayList;
import java.util.List;

import listGames.models.ListGames;

public class ListGamesUsesCases {
  // Propiedad
    private final List<ListGames> listGamesGlobal; // Definicion Lista en memoria

    // Constructor
    public ListGamesUsesCases() {
        this.listGamesGlobal = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    

    // CREATE
    public String create(String idGame, String nameGame, String descriptionGame, boolean statusGame) {
        try {
            ListGames games = new ListGames (idGame, nameGame, descriptionGame, statusGame);
            this.listGamesGlobal.add(games); // Uso de la lista
            return "Juego Creado:" + games.getNameGame() + " IdGame:" + games.getIdGame() + " Descripción:"
                + games.getDescriptionName() + " Estado del Juego:" + games.getStatusGame();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }
  
}
