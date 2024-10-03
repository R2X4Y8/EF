//Клієнтський код

public class Main {
    public static void main(String[] args) {
        // Створення будівельника для PostgreSQL
        QueryBuilder postgresBuilder = new PostgreSQLQueryBuilder();
        // Створення директора з використанням будівельника для PostgreSQL
        QueryDirector postgresDirector = new QueryDirector(postgresBuilder);
        // Побудова запиту для PostgreSQL
        String postgresQuery = postgresDirector.buildSimpleQuery();
        System.out.println("PostgreSQL Query: " + postgresQuery);

        // Створення будівельника для MySQL
        QueryBuilder mysqlBuilder = new MySQLQueryBuilder();
        // Створення директора з використанням будівельника для MySQL
        QueryDirector mysqlDirector = new QueryDirector(mysqlBuilder);
        // Побудова запиту для MySQL
        String mysqlQuery = mysqlDirector.buildSimpleQuery();
        System.out.println("MySQL Query: " + mysqlQuery);
    }
}
