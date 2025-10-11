import score.useCases.ScoreUseCases;
import student.useCases.StudentUseCase;
public class App {
   public static void main(String[] args) throws Exception {
        System.out.println("Hello, Vulcano APP Backend!");
        StudentUseCase studentUseCase = new StudentUseCase();
        ScoreUseCases scoreUseCases = new ScoreUseCases();


        // Create
        System.out.println("Se procede a crear el estudiante...");
        String studentOne = studentUseCase.create("1010", "Andres Felipe", "Ingenieria de Sistemas", "3012345678", "andres@example.com", "password123");
        // creacion puntaje estudiante 1
        scoreUseCases.create(1010, 9);
        // Actualización puntaje estudiante 1 
        scoreUseCases.update(1, 1010, 1);
        // eliminar puntuaciond el estudiante 1
        scoreUseCases.delete(1);
        // System.out.println(create);


        String studentTwo = studentUseCase.create("2020", "Maria Gomez", "Arquitectura", "3023456789", "maria@example.com", "password456");
        // System.out.println(create2);
        System.out.println("\n\n");

        System.out.println("Consultar todos los estudiantes...");
        // Read
        String read = studentUseCase.all();
        System.out.println(read);
        System.out.println("\n\n");

        System.out.println("Se ha consultado el estudiante con el indice 1");
         // Read find by index
        String read2 = studentUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");


        System.out.println("Actualizamos el estudiante con indice 0.");
        // Update
        String update = studentUseCase.update(0, "1010", "Andres Felipe", "Ingenieria de Sistemas", "3009876543", "andres@example.com", "password987indescifrable");
        System.out.println(update);

        System.out.println("\n\n");


        System.out.println("Eliminamos el estudiante con indice 1.");
        // Delete
        String delete = studentUseCase.delete(1);
        System.out.println(delete);
    }
}