package instructor.useCases;
import java.util.ArrayList;
import java.util.List;
import instructor.models.Instructor;

// Contenedor de metodos y atributos
public class InstructorUseCase {

    // Propiedad
    private final List<Instructor> instructors; // Definicion Lista en memoria

    // Constructor
    public InstructorUseCase() {
        this.instructors = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    

    // CREATE
    public String create(String idUser, String name, String career, String phone, String email, String password) {
        try {
            Instructor instructor = new Instructor(name, idUser, career, phone, email, password);
            this.instructors.add(instructor); // Uso de la lista
            return "Instructor Creado:" + instructor.getName() + " Iduser:" + instructor.getIdUser() + " Especialidad:" + instructor.getSpecialty() + " Telefono:" + instructor.getPhone() + " Email:" + instructor.getEmail();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }


}
