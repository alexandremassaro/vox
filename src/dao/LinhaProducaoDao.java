package dao;

import model.LinhaProducao;
import java.util.List;

public interface LinhaProducaoDao {
    void addLinhaProducao(LinhaProducao linhaProducao);
    LinhaProducao getLinhaProducao(int linhaId);
    List<LinhaProducao> getAllLinhasProducao();
    void updateLinhaProducao(LinhaProducao linhaProducao);
    void deleteLinhaProducao(int linhaId);
}
