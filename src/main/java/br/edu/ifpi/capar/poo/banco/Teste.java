package br.edu.ifpi.capar.poo.banco;

import br.edu.ifpi.capar.poo.banco.dao.AlunoDAO;

/**
 *
 * @author Denylson Melo
 */
public class Teste {

    public static void main(String[] args) {

        /*
        CursoDAO cursoDAO = new CursoDAO();
        cursoDAO.consultar();
        */
        
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.consultar();
        
        alunoDAO.cadastrar();
        
        alunoDAO.atualizarNome();
        
        alunoDAO.excluir(aluno);
        
        alunoDAO.consultar();

    }

}
