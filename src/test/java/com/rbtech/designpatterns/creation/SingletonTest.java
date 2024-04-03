package com.rbtech.designpatterns.creation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void shouldAbleToGetInstance() {
        // Arrange
        String testData = "Test Data";

        // Act
        Singleton singleton1 = Singleton.getInstance(testData);
        Singleton singleton2 = Singleton.getInstance(testData);

        // Assert
        assertSame(singleton1, singleton2);
    }

    @Test
    public void shouldAbleToGetSameInstanceInMultiThreadedEnvironment() throws InterruptedException {
        // Create an array to hold the instances created by each thread
        Singleton[] singletons = new Singleton[10];

        // Create an array to hold the threads
        Thread[] threads = new Thread[10];

        // Create and start 10 threads, each trying to get an instance of Singleton
        for (int i = 0; i < 10; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                // Each thread tries to get an instance of Singleton
                singletons[index] = Singleton.getInstance("Thread-safe Singleton");
            });
            threads[i].start();
        }

        // Wait for all threads to finish before proceeding
        for (Thread thread : threads) {
            thread.join();
        }

        // Ensure that all instances obtained by the threads are the same
        for (int i = 1; i < singletons.length; i++) {
            System.out.println(singletons[i]);
            assertSame(singletons[0], singletons[i]);
        }
    }

    @Test
    public void shouldAbleToGetDifferentInstancesForDifferentData() {
        // Arrange
        String testData1 = "Test Data 1";
        String testData2 = "Test Data 2";

        // Act
        Singleton singleton1 = Singleton.getInstance(testData1);
        Singleton singleton2 = Singleton.getInstance(testData2);

        // Assert
        assertSame(singleton1, singleton2); // Same instance should be returned regardless of the data
    }


    @Test
    public void shouldNotAllowDirectInstantiation() {
        // Attempt to instantiate Singleton directly
        // Assert
        assertThrows(InstantiationException.class, () -> {
            Singleton.class.newInstance();
        });
    }

    @Test
    public void shouldNotAllowReflectionToCreateMultipleInstances() {
        // Attempt to use reflection to create multiple instances of Singleton
        // Arrange
        Singleton instance1 = Singleton.getInstance("Test Data");
        Singleton instance2 = null;
        try {
            // Use reflection to create a new instance
            instance2 = (Singleton) Singleton.class.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        // Assert
        assertNull(instance2); // Second instance should be null
    }
}