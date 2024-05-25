package controller;

import model.Turno;
import dao.TurnoDao;
import java.util.List;

public class TurnoController {
    private TurnoDao turnoDao;

    public TurnoController(TurnoDao turnoDAO) {
        this.turnoDao = turnoDAO;
    }

    public void addTurno(Turno turno) {
        turnoDao.addTurno(turno);
    }

    public Turno getTurno(int turnoId) {
        return turnoDao.getTurno(turnoId);
    }

    public List<Turno> getAllTurnos() {
        return turnoDao.getAllTurnos();
    }

    public void updateTurno(Turno turno) {
        turnoDao.updateTurno(turno);
    }

    public void deleteTurno(int turnoId) {
        turnoDao.deleteTurno(turnoId);
    }
}
