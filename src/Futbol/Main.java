package Futbol;

public class Main {
    public static void main(String[] args) {
        Equipo miEquipo = new Equipo("Real Madrid (Champions League 2022)", "Madrid");

        // Jugadores titulares de la Champions League 2022
        Jugador jugador1 = new Jugador("Thibaut Courtois", 29, "Portero", 1);
        Jugador jugador2 = new Jugador("Dani Carvajal", 30, "Defensa", 2);
        Jugador jugador3 = new Jugador("Eder Militao", 24, "Defensa", 3);
        Jugador jugador4 = new Jugador("Raphael Varane", 28, "Defensa", 5);
        Jugador jugador5 = new Jugador("Ferland Mendy", 26, "Defensa", 23);
        Jugador jugador6 = new Jugador("Luka Modric", 36, "Centrocampista", 10);
        Jugador jugador7 = new Jugador("Casemiro", 29, "Centrocampista", 14);
        Jugador jugador8 = new Jugador("Toni Kroos", 31, "Centrocampista", 8);
        Jugador jugador9 = new Jugador("Karim Benzema", 34, "Delantero", 9);
        Jugador jugador10 = new Jugador("Vinicius Junior", 21, "Delantero", 20);
        Jugador jugador11 = new Jugador("Eden Hazard", 30, "Delantero", 7);

        miEquipo.agregarJugador(jugador1);
        miEquipo.agregarJugador(jugador2);
        miEquipo.agregarJugador(jugador3);
        miEquipo.agregarJugador(jugador4);
        miEquipo.agregarJugador(jugador5);
        miEquipo.agregarJugador(jugador6);
        miEquipo.agregarJugador(jugador7);
        miEquipo.agregarJugador(jugador8);
        miEquipo.agregarJugador(jugador9);
        miEquipo.agregarJugador(jugador10);
        miEquipo.agregarJugador(jugador11);

        Entrenador entrenador = new Entrenador("Zinedine Zidane", 50, 20, "Licenciado en Educación Física", "Real Madrid");
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