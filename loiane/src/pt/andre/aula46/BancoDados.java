package pt.andre.aula46;

public interface BancoDados extends sqlDcl, sqlDdl, sqlDml{
    
    void abrirConexão();
    void fecharConexão();

}