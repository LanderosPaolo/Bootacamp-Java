package interfaces;

import modelsParticipantes.Participante;

import java.util.ArrayList;

public interface ITombolaParticipantes {
    void creacionDelFichero(ArrayList<Participante> participantes);
    void agregarParticipante(ArrayList<Participante> participantes);
    void verParticipantes(ArrayList<Participante> participantes);
    void seleccionarParticipante(ArrayList<Participante> participantes);
}
