package entidades;

import java.util.Random;

public class Equipo extends Torneo {

    private String nombre;
    private int titulares;
    private int suplentes;
    private int directorTecnico;
    private int puntos;
    private int partidosJugados;
    private boolean estado;

    public Equipo() {
    }

    public Equipo(String nombre, int titulares, int suplentes, int directorTecnico, int puntos, int partidosJugados, boolean estado) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
        this.estado = estado;
    }

    private String jugar(Equipo equipo1, Equipo equipo2) {
        int resultadoEquipo1 = obtenerResultadoAleatorio();
        int resultadoEquipo2 = obtenerResultadoAleatorio();

        System.out.println("Resultados del partido:");
        System.out.println("Equipo " + equipo1.getNombre() + ": " + resultadoEquipo1);
        System.out.println("Equipo " + equipo2.getNombre() + ": " + resultadoEquipo2);
        
        // Línea de separación
        System.out.println("-------------------------------");

        // Actualizar puntos y determinar al ganador
        if (resultadoEquipo1 > resultadoEquipo2) {
            equipo1.incrementarPuntos(3);  // Incrementar puntos del equipo1 por la victoria
            return "El equipo " + equipo1.getNombre() + " es el ganador.";
        } else if (resultadoEquipo2 > resultadoEquipo1) {
            equipo2.incrementarPuntos(3);  // Incrementar puntos del equipo2 por la victoria
            return "El equipo " + equipo2.getNombre() + " es el ganador.";
        } else {
            equipo1.incrementarPuntos(1);  // Incrementar puntos del equipo1 por el empate
            equipo2.incrementarPuntos(1);  // Incrementar puntos del equipo2 por el empate
            return "Empate. No hay un ganador claro.";
        }

    }


    // Método en la clase Equipo para incrementar puntos
    public void incrementarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void jugarPartido(Equipo equipo1, Equipo equipo2) {
        String mensajeGanador = jugar(equipo1, equipo2);
        System.out.println(mensajeGanador);
    }


    private int obtenerResultadoAleatorio() {
        Random random = new Random();
        return random.nextInt(11);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTitulares() {
        return titulares;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public int getDirectorTecnico() {
        return directorTecnico;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public void agregarPG() {
        // Implementación
    }

    @Override
    public void agregarPE() {
        // Implementación
    }

    @Override
    public void agregarPP() {
        // Implementación
    }

    @Override
    public int calcularPuntosTotales() {
        // Implementación
        return 0;
    }

    @Override
    public void resultadosPartido(Equipo equipo) {
        // Implementación
    }

    @Override
    public void listarEquipos(Equipo equipo) {
        // Implementación
    }
}
