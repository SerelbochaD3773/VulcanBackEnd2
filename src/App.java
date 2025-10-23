import feedback.controllers.FeedbackController;//Mario
import listGames.controllers.ListGamesController; //albani
import score.controllers.ScoreController; //ROQUE
//importe su controlador aqui


public class App {
  public static void main(String[] args) throws Exception {
    ListGamesController listGamesController = new ListGamesController(); 
    ScoreController scoreController = new ScoreController(); // Instanciar el controlador de puntajes = ROQUE
    FeedbackController feedbackController = new FeedbackController();
    //Aqui instanciar su propio objeto controller

    //######################################################### ALBANY #########################################################
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

    //######################################################### ROQUE #########################################################
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

    //######################################################### MARIO #########################################################
    System.out.println("\n GESTION DE FEEDBACK\n");
    System.out.println("Se procede a crear un Comentario:");

    //CREATE - crear comentario
    String feedbackOne = feedbackController.create("mario@munera.co","5712770","La pagina esta excelente");
    String feedbackTwo = feedbackController.create("juan@cardona.co","3220084","Genial sigan mejorando el contenido");
    String feedbackThree = feedbackController.create("luz@fary.co","02020202","que pagina de juegos tan genial");

    //READ ALL -Consultar todos los comentarios
    System.out.println("Consultar todos los comentarios...");
    String allfeedback = feedbackController.all();
    System.out.println(allfeedback);
    System.out.println("\n");

    // READ BY INDEX - Consultar comentario por índice
    System.out.println("Se ha consultado el comentario con el indice 0");
    String feedbackByIndex = feedbackController.findByIndex(0);
    System.out.println(feedbackByIndex);
    System.out.println("\n");

    // UPDATE - Actualizar comentario en índice 0
    System.out.println("Actualizamos los comentarios");
    String updateFeedback = feedbackController.update(0,"mario@mario.com","5712780","Mi nuevo comentario");
    String updateFeedbackTwo = feedbackController.update(2,"luz@fary.co","02020202","Comentario nuevesito");
    System.out.println(updateFeedback);
    System.out.println("\n");
    System.out.println(updateFeedbackTwo);
    System.out.println("\n");

    // DELETE - Eliminar comentario
    System.out.println("Eliminamos el comentario index 1");
    String deleteFeedback = feedbackController.delete(1);
    System.out.println(deleteFeedback);

    // Verificar lista final
    System.out.println("Lista final de comentarios:");
    String finalFeedbacks = feedbackController.all();
    System.out.println(finalFeedbacks);

    //######################################################### SERGIO #########################################################
    //######################################################### JULIO #########################################################
  }

}