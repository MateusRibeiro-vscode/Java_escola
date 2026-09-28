import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Aluno{
    private String nome;
    private String email;
    private String curso;
    private String genero;
    private boolean receberEmail;
    private boolean receberNotificacao;
    private String rua;
    private String cidade;

    public String getNome(){

        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public  String getEmail(String email){

        return email;
    }
    public void setEmail(){

        this.email = email;
    }
    public String getCurso(String curso){

        return curso;
    }
    public void setCurso(){

        this.curso = curso;
    }
    public String getGenero(String genero){
        return genero;
    }
    public void setGenero(){

        this.genero = genero;
    }
    public boolean isReceberEmail(){

        return receberEmail;
    }
    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }
    public  boolean isReceberNotificacao(){
        return receberNotificacao;
    }
    public void  setReceberNotificacao(boolean receberNotificacao){
        this.receberNotificacao = receberNotificacao;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rus){
        this.rua=rua;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
}

public class JanelaPrincipal extends JFrame {
    private JTextField campoNome, campoEmail,campoRua, campoCidade;
    private JComboBox<String>comboCurso;
    private JCheckBox checkEmail,checkNotificacao;
}

