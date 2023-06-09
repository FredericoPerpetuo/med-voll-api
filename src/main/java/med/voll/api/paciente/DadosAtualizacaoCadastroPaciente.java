package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoCadastroPaciente(
    @NotNull
    Long id,
    String nome,
    String email,
    String celular,
    DadosEndereco endereco){

}
