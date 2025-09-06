package student.useCases;

import java.util.ArrayList;
import java.util.List;

import student.models.Student;

// Contenedor de metodos y atributos
public class StudentUseCase {

    // Propiedad
    private final List<Student> students; // Definicion Lista en memoria
    

    // Constructor
    public StudentUseCase() {
        this.students = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String create(String idUser, String name, String career, String phone, String email, String password) {
        try {
            Student student = new Student(name, idUser, career, phone, email, password);
            this.students.add(student); // Uso de la lista
            return "Estudiante Creado:" + student.getName() + " Iduser:" + student.getIdUser() + " Carrera:" + student.getCareer() + " Telefono:" + student.getPhone() + " Email:" + student.getEmail();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Read
    public String all(){
        try {
            StringBuilder result = new StringBuilder(); // preparando la concatenacion de los strings.
            for (int i = 0; i < students.size(); i++) { 
               Student student = students.get(i); // Se crea usuario estudiante.
                result.append("Estudiante ")
                .append(i)
                .append(": ")
                .append(student.getName())
                .append(" IdUser: ")
                .append(student.getIdUser())
                .append(" Carrera: ")
                .append(student.getCareer())
                .append(" Telefono: ")
                .append(student.getPhone())
                .append(" Email: ")
                .append(student.getEmail())
                .append("\n"); 
            }

            return result.toString(); // Retornando la concatenacion de los estudiantes
            
        } catch (Exception e) {
           return "No ha sido posible listar los estudiantes.";
        }
    }

    // Read by index
    public String findByIndex(int index){
        try {
             Student studentFound = new Student(); // Todavia no se ha encontrado
            for (int i = 0; i < students.size(); i++) { // Se procede a buscar
                if(index == i){ // Se aplica el filtro o condicional
                    studentFound = students.get(index); // Se obtiene el estudiante encontrado
                }
            }
            // Se imprime el estudiante encontrado.
            return "Estudiante Encontrado:" + studentFound.getName() + " IdUser:" + studentFound.getIdUser() + " Carrera:" + studentFound.getCareer() + " Email:" + studentFound.getEmail() + " Telefono:" + studentFound.getPhone();
        }
        catch (Exception e) {
            return "no ha sido posible encontrar el estudiante.";
        }
    }
 // Update
    public String update(int index, String idUser, String name, String career, String phone, String email, String password) {
        try {
            Student studentFound = new Student();
            for (int i = 0; i < students.size(); i++) {
               if(index == i){
                Student student = students.get(index);
                studentFound = students.get(i);
                student.setName(name);
                studentFound.setIdUser(idUser);
                studentFound.setCareer(career);
                studentFound.setPhone(phone);
                studentFound.setEmail(email);
                studentFound.setPassword(password);
                studentFound = student;
               }
            }
            return "Estudiante Actualizado:" + studentFound.getName() + " IdUser:" + studentFound.getIdUser() + " Carrera:" + studentFound.getCareer() + " Email:" + studentFound.getEmail() + " Telefono:" + studentFound.getPhone();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }
 // Delete
    public String delete(int index){
       try {
            students.remove(index);
            return "Se ha eliminado el estudiante correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar el estudiante.";
       }
    }
}
