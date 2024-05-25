package controller;

import model.Registro;
import dao.RegistroDAO;
import java.util.List;

public class RegistroController {
    private RegistroDAO registroDAO;

    public RegistroController(RegistroDAO registroDAO) {
        this.registroDAO = registroDAO;
    }

    public void addRegistro(Registro registro) {
        registroDAO.addRegistro(registro);
    }

    public Registro getRegistro(int registroId) {
        return registroDAO.getRegistro(registroId);
    }

    public List<Registro> getAllRegistros() {
        return registroDAO.getAllRegistros();
    }

    public void updateRegistro(Registro registro) {
        registroDAO.updateRegistro(registro);
    }

    public void deleteRegistro(int registroId) {
        registroDAO.deleteRegistro(registroId);
    }
}
