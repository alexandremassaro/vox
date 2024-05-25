package controller;

import model.LinhaProducao;
import dao.LinhaProducaoDAO;
import java.util.List;

public class LinhaProducaoController {
    private LinhaProducaoDAO linhaProducaoDAO;

    public LinhaProducaoController(LinhaProducaoDAO linhaProducaoDAO) {
        this.linhaProducaoDAO = linhaProducaoDAO;
    }

    public void addLinhaProducao(LinhaProducao linhaProducao) {
        linhaProducaoDAO.addLinhaProducao(linhaProducao);
    }

    public LinhaProducao getLinhaProducao(int linhaId) {
        return linhaProducaoDAO.getLinhaProducao(linhaId);
    }

    public List<LinhaProducao> getAllLinhasProducao() {
        return linhaProducaoDAO.getAllLinhasProducao();
    }

    public void updateLinhaProducao(LinhaProducao linhaProducao) {
        linhaProducaoDAO.updateLinhaProducao(linhaProducao);
    }

    public void deleteLinhaProducao(int linhaId) {
        linhaProducaoDAO.deleteLinhaProducao(linhaId);
    }
}
