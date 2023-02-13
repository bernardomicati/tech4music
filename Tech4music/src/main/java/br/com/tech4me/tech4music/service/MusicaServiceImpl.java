package br.com.tech4me.tech4music.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4music.compartilhado.MusicaDto;
import br.com.tech4me.tech4music.model.Musica;
import br.com.tech4me.tech4music.repository.ProdutoRepository;

@Service
public class MusicaServiceImpl implements MusicaService {

    @Autowired
    private ProdutoRepository repositorio;

    @Override
    public List<Musica> obterTodos() {
        return repositorio.findAll();
    }

    @Override
    public MusicaDto criarMusica(MusicaDto produto) {
        return null;
    }

    @Override
    public Optional<Musica> obterMusicaPorId(String id) {
        return Optional.empty();
    }

    @Override
    public Musica atualizarMusica(String id, Musica produto) {
        return null;
    }

    @Override
    public void excluirMusica(String id) {
        
    }

    @Override
    public Object contador() {
        return null;
    }
    
}