package paqueteEntidades;

public abstract class Torneo {

    public abstract void jugarPartido(Equipo equipo1, Equipo equipo2);

    public abstract void agregarPG();

    public abstract void agregarPE();

    public abstract void agregarPP();

    public abstract int calcularPuntosTotales();

    public abstract void resultadosPartido(Equipo equipo);

    public abstract void listarEquipos(Equipo equipo);
}
