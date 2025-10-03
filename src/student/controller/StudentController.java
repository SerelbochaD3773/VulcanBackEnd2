package student.controller;
import student.useCases.StudentUseCase;
import student.models.Student;

public class StudentController {

    public StudentUseCase studentUseCase;

    public StudentController() {
        this.studentUseCase = new StudentUseCase();
    }

    public String all() {
        return this.studentUseCase.all();
    }

    public String findByIndex(int index) {
        return this.studentUseCase.findByIndex(index);
    }

    public String create(String idUser, String name, String career, String phone, String email, String password) {
        return this.studentUseCase.create(new Student(idUser, name, career, phone, email, password));
    }

    public String update(int index, String idUser, String name, String career, String phone, String email, String password) {
        return this.studentUseCase.update(index, new Student(idUser, name, career, phone, email, password));
    }

    public String delete(int index) {
        return this.studentUseCase.delete(index);
    }
}