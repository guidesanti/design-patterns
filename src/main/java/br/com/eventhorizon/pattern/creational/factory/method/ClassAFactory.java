package br.com.eventhorizon.pattern.creational.factory.method;

public class ClassAFactory extends ClassFactory {

    @Override
    Class create() {
        return new ClassA();
    }
}
