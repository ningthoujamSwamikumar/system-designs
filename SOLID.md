# SOLID Principles
### S - Single Responsibility Principle
    It says a class should have only a single responsibility.
    This enables manageable, and scalable code.
### O - Open Closed Principle
    A class should be open for extension but closed for modification.
    This principle ensures security, and integrity of the code by not allowing
    a code to be modified for new feature additions, but rather extend it to
    add new features.
### L - Liskov Substitution Principle
    If S is a subclass of T, then S should be able to replace T.
    This ensures the child class to have all the properties and methods of its
    parent class. This increase the integrity of code (more trustable).
### I - Interface Segregation Principle
    A client (user of a class) shouldn't be forced to depend on methods that
    aren't required.
    This principle says to segregate and only put closedly related properties within   
    an interface, so that, a big problem can be divided into smaller problems.
### D - Dependency Inversion Principle
    Abstraction shouldn't depend on the implementation, but implementation should depend
    on the abstraction.
    A class shouldn't fused with the tools to perform an action. Rather, it should
    fused with the interface of the tools. This ensure the class doesn't depend
    on the implementation details of the tool, rather it depends on the interface of tools.
    This allows for composability in the code.