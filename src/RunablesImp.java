import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RunablesImp<T> implements Runables {

    private final String sqlQuery;
    private final T entity;
    private final Statement<T> statement;

    public RunablesImp(String sqlQuery, T entity, Statement<T> statement){
        this.sqlQuery = sqlQuery;
        this.entity = entity;
        this.statement = statement;
    }

    @Override
    public String getSQL() {
        return this.sqlQuery;
    }

    @Override
    public void run(PreparedStatement statement) throws SQLException {
        this.statement.run(statement, this.entity);
    }
}
