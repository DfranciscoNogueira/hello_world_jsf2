package br.com.hello.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.hello.model.Produto;

@ManagedBean(name = "bean")
@SessionScoped
public class MainBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Produto produto;
    
    @PostConstruct
    public void init(){
        this.produto = new Produto();
    }

    public void salvar() {
        System.out.println(produto.getNome());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
