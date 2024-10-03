// Реалізація будівельника для MySQL
public class MySQLQueryBuilder implements QueryBuilder {
    private StringBuilder query;

    public MySQLQueryBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public QueryBuilder select(String columns) {
        query.append("SELECT ").append(columns).append(" ");
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        query.append("WHERE ").append(condition).append(" ");
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append("LIMIT ").append(limit).append(" ");
        return this;
    }

    @Override
    public String getSQL() {
        return query.toString().trim();
    }
}
