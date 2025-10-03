package feedback.useCases;

import java.util.ArrayList;
import java.util.List;

import feedback.models.Feedback;

public class FeedbackUseCase {

    private final List<Feedback> feedbacks;

    // Constructor
    public FeedbackUseCase() {
        this.feedbacks = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.

    }

    // Read
    public String all(){
        try {
            StringBuilder result = new StringBuilder(); // preparando la concatenacion de los strings.
            for (int i = 0; i < feedbacks.size(); i++) { // Se procede a concatenar los comentarios al string.
                Feedback feedbackItem = this.feedbacks.get(i);; // Se obtiene el comentario.
                result.append("Remitente ")
                .append(i)
                .append(": ")
                .append(feedbackItem.getEmail())
                .append(" Comentario: ")
                .append(feedbackItem.getComment())
                .append("\n"); // Concatenar el comentario al string.
            }

            return result.toString(); // Retornando la concatenacion de comentarios.
            
        } catch (Exception e) {
           return "No ha sido posible listar el comentario.";
        }
    }

    // Create
    public String create(Feedback feedback) {
        try {
            this.feedbacks.add(feedback); // Uso de la lista
            return "Comentario agregado:" + feedback.getEmail() + " Comentario:" + feedback.getComment();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Update
    public String update(int index, Feedback feedbackIn) { //Comentario Entrante
        try {
            Feedback feedbackFound = new Feedback();
            for (int i = 0; i < feedbacks.size(); i++) {
               if(index == i){
                Feedback feedback = feedbacks.get(index); // Comentario existente
                feedback.setEmail(feedbackIn.getEmail());
                feedback.setPhone(feedbackIn.getPhone());
                feedback.setComment(feedbackIn.getComment());
                feedbackFound = feedback;
               }
            }
            return "Comanterio Actualizado:" + feedbackFound.getEmail() + " Mensaje:" + feedbackFound.getComment();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Delete
    public String delete(int index){
       try {
            feedbacks.remove(index);
            return "Se ha eliminado el comentario correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar el comentario.";
       }
    }

    public String findByIndex(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIndex'");
    }



}
