package dao;

import model.Registro;
import java.util.List;

public interface RegistroDAO {
    void addRegistro(Registro registro);
    Registro getRegistro(int registroId);
    List<Registro> getAllRegistros();
    void updateRegistro(Registro registro);
    void deleteRegistro(int registroId);
}
