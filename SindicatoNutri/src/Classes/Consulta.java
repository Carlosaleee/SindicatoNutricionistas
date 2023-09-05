
package Classes;


public class Consulta {
    

            String nome;
            String cpf;
            String telefone;
            String data;
            boolean JaePaciente;
            boolean ConsultaRealizada; 
            String Historico;

    public String getHistorico() {
        return Historico;
    }

    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }
            

    public boolean isJaePaciente() {
        return JaePaciente;
    }

    public void setJaePaciente(boolean JaePaciente) {
        this.JaePaciente = JaePaciente;
    }

    public boolean isConsultaRealizada() {
        return ConsultaRealizada;
    }

    public void setConsultaRealizada(boolean ConsultaRealizada) {
        this.ConsultaRealizada = ConsultaRealizada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void marcarConsultaRealizada() {
    ConsultaRealizada = true;
}
    
}
