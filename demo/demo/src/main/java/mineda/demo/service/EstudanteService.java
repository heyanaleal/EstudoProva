package mineda.demo.service;

import mineda.demo.entity.EstudanteEntity;
import mineda.demo.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudante;

   public EstudanteEntity buscarPorId(Integer id_estudante){
       Optional<EstudanteEntity> estudanteOp = estudante.findById(id_estudante);
            return  estudanteOp.get();
   }
    public EstudanteEntity novoUsuario(EstudanteEntity estudantes) {
        return estudante.save(estudantes);
    }

    public List<EstudanteEntity> buscarTodos() {
        return estudante.findAll();
    }



}
