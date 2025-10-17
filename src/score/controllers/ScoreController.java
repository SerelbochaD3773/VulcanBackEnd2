package score.controllers;

import score.useCases.ScoreUseCases;

public class ScoreController {
     public ScoreUseCases scoreUseCases; // Declaracion de la clase TaskUseCase se convierte como tipo objecto

    // Constructor
    public ScoreController() {
        this.scoreUseCases = new ScoreUseCases(); // Instancia de la clase TaskUseCase
    }

    // en ruta la accion de obtener todos
    public String all(){
        return this.scoreUseCases.all(); // llamar todas las tareas.
    }

    // en ruta la accion de obtener por indice
    public String findByIndex(int index){
        return this.scoreUseCases.findByIndex(index); // llamar la accion de buscar por indice.
    }

    // en ruta la accion de crear
    public String create(int idUser, int score){
        return this.scoreUseCases.create(idUser, score); // llamar la accion de crear puntaje.
    }

    // en ruta la accion de actualizar
    public String update(int index, int idUser, int score){
        return this.scoreUseCases.update(index, idUser, score); // llamar la accion de actualizar puntaje.
    }

    // en ruta la accion de eliminar
    public String delete (int index){
        return this.scoreUseCases.delete(index);
    }
    
}
