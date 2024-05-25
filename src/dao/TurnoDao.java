package dao;

import model.Turno;
import java.util.List;

public interface TurnoDao {
    void addTurno(Turno turno);
    Turno getTurno(int turnoId);
    List<Turno> getAllTurnos();
    void updateTurno(Turno turno);
    void deleteTurno(int turnoId);
}
