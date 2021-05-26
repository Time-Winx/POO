package entidades;

import java.util.Date;

public class ItemHistorico {
    private String Observacoes;
    private int Avaliacao_paciente;
    private String id_quarto;
    private Date data_hora;
    private String paciente_cpf;
    private String medico_crm;

    public ItemHistorico(String observacoes, int avaliacao_paciente,
                         String id_quarto, String paciente_cpf, String medico_crm) {
        this.Observacoes = observacoes;
        this.Avaliacao_paciente = avaliacao_paciente;
        this.id_quarto = id_quarto; // TODO: Valida
        this.paciente_cpf = paciente_cpf; // TODO: Valida
        this.medico_crm = medico_crm;  // TODO: Valida
        this.data_hora = new Date();
    }
}
