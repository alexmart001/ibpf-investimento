package br.com.impacta.ibpf.ibpfinvestimento.repositories;

import br.com.impacta.ibpf.ibpfinvestimento.entities.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
