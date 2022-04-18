/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.ejb;

import com.br.espec.utfpr.aula4pratica4.model.Produto;
import com.br.espec.utfpr.aula4pratica4.repository.ProdutoRepository;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 */
@Stateless
public class EjbProduto {
   
    private ProdutoRepository produtoRepository;
    
    public EjbProduto() {
        this.produtoRepository = new ProdutoRepository();
    }
   
    public ArrayList<Produto> getAllProdutos() {    
        return produtoRepository.listar();
    }    
   
}
