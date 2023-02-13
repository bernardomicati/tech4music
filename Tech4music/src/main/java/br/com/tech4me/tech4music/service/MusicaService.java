package br.com.tech4me.tech4music.service;
import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4music.compartilhado.MusicaDto;
import br.com.tech4me.tech4music.model.Musica;

public interface MusicaService {
    MusicaDto criarMusica(MusicaDto produto);
    List<Musica> obterTodos();
    Optional <Musica> obterMusicaPorId(String id);
    //atualizar
    Musica atualizarMusica(String id, Musica produto);
    //deletar
    void excluirMusica(String id);
    Object contador();
}   
