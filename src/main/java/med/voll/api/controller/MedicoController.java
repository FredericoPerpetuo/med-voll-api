package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCasdastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.MedicoRepository;
import med.voll.api.medico.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCasdastroMedico dados){
        repository.save(new Medico(dados));

    }

    @GetMapping
    public List<DadosListagemMedico>lista(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
