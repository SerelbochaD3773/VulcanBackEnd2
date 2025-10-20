package feedback.controllers;

import feedback.useCases.FeedbackUseCase; // Importacion de la clase FeedbackUseCase
import feedback.models.Feedback; // Importacion de la clase Feedback

public class FeedbackController {

    public FeedbackUseCase feedbackUseCase; // Declaracion de la clase TaskUseCase se convierte como tipo objecto

    // Constructor
    public FeedbackController() {
        this.feedbackUseCase = new FeedbackUseCase(); // Instancia de la clase FeedbackUseCase
    }

    // en ruta la accion de obtener todos
    public String all(){
        return this.feedbackUseCase.all(); // llamar todas las tareas.
    }

    // en ruta la accion de obtener por indice
    public String findByIndex(int index){
        return this.feedbackUseCase.findByIndex(index); // llamar la accion de buscar por indice.
    }

    // en ruta la accion de crear
    public String create(String name, String description, boolean status){
        return this.feedbackUseCase.create(new Feedback()); // llamar la accion de crear tarea.
    }

    // en ruta la accion de actualizar
    public String update(int index, String name, String description, boolean status){
        return this.feedbackUseCase.update(index, new Feedback ()); // llamar la accion de actualizar tarea.
    }

    // en ruta la accion de eliminar
    public String delete (int index){
        return this.feedbackUseCase.delete(index);
    }

}
