import listGames.controllers.ListGamesController;
public class App {
   public static void main(String[] args) throws Exception {
     ListGamesController listGamesController = new ListGamesController();
     System.out.println("Se procede a crear un juego:");
     // Instanciamos la listGameController
     String gameOne = listGamesController.create("1", "Juego Ranita", "Codigos Flex- Css", true);
     System.out.println(gameOne);

     System.out.println("Se ha consultado el Juego con el primer indice");
        String listGameByIndex = listGamesController.findByIndex(0);
        System.out.println(listGameByIndex);
        System.out.println("\n");

     System.out.println("Se actualiza Juego");
     String updateGame = listGamesController.update(0, "1", "Juego Ranita", "Prácticas Css", false );
     System.out.println(updateGame);

     // DELETE - Eliminar Juego
        System.out.println("Eliminar el puntaje con el primer indice.");
        String deleteListGame = listGamesController.delete(0);
        System.out.println(deleteListGame);
        System.out.println("\n");
  }
    }