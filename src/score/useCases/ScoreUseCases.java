package score.useCases;
import java.util.ArrayList;
import java.util.List;
import score.models.Score;

public class ScoreUseCases {

    // Propiedad
    private final List<Score> studentsScore; // Definicion Lista en memoria
    

    // Constructor
    public ScoreUseCases() {
        this.studentsScore = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // Listar todos los puntajes
    public String all() {
        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < studentsScore.size(); i++) {
                Score score = studentsScore.get(i);
                result.append("Puntaje ")
                      .append(i)
                      .append(": ")
                      .append("IdUser: ")
                      .append(score.getUserId())
                      .append(" Score: ")
                      .append(score.getScore())
                      .append("\n");
            }
            return result.toString();
        } catch (Exception e) {
            return "No ha sido posible listar los puntajes.";
        }
    }

    // Buscar puntaje por índice
    public String findByIndex(int index) {
        try {
            if (index < 0 || index >= studentsScore.size()) {
                return "Índice fuera de rango.";
            }
            Score score = studentsScore.get(index);
            return "Puntaje encontrado: IdUser: " + score.getUserId() + " Score: " + score.getScore();
        } catch (Exception e) {
            return "No ha sido posible encontrar el puntaje.";
        }
    }

    // CREATE
    public String create(int idUser, int score) {
        try {
            Score studentScore = new Score(idUser, score);// {"idUser":1010, "score":9}
            this.studentsScore.add(studentScore); // Uso de la lista
            return "Puntuación: " + studentScore.getScore() + "Al estudiante con el user id:" + studentScore.getUserId();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // UPDATE
    public String update(int index, int idUser, int score) {
        try {
            if (index < 0 || index >= studentsScore.size()) {
                return "Error: Índice fuera de rango";
            }
            Score scoreStudent = studentsScore.get(index);
            int currentScore = scoreStudent.getScore();
            scoreStudent.setScore(currentScore + score);
            return "Estudiante Actualizado: " + "IdUser: " + scoreStudent.getUserId() + " Puntuación: " + scoreStudent.getScore();
        } catch (Exception e) {
            return "Ha ocurrido un error: " + e.getMessage();
        }
    }

     // Delete
    public String delete(int index){
       try {
            studentsScore.remove(index);
            return "Se ha eliminado la puntuación del estudiante correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar la puntacion del estudiante.";
       }
    }

}