package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCasdastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
