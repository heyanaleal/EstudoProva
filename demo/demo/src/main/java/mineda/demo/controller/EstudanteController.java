package mineda.demo.controller;

import mineda.demo.entity.EstudanteEntity;
import mineda.demo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteS;
    @GetMapping
    public List<EstudanteEntity> buscarTodosEstudantes(){

        return  estudanteS.buscarTodos();
    }
    @PostMapping
    public EstudanteEntity novoEstudante(@RequestBody EstudanteEntity estudante){
        return estudanteS.novoUsuario(estudante);
    }
    @GetMapping(value = "/id/{id_estudante}")
    public EstudanteEntity estudanteId(@PathVariable("id_estudante") Integer id_estudante){
        return estudanteS.buscarPorId(id_estudante);
    }

}
