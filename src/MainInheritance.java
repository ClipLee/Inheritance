public class MainInheritance {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // dziedziczenie - ang. ingeritance

        BasicClass basicClass = new BasicClass();
        ExpandedClass expandedClass = new ExpandedClass();

        expandedClass.expandedMethod();
        
    }
}
