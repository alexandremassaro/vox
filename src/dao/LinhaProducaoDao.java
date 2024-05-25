package dao;

import model.LinhaProducao;
import java.util.List;

public interface LinhaProducaoDAO {
    void addLinhaProducao(LinhaProducao linhaProducao);
    LinhaProducao getLinhaProducao(int linhaId);
    List<LinhaProducao> getAllLinhasProducao();
    void updateLinhaProducao(LinhaProducao linhaProducao);
    void deleteLinhaProducao(int linhaId);
}
