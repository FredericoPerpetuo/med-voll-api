package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoCadastroMedico(
        @NotNull
        Long id,
        String nome,
        String email,
        String celular,
        DadosEndereco endereco) {
}
