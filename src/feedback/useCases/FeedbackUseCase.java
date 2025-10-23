package feedback.useCases;

import java.util.ArrayList;
import java.util.List;

import feedback.models.Feedback;

public class FeedbackUseCase {

    //Propiedad
    private final List<Feedback> studentFeedback;

    public FeedbackUseCase(){
        this.studentFeedback = new ArrayList<>();
    }

    //LISTAR TODOS LOS COMENTARIOS
    public String all(){
        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < studentFeedback.size(); i++){
                Feedback feedback = studentFeedback.get(i);
                result.append("Index: ")
                      .append(i)
                      .append(": ")
                      .append("Email: ")
                      .append(feedback.getEmail())
                      .append(" Phone: ")
                      .append(feedback.getPhone())
                      .append(" Comentario: ")
                      .append(feedback.getComment())
                      .append("\n");
            }
            return result.toString();
        } catch (Exception e) {
            return "No ha sido posible listar los puntajes.";
        }
    }
    //BUSCAR COMENTARIO POR INDICE
    public String findByIndex(int index) {
        try {
            if (index < 0 || index >= studentFeedback.size()) {
                return "Índice fuera de rango.";
            }
            Feedback feedback = studentFeedback.get(index);
            return "Comentario encontrado: Correo: " + feedback.getEmail() + " Telefono: " + feedback.getPhone() + " Comentario:" + feedback.getComment();
        } catch (Exception e) {
            return "No ha sido posible encontrar el puntaje.";
        }
    }
    //CREATE
    public String create(String email, String phone, String comment){
        try {
            Feedback stFeedback = new Feedback(email,phone,comment);
            this.studentFeedback.add(stFeedback);
            return "Remitente: "+stFeedback.getEmail()+  " Mensaje: "+ stFeedback.getComment();
        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }
    }
    //UPDATE
    public String update(int index, String email, String phone, String comment) {
        try {
            if (index < 0 || index >= studentFeedback.size()) {
                return "Error: Índice fuera de rango";
            }
            // 2. Obtener el objeto Feedback de la lista
            Feedback stFeedback = studentFeedback.get(index);

            // 3. Establecer el nuevo valor del email
            stFeedback.setEmail(email);

            // 4. Establecer el nuevo valor del phone
            stFeedback.setPhone(phone);
        
            // 5. Establecer el NUEVO valor para el comment
            stFeedback.setComment(comment);
        
            
            return "Comentario Actualizado: " + "Email: " + stFeedback.getEmail() + " Telefono: " + stFeedback.getPhone() + " Comentario: " + stFeedback.getComment();
        } catch (Exception e) {
            return "Ha ocurrido un error: " + e.getMessage();
        }
    }
    //DELETE
    public String delete(int index){
       try {
            studentFeedback.remove(index);
            return "Se ha eliminado el comentario correctamente";
       } catch (Exception e) {
            return "no ha sido posible eliminar el comentario";
       }
    }
    
}
