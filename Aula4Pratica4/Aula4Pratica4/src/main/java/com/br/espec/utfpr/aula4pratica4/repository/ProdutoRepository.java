/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.repository;

import com.br.espec.utfpr.aula4pratica4.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author gabryelboeira
 */
public class ProdutoRepository {

    private final ArrayList<Produto> produtoList;

    public ProdutoRepository() {
        this.produtoList = new ArrayList<>();

        produtoList.add(new Produto(1, "Computador"));
        produtoList.add(new Produto(2, "Teclado"));
        produtoList.add(new Produto(3, "Mouse"));
        produtoList.add(new Produto(4, "Monitor"));
        produtoList.add(new Produto(5, "WebCan"));
    }

    public void salvar(Produto produto) {
        produtoList.add(produto);
    }

    public ArrayList<Produto> listar() {
        return produtoList;
    }

    public void alterarProduto(Produto produto) {
        produtoList.removeIf(prd -> (prd.getCodigo() == produto.getCodigo()));
        salvar(produto);
    }
}
