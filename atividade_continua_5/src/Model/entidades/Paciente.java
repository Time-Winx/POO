package entidades;
import utilitarios.Endereco;
import java.util.Date;

public class Paciente {

    protected String Nome;
    protected String RG;
    protected String CPF;
    public Endereco endereco;
    public String Telefone;
    public Date nascimento;
    public String CRM_medico_responsavel;
    public String ID_quarto;

    public Paciente(String Nome, String RG, String CPF,
                    Endereco endereco, String Telefone,
                    Date nascimento) {
        this.Nome = Nome;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.Telefone = Telefone;
        this.nascimento = nascimento;
    }

    public void setCRM_medico_responsavel(String CRM_medico_responsavel) {
        this.CRM_medico_responsavel = CRM_medico_responsavel;
    }

    public void setID_quarto(String ID_quarto) {
        this.ID_quarto = ID_quarto;
    }

    public String getCRM_medico_responsavel() {
        return CRM_medico_responsavel;
    }

    public String getID_quarto() {
        return ID_quarto;
    }
}
