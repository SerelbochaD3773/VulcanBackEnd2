package feedback.controllers;

import feedback.useCases.FeedbackUseCase;

public class FeedbackController {

    public FeedbackUseCase feedbackUseCase;

    //contructor
    public FeedbackController(){
        //instanciamos clase useCase
        this.feedbackUseCase = new FeedbackUseCase();
    }

    // en ruta la accion de obtener todos
    public String all(){
        return this.feedbackUseCase.all(); // trae todos los comentarios
    }

    // en ruta la accion de obtener por indice
    public String findByIndex(int index){
        return this.feedbackUseCase.findByIndex(index); // Trae comentario x indice
    }

    // en ruta la accion de crear
    public String create(String email, String phone, String comment ){
        return this.feedbackUseCase.create(email,phone,comment);
    }

    // en ruta la accion de actualizar
    public String update(int index, String email, String phone, String comment){
        return this.feedbackUseCase.update(index, email, phone, comment); //Actualiza email phone y comment si el usuario lo desea.
    }

    // en ruta la accion de eliminar
    public String delete (int index){
        return this.feedbackUseCase.delete(index);
    }
    


}
