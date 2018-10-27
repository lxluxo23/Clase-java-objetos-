package modelo;

public class Partido {

    private String equipolocal;
    private String equipovisitante;
    private int goleslocal;
    private int golesvisitantes;

    public Partido(String equipolocal, String equipovisitante, int goleslocal, int golesvisitantes) {
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.goleslocal = goleslocal;
        this.golesvisitantes = golesvisitantes;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    public int getGoleslocal() {
        return goleslocal;
    }

    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }

    public int getGolesvisitantes() {
        return golesvisitantes;
    }

    public void setGolesvisitantes(int golesvisitantes) {
        this.golesvisitantes = golesvisitantes;
    }

}
