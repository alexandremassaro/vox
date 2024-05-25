package controller;

import model.Turno;
import dao.TurnoDAO;
import java.util.List;

public class TurnoController {
    private TurnoDAO turnoDAO;

    public TurnoController(TurnoDAO turnoDAO) {
        this.turnoDAO = turnoDAO;
    }

    public void addTurno(Turno turno) {
        turnoDAO.addTurno(turno);
    }

    public Turno getTurno(int turnoId) {
        return turnoDAO.getTurno(turnoId);
    }

    public List<Turno> getAllTurnos() {
        return turnoDAO.getAllTurnos();
    }

    public void updateTurno(Turno turno) {
        turnoDAO.updateTurno(turno);
    }

    public void deleteTurno(int turnoId) {
        turnoDAO.deleteTurno(turnoId);
    }
}
