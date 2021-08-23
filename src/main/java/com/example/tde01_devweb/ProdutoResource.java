package com.example.tde01_devweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @GetMapping("/consulta/{id}")
    public Produto consulta(@PathVariable("id") int id){
        Produto p = new Produto();
        p.setId(id);
        p.setNome("Fiesta");
        p.setAnoFabricacao(2007);
        p.setEan(1234567890);
        return p;
    }

    @GetMapping("/consulta")
    public List<Produto> consultaTodos(){
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(3,"Camaro",2017,323456785));
        produtos.add(new Produto(2,"Gol",2020,555444332));
        produtos.add(new Produto(1,"Fiesta",2007,1234567890));
        return produtos;
    }

    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto produto){
        Produto p = new Produto();
        p.setId(2);
        p.setNome("Gol");
        p.setAnoFabricacao(2020);
        p.setEan(555444332);
        return p;
    }

    @DeleteMapping("/consulta/{id}")
    public List<Produto> deletarProdutos(@PathVariable("id") int id){
        Produto a = new Produto();
        Produto b = new Produto();
        List<Produto> produtos = new ArrayList<Produto>();

        a.setId(3);
        a.setNome("Camaro");
        a.setAnoFabricacao(2017);
        a.setEan(323456785);

        b.setId(2);
        b.setNome("Gol");
        b.setAnoFabricacao(2020);
        b.setEan(555444332);

        produtos.add(a);
        produtos.add(b);
        produtos.removeIf(p -> p.getId() == id);
        return produtos;
    }

    @PutMapping("/atualizar")
    public Produto atualizar(@RequestBody Produto produto){
        Produto p = new Produto();
        p.setId(1);
        p.setNome("Fiesta");
        p.setAnoFabricacao(2008);
        p.setEan(1234567890);
        p.setId(produto.getId());
        p.setNome(produto.getNome());
        p.setAnoFabricacao(produto.getAnoFabricacao());
        p.setEan(produto.getEan());
        return p;
    }










}
