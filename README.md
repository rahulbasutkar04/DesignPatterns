# Creational Design Pattern

The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance throughout the application's lifecycle. 

# Characteristics of Singleton Pattern:
## Singleton Design Pattern

- **Single Instance**: Only one instance of the class is created and shared across the application.

- **Thread Safety**: The pattern is adapted to handle multiple threads to prevent race conditions.

  - **volatile Keyword**: It ensures that changes made to the `instance` variable are immediately visible to other threads. Without `volatile`, there is a possibility of a thread seeing a partially constructed instance of the Singleton, which could lead to bugs.

  - **Double-Checked Locking**: Two times `if` condition is used for double-checked locking. The first `if` condition outside the synchronized block checks if the instance is already initialized, which avoids the expensive synchronization once the instance is created. The second `if` condition inside the synchronized block ensures that only one thread initializes the instance, preventing race conditions.

- **Restricted Object Creation**: All means of creating objects of the class are disabled except for a special static creation method (typically named `getInstance()`). This prevents external code from instantiating the class directly.

- **Returns Existing Instance**: The `getInstance()` method returns the existing instance if it has already been created. If no instance exists, it creates one and returns it. Subsequent calls to `getInstance()` return the same instance.
