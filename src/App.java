import listGames.controllers.ListGamesController; 
import score.controllers.ScoreController; //ROQUE
//importe su controlador aqui


public class App {
  public static void main(String[] args) throws Exception {
    ListGamesController listGamesController = new ListGamesController(); 
    ScoreController scoreController = new ScoreController(); // Instanciar el controlador de puntajes = ROQUE
    //Aqui instanciar su propio objeto controller

    // Instanciamos la listGameController
    // CREATE - Crear un Juego
    System.out.println("Se procede a crear un juego:");
    String gameOne = listGamesController.create("1", "Juego Ranita", "Codigos Flex- Css", true);
    System.out.println(gameOne);

    // CONSULT - Consultar Juego
    System.out.println("Se ha consultado el Juego con el primer indice");
    String listGameByIndex = listGamesController.findByIndex(0);
    System.out.println(listGameByIndex);
    System.out.println("\n");

    // UPDATE - Actualizar Juego
    System.out.println("Se actualiza Juego");
    String updateGame = listGamesController.update(0, "1", "Juego Ranita", "Prácticas Css", false);
    System.out.println(updateGame);

    // DELETE - Eliminar Juego
    System.out.println("Eliminar el puntaje con el primer indice.");
    String deleteListGame = listGamesController.delete(0);
    System.out.println(deleteListGame);
    System.out.println("\n");

    //ROQUE
    System.out.println("\n GESTION DE PUNTAJES\n");

        // CREATE - Crear puntajes para estudiantes
        System.out.println("Se procede a crear puntajes para estudiantes...");
        String scoreOne = scoreController.create(1010, 85);
        System.out.println(scoreOne);
        
   

        // READ ALL - Consultar todos los puntajes
        System.out.println("Consultar todos los puntajes...");
        String allScores = scoreController.all();
        System.out.println(allScores);
        System.out.println("\n");

        // READ BY INDEX - Consultar puntaje por índice
        System.out.println("Se ha consultado el puntaje con el indice 1");
        String scoreByIndex = scoreController.findByIndex(1);
        System.out.println(scoreByIndex);
        System.out.println("\n");

        
        // UPDATE - Actualizar puntaje del estudiante en índice 0
        System.out.println("Actualizamos el puntaje del estudiante con indice 0 (sumamos 10 puntos).");
        String updateScore = scoreController.update(0, 1010, 10);
        System.out.println(updateScore);
        System.out.println("\n");

        // Verificar el cambio
        System.out.println("Verificamos todos los puntajes despues de la actualizacion:");
        String allScoresAfterUpdate = scoreController.all();
        System.out.println(allScoresAfterUpdate);
        System.out.println("\n");

        // DELETE - Eliminar puntaje
        System.out.println("Eliminamos el puntaje con indice 2.");
        String deleteScore = scoreController.delete(2);
        System.out.println(deleteScore);
        System.out.println("\n");

        // Verificar lista final
        System.out.println("Lista final de puntajes:");
        String finalScores = scoreController.all();
        System.out.println(finalScores);
  }

}