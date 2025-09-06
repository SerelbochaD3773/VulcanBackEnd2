package student.models;

public class Student {
    private String idUser;
    private String name; 
    private String career;       
    private String phone;
    private String email;
    private String password;

    public Student(){}

    public Student(String idUser, String name, String career, String phone, String email, String password){
        this.idUser = idUser;
        this.name = name;
        this.career = career;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }   

    public String getCareer() {
        return career;
    }
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

       

    // Setters
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // //* iniciar sesion
    // public boolean iniciarSesion(String name, String password) {

    //     return this.name.equals(name) && this.password.equals(password);
    // }


    //  // Cerrar la sesión del usuario actual.
    // public void cerrarSesion() {
    //     System.out.println("Sesión cerrada para el usuario: " + this.name);
    // }

    // // Cambiar la contraseña del usuario.
    
    // public boolean cambiarContrasena(String nuevaContrasena) {
    //     // Aquí puedes agregar validaciones (ej. longitud mínima, caracteres especiales).
    //     if (nuevaContrasena != null && nuevaContrasena.length() >= 8) {
    //         this.password = nuevaContrasena; 
    //         System.out.println("Contraseña cambiada exitosamente.");
    //         return true;
    //     } else {
    //         System.out.println("Error: La nueva contraseña debe tener al menos 8 caracteres.");
    //         return false;
    //     }
    // }

    // // Muestra la información del perfil del usuario.

    // public void verPerfil() {
    //     System.out.println("--- Información del Perfil ---");
    //     System.out.println("ID de Usuario: " + this.idUser);
    //     System.out.println("Nombre: " + this.name);
    //     System.out.println("Carrera: " + this.career);
    //     System.out.println("Teléfono: " + this.phone);
    //     System.out.println("Email: " + this.email);
    //     System.out.println("-----------------------------");
    // }

}
