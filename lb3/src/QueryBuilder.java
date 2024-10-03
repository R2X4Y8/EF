// Інтерфейс для всіх будівельників запитів
public interface QueryBuilder {
    QueryBuilder select(String columns);
    QueryBuilder where(String condition);
    QueryBuilder limit(int limit);
    String getSQL();
}
