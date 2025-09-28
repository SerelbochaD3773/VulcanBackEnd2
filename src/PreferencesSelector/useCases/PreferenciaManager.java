import java.util.*;  // Importacion de utilidades
import PreferencesSelector.models.PreferenciaMateria; // Importacion del modelo de PreferenciaMateria


public class PreferenciaManager { // Clase para gestionar las preferencias de materias
    private List<PreferenciaMateria> preferencias = new ArrayList<>(); // Lista para almacenar las preferencias
    private int contadorId = 1; // Contador para asignar IDs unicos

    // Crear
    public void agregarPreferencia(String nombre, String interes) { // Metodo para agregar una nueva preferencia
        PreferenciaMateria nueva = new PreferenciaMateria(contadorId++, nombre, interes); // Crear nueva preferencia con ID unico
        preferencias.add(nueva); // Agregar la nueva preferencia a la lista
        System.out.println("Preferencia agregada: " + nueva); // Confirmacion de la adicion
    }

    // Leer
    public void mostrarPreferencias() { // Metodo para mostrar todas las preferencias
        if (preferencias.isEmpty()) { // Verificar si la lista esta vacia
            System.out.println("No hay preferencias registradas."); // Mensaje si no hay preferencias
        } else { // Si hay preferencias
            System.out.println("Preferencias registradas:"); // Mensaje de encabezado
            preferencias.forEach(System.out::println); // Imprimir cada preferencia usando el metodo toString
        }
    }

    // Actualizar
    public void actualizarPreferencia(int id, String nuevoNombre, String nuevoInteres) { // Metodo para actualizar una preferencia existente
        for (PreferenciaMateria p : preferencias) { // Recorrer la lista de preferencias
            if (p.getId() == id) { // Buscar la preferencia por ID
                p.setNombreMateria(nuevoNombre); // Actualizar el nombre de la materia
                p.setNivelInteres(nuevoInteres);    // Actualizar el nivel de interes
                System.out.println("Preferencia actualizada: " + p); // Confirmacion de la actualizacion
                return;
            }
        }
        System.out.println("Preferencia con ID " + id + " no encontrada."); // Mensaje si no se encuentra la preferencia
    }

    // Eliminar
    public void eliminarPreferencia(int id) { // Metodo para eliminar una preferencia por ID
        preferencias.removeIf(p -> p.getId() == id); // Eliminar la preferencia que coincide con el ID
        System.out.println("Preferencia con ID " + id + " eliminada."); // Confirmacion de la eliminacion
    }
}