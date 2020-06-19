package pt.andre.aula46;

public interface sqlDml {
    
    void select (String query);
    void insert (String query);
    void delete (String query);
    void update (String query);

}