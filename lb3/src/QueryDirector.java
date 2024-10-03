// Клас-директор, який керує процесом побудови запиту
public class QueryDirector {
    private QueryBuilder builder;

    public QueryDirector(QueryBuilder builder) {
        this.builder = builder;
    }

    // Метод для побудови простого запиту
    public String buildSimpleQuery() {
        return builder
                .select("*")
                .where("age > 18")
                .limit(10)
                .getSQL();
    }
}
