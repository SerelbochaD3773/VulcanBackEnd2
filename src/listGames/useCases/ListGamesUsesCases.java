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
        }}; 

        // UPDATE
    public String update(String idGame, ListGames ListGameIn) { //tarea entrante
        try {
            Task listGameFound = new ListGames();
            for (int i = 0; i < ListGames.size(); i++) {
               if(index == i){
                ListGames listGames = listGames.get(index); // tarea existente
                listGames.setNameGame(ListGameIn.getNameGame());
                listGames.setDescriptionGame(ListGameInn.getDescriptionGame());
                listGames.setStatusGame(ListGameIn.getStatusGame());
                listGamesFound = listGames;
               }
            }
            return "Juego Actualizado:" + listGames.getNameGame() + " Descripcion del Juego:" + listGameFound.getDescriptionGame();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }};
    

    // Delete
    public String delete(String idGame){
       try {
            tasks.remove(index);
            return "Se ha eliminado el juego correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar el juego.";
       }
    
    }
    }
  
