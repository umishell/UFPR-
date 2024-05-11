package model.connection;

import java.util.List;

public interface Dao<T> {

    public void add(T objeto) throws Exception;

    public List<T> getAll() throws Exception;

    public T getById(long id) throws Exception;

    public void update(T aluno) throws Exception;

    public void delete(T aluno) throws Exception;

    public void deleteAll() throws Exception;
}
