package PreferencesSelector.models;

public class PreferenciaMateria {
    private int id;
    private String nombreMateria;
    private String nivelInteres; // Ej: "Alto", "Medio", "Bajo"

    public PreferenciaMateria(int id, String nombreMateria, String nivelInteres) { // Constructor
        this.id = id; //Asignacion de id unico  
        this.nombreMateria = nombreMateria;  // Asignacion de nombre materia
        this.nivelInteres = nivelInteres; // Asignacion de nivel de interes
    }

    // Getters y Setters
    public int getId() { return id; } // Obtener id
    public String getNombreMateria() { return nombreMateria; } // Obtener nombre materia
    public String getNivelInteres() { return nivelInteres; }    // Obtener nivel de interes

    public void setNombreMateria(String nombreMateria) { this.nombreMateria = nombreMateria; }  // Modificar nombre materia
    public void setNivelInteres(String nivelInteres) { this.nivelInteres = nivelInteres; } // Modificar nivel de interes    

    @Override // Metodo para imprimir la informacion de la preferencia
    public String toString() { // Sobrescribir el metodo toString
        return "ID: " + id + ", Materia: " + nombreMateria + ", Interés: " + nivelInteres; // Formato de salida
    }
}