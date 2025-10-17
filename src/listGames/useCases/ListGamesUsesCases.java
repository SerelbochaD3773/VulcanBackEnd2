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
            ListGames games = new ListGames(idGame, nameGame, descriptionGame, statusGame);
            this.listGamesGlobal.add(games);
            return "Juego Creado: " + games.getNameGame() + " IdGame: " + games.getIdGame() + " Descripción: "
                    + games.getDescriptionName() + " Estado del Juego: " + games.getStatusGame();
        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }
    }

        // UPDATE
    public String update(int index, ListGames listGameIn) {
        try {
            if (index >= 0 && index < listGamesGlobal.size()) {
                ListGames listGames = listGamesGlobal.get(index);
                listGames.setNameGame(listGameIn.getNameGame());
                listGames.setDescriptionGame(listGameIn.getDescriptionName());
                listGames.setStatusGame(listGameIn.getStatusGame());
                return "Juego Actualizado: " + listGames.getNameGame() + " Descripción del Juego: " + listGames.getDescriptionName();
            } else {
                return "Índice fuera de rango";
            }
        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }
    }
    

    // Delete
    public String delete(int index) {
        try {
            if (index >= 0 && index < listGamesGlobal.size()) {
                listGamesGlobal.remove(index);
                return "Se ha eliminado el juego correctamente.";
            } else {
                return "Índice fuera de rango";
            }
        } catch (Exception e) {
            return "No ha sido posible eliminar el juego.";
        }
    }
    public String findByIndex(int index) {
        try {
            if (index >= 0 && index < listGamesGlobal.size()) {
                ListGames game = listGamesGlobal.get(index);
                return "Juego encontrado: " + game.getNameGame() + " Descripción: " + game.getDescriptionName();
            } else {
                return "Índice fuera de rango";
            }
        } catch (Exception e) {
            return "No ha sido posible encontrar el juego.";
        }
    }
    }
  
