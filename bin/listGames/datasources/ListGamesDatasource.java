package listGames.datasources;

import java.util.ArrayList;
import java.util.List;

import listGames.models.ListGames;

// Datasource simple que actúa como capa de acceso a datos en memoria
public class ListGamesDatasource {

    public InMemoryDatabase database; // base de datos en memoria

    public ListGamesDatasource() {
        this.database = new InMemoryDatabase();
    }

    public String all() {
        return this.database.all();
    }

    public String findByIndex(int index) {
        return this.database.findByIndex(index);
    }

    public String create(String idGame, String nameGame, String descriptionGame, boolean statusGame) {
        return this.database.create(new ListGames(idGame, nameGame, descriptionGame, statusGame));
    }

    public String update(int index, String idGame, String nameGame, String descriptionGame, boolean statusGame) {
        return this.database.update(index, new ListGames(idGame, nameGame, descriptionGame, statusGame));
    }

    public String delete(int index) {
        return this.database.delete(index);
    }

    // Implementación interna simple de una "base de datos" en memoria.
    static class InMemoryDatabase {
        private final List<ListGames> storage;

        public InMemoryDatabase() {
            this.storage = new ArrayList<>();
            // opcional: agregar datos iniciales
        }

        public String all() {
            if (storage.isEmpty()) {
                return "No hay juegos registrados.";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < storage.size(); i++) {
                ListGames g = storage.get(i);
                sb.append("[").append(i).append("] ")
                  .append(g.getNameGame()).append(" - ")
                  .append(g.getDescriptionName()).append(" (id: ")
                  .append(g.getIdGame()).append(") estado: ")
                  .append(g.getStatusGame()).append("\n");
            }
            return sb.toString();
        }

        public String findByIndex(int index) {
            try {
                if (index >= 0 && index < storage.size()) {
                    ListGames g = storage.get(index);
                    return "Juego encontrado: " + g.getNameGame() + " Descripción: " + g.getDescriptionName();
                } else {
                    return "Índice fuera de rango";
                }
            } catch (Exception e) {
                return "No ha sido posible encontrar el juego.";
            }
        }

        public String create(ListGames game) {
            try {
                storage.add(game);
                return "Juego Creado: " + game.getNameGame() + " IdGame: " + game.getIdGame();
            } catch (Exception e) {
                return "Ha ocurrido un error al crear el juego.";
            }
        }

        public String update(int index, ListGames gameIn) {
            try {
                if (index >= 0 && index < storage.size()) {
                    ListGames g = storage.get(index);
                    g.setIdGame(gameIn.getIdGame());
                    g.setNameGame(gameIn.getNameGame());
                    g.setDescriptionGame(gameIn.getDescriptionName());
                    g.setStatusGame(gameIn.getStatusGame());
                    return "Juego Actualizado: " + g.getNameGame();
                } else {
                    return "Índice fuera de rango";
                }
            } catch (Exception e) {
                return "Ha ocurrido un error al actualizar el juego.";
            }
        }

        public String delete(int index) {
            try {
                if (index >= 0 && index < storage.size()) {
                    storage.remove(index);
                    return "Se ha eliminado el juego correctamente.";
                } else {
                    return "Índice fuera de rango";
                }
            } catch (Exception e) {
                return "No ha sido posible eliminar el juego.";
            }
        }
    }
}