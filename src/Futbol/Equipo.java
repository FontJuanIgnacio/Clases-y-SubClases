package Futbol;

import Futbol.Persona;
import Futbol.Jugador;
import java.util.ArrayList;
import java.util.List;


public class Equipo {

    private List<Jugador> jugadores;
    private List<Persona> cuerpoTecnico;
    private String nombreEquipo;
    private String ciudad;

    public Equipo(String nombreEquipo, String ciudad) {
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public void agregarCuerpoTecnico(Persona miembro) {
        cuerpoTecnico.add(miembro);
    }


    String getNombreEquipo() {
        return nombreEquipo;
    }

    String getCiudad() {
        return ciudad;
    }


    Iterable<Jugador> getJugadores() {
        return jugadores;
    }

}
