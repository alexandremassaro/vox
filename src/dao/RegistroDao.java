package dao;

import model.Registro;
import java.util.List;

public interface RegistroDao {
    void addRegistro(Registro registro);
    Registro getRegistro(int registroId);
    List<Registro> getAllRegistros();
    void updateRegistro(Registro registro);
    void deleteRegistro(int registroId);
}
