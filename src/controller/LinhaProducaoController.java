package controller;

import model.LinhaProducao;
import dao.LinhaProducaoDao;
import java.util.List;

public class LinhaProducaoController {
    private LinhaProducaoDao linhaProducaoDao;

    public LinhaProducaoController(LinhaProducaoDao linhaProducaoDao) {
        this.linhaProducaoDao = linhaProducaoDao;
    }

    public void addLinhaProducao(LinhaProducao linhaProducao) {
        linhaProducaoDao.addLinhaProducao(linhaProducao);
    }

    public LinhaProducao getLinhaProducao(int linhaId) {
        return linhaProducaoDao.getLinhaProducao(linhaId);
    }

    public List<LinhaProducao> getAllLinhasProducao() {
        return linhaProducaoDao.getAllLinhasProducao();
    }

    public void updateLinhaProducao(LinhaProducao linhaProducao) {
        linhaProducaoDao.updateLinhaProducao(linhaProducao);
    }

    public void deleteLinhaProducao(int linhaId) {
        linhaProducaoDao.deleteLinhaProducao(linhaId);
    }
}
