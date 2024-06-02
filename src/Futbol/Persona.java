package Futbol;

import java.util.List;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Jugador extends Persona {
    private String posicion;
    private int dorsal;
    private int golesAnotados;

    public Jugador(String nombre, int edad, String posicion, int dorsal) {
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.golesAnotados = 0; // Inicializamos los goles en 0
    }

    // Implementación del método getNombre
    public String getNombre() {
        return super.getNombre(); // Llama al método getNombre de la superclase Persona
    }

    // Implementación del método getPosicion
    public String getPosicion() {
        return posicion;
    }
}

class Entrenador extends Persona {
    private int aniosExperiencia;
    private String titulo;
    private String nombreEquipo;

    public Entrenador(String nombre, int edad, int aniosExperiencia, String titulo, String nombreEquipo) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.titulo = titulo;
        this.nombreEquipo = nombreEquipo;
    }

    // Getter para aniosExperiencia
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // Setter para aniosExperiencia
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter para titulo
    public String getTitulo() {
        return titulo;
    }

    // Setter para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para nombreEquipo
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    // Setter para nombreEquipo
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
}

class Masajista extends Persona {
    private int aniosExperiencia;
    private List<String> certificados;
    private String especialidad;

    public Masajista(String nombre, int edad, int aniosExperiencia, List<String> certificados, String especialidad) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.certificados = certificados;
        this.especialidad = especialidad;
    }

    // Getter para aniosExperiencia
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // Setter para aniosExperiencia
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter para certificados
    public List<String> getCertificados() {
        return certificados;
    }

    // Setter para certificados
    public void setCertificados(List<String> certificados) {
        this.certificados = certificados;
    }

    // Getter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter para especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

class Utilero extends Persona {
    private int aniosExperiencia;
    private String funciones;
    private String categoria;

    public Utilero(String nombre, int edad, int aniosExperiencia, String funciones, String categoria) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.funciones = funciones;
        this.categoria = categoria;
    }

    // Getter para aniosExperiencia
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // Setter para aniosExperiencia
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter para funciones
    public String getFunciones() {
        return funciones;
    }

    // Setter para funciones
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    // Getter para categoria
    public String getCategoria() {
        return categoria;
    }

    // Setter para categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
