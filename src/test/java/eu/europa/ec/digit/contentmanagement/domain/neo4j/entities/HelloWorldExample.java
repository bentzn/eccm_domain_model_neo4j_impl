package eu.europa.ec.digit.contentmanagement.domain.neo4j.entities;

import org.neo4j.ogm.driver.Driver;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.transaction.Transaction;

public class HelloWorldExample implements AutoCloseable {

    private final Driver driver = null;


//    public HelloWorldExample(String uri, String user, String password) {
//        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
//    }
//
//
    @Override
    public void close() throws Exception {
        driver.close();
    }
//
//
//    public void printGreeting(final String message) {
//        try (Session session = driver.session()) {
//            String greeting = session.writeTransaction(new TransactionWork<String>() {
//                @Override
//                public String execute(Transaction tx) {
////                    StatementResult result = tx.run("CREATE (a:Greeting) " + "SET a.message = $message "
////                            + "RETURN a.message + ', from node ' + id(a)", parameters("message", message));
////                    return result.single().get(0).asString();
//                    return null;
//                }
//            });
//            System.out.println(greeting);
//        }
//    }
//
//
//    public static void main(String... args) throws Exception {
//        try (HelloWorldExample greeter = new HelloWorldExample("bolt://localhost:7687", "neo4j", "password")) {
//            greeter.printGreeting("hello, world");
//        }
//    }
}
