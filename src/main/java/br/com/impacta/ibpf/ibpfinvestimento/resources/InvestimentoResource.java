package br.com.impacta.ibpf.ibpfinvestimento.resources;

import br.com.impacta.ibpf.ibpfinvestimento.entities.Investimento;
import br.com.impacta.ibpf.ibpfinvestimento.repositories.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/investimentos")
public class InvestimentoResource {
    @Autowired
    private InvestimentoRepository investimentoRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Investimento> findById(@PathVariable Long id){
        Investimento investimento = investimentoRepository.findById(id).get();
        return ResponseEntity.ok(investimento);
    }

}
