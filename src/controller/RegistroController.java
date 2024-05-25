package controller;

import model.Registro;
import dao.RegistroDao;
import java.util.List;

public class RegistroController {
    private RegistroDao registroDao;

    public RegistroController(RegistroDao registroDao) {
        this.registroDao = registroDao;
    }

    public void addRegistro(Registro registro) {
        registroDao.addRegistro(registro);
    }

    public Registro getRegistro(int registroId) {
        return registroDao.getRegistro(registroId);
    }

    public List<Registro> getAllRegistros() {
        return registroDao.getAllRegistros();
    }

    public void updateRegistro(Registro registro) {
        registroDao.updateRegistro(registro);
    }

    public void deleteRegistro(int registroId) {
        registroDao.deleteRegistro(registroId);
    }
}
