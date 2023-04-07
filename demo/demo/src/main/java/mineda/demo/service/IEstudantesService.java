package mineda.demo.service;

import mineda.demo.entity.EstudanteEntity;

import java.util.List;

public interface IEstudantesService {

    public EstudanteEntity buscarPorId(Integer id_estudante);
    public EstudanteEntity novoUsuario(EstudanteEntity estudantes);
    public List<EstudanteEntity> buscarTodos();
}
