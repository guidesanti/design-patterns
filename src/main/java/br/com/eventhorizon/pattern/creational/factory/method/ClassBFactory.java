package br.com.eventhorizon.pattern.creational.factory.method;

public class ClassBFactory extends ClassFactory {

    @Override
    Class create() {
        return new ClassB();
    }
}
