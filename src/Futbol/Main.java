package Futbol;

public class Main {
    public static void main(String[] args) {
        Equipo miEquipo = new Equipo("Los Tigres", "Monteros");

        Jugador jugador1 = new Jugador("Lionel Messi", 34, "Delantero", 10);
        Jugador jugador2 = new Jugador("Sergio Ramos", 35, "Defensa", 4);

        miEquipo.agregarJugador(jugador1);
        miEquipo.agregarJugador(jugador2);

        Entrenador entrenador = new Entrenador("Pep Guardiola", 50, 20, "Licenciado en Ciencias del Deporte", "Los Tigres");
        miEquipo.agregarCuerpoTecnico(entrenador);

        System.out.println("Equipo: " + miEquipo.getNombreEquipo());
        System.out.println("Ciudad: " + miEquipo.getCiudad());
        System.out.println("Jugadores:");
        
        for (Jugador jugador : miEquipo.getJugadores()) {
            System.out.println("- " + jugador.getNombre() + " (" + jugador.getPosicion() + ")");
        }
        
        System.out.println("Entrenador: " + entrenador.getNombre());
    }
}
