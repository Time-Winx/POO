package entidades;

import java.awt.*;
import java.util.ArrayList;

public class Quarto {

    protected String id;
    public String Numero;
    public int Andar; // TODO: Criar estrutura de andar especializado
    protected int Maximo_hospedes;
    protected ArrayList hospedes;

    public Quarto(String numero, int Andar, int maximo_hospedes) {
        this.Andar = Andar;
        this.Numero = numero;
        this.Maximo_hospedes = maximo_hospedes;
        this.id = this.Andar + this.Numero;
    }

    public ArrayList getHospedes() {
        return hospedes;
    }

    public void addHospedes(Paciente paciente) {
        if (hospedes.size() == 0) {
            hospedes.add(paciente);
        }
    }
}
