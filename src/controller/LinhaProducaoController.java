package controller;

import model.LinhaProducao;
import dao.LinhaProducaoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LinhaProducaoController {
    private LinhaProducaoDao linhaProducaoDao;

    public LinhaProducaoController(LinhaProducaoDao linhaProducaoDao) {
        this.linhaProducaoDao = linhaProducaoDao;
    }

    public void addLinhaProducao(LinhaProducao linhaProducao) {
        try {
            linhaProducaoDao.add(linhaProducao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getLinhaProducao(int linhaId) {
        try {
            String linhaPesquisada = linhaProducaoDao.get(linhaId).toString();
            return linhaPesquisada;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<LinhaProducao> getAllLinhasProducao() {
        List<LinhaProducao> listaProducao = new ArrayList<LinhaProducao>();
        try {
            listaProducao = linhaProducaoDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaProducao;
    }

    /*public void updateLinhaProducao(LinhaProducao linhaProducao) {
        linhaProducaoDao.updateLinhaProducao(linhaProducao);
    }*/

    public void deleteLinhaProducao(int linhaId) {
       try{
           linhaProducaoDao.delete(linhaId);
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}
