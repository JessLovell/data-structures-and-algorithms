package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEnqueue() {
        Cat jess = new Cat("Jessica");
        Cat test = new Cat("test");
        Cat one = new Cat("one");
        Cat two = new Cat("two");

        Dog three = new Dog("three");
        Dog four = new Dog("four");
        Dog five = new Dog("five");
        Dog six = new Dog("six");

        AnimalShelter shelter = new AnimalShelter();
        assertEquals("expect that shelter is empty", null, shelter.cat.peek());
        assertEquals("expect that shelter is empty", null, shelter.dog.peek());
        shelter.enqueue(jess);
        assertEquals("expect that shelter has Jessica", "Jessica", (shelter.cat.peek().data).toString());
        assertEquals("expect that dog shelter is empty", null, shelter.dog.peek());
        shelter.enqueue(test);
        shelter.enqueue(one);
        shelter.enqueue(two);
        assertEquals("expect that shelter has Jessica", "Jessica", (shelter.cat.peek().data).toString());
        assertEquals("expect that shelter is empty", null, shelter.dog.peek());

        assertEquals("expect that shelter is empty", null, shelter.dog.peek());
        shelter.enqueue(three);
        assertEquals("expect that shelter has three", "three", (shelter.dog.peek().data).toString());
        assertEquals("expect that shelter has Jessica", "Jessica", (shelter.cat.peek().data).toString());
        shelter.enqueue(four);
        shelter.enqueue(five);
        shelter.enqueue(six);
        assertEquals("expect that shelter has three", "three", (shelter.dog.peek().data).toString());
        assertEquals("expect that shelter has Jessica", "Jessica", (shelter.cat.peek().data).toString());

        Cat rando = new Cat("o");
        Dog rande = new Dog("e");
        shelter.dequeue(rando);
        assertEquals("expect that shelter has test", "test", (shelter.cat.peek().data).toString());
        assertEquals("expect that shelter has three", "three", (shelter.dog.peek().data).toString());
        shelter.dequeue(rande);
        assertEquals("expect that shelter has test", "test", (shelter.cat.peek().data).toString());
        assertEquals("expect that shelter has four", "four", (shelter.dog.peek().data).toString());

        shelter.enqueue(rando);
        shelter.enqueue(rande);
        assertEquals("expect that shelter has test", "test", (shelter.cat.peek().data).toString());
        assertEquals("expect that shelter has four", "four", (shelter.dog.peek().data).toString());
    }

    @Test
    public void testDequeque() {
        Cat jess = new Cat("Jessica");
        Cat test = new Cat("test");
        Cat one = new Cat("one");
        Cat two = new Cat("two");
        Cat rando = new Cat("o");

        Dog rande = new Dog("e");
        Dog three = new Dog("three");
        Dog four = new Dog("four");
        Dog five = new Dog("five");
        Dog six = new Dog("six");

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(jess);
        shelter.enqueue(test);
        shelter.enqueue(one);
        shelter.enqueue(two);
        shelter.enqueue(three);
        shelter.enqueue(four);
        shelter.enqueue(five);
        shelter.enqueue(six);
        shelter.enqueue(rando);
        shelter.enqueue(rande);

        assertEquals("expect Cat jess to be returned", jess, shelter.dequeue(rando));
        assertEquals("expect Cat test to be returned", test, shelter.dequeue(rando));
        assertEquals("expect Dog three to be returned", three, shelter.dequeue(rande));
        assertEquals("expect Cat one to be returned", one, shelter.dequeue(rando));
        assertEquals("expect Dog four to be returned", four, shelter.dequeue(rande));
        assertEquals("expect null to be returned", null, shelter.dequeue());
        assertEquals("expect Dog five to be returned", five, shelter.dequeue(rande));
        assertEquals("expect null to be returned", null, shelter.dequeue());
        assertEquals("expect Dog six to be returned", six, shelter.dequeue(rande));
        assertEquals("expect Dog rande to be returned", rande, shelter.dequeue(rande));
        assertEquals("expect Dog null to be returned", null, shelter.dequeue(rande));
        assertEquals("expect Cat two to be returned", two, shelter.dequeue(rando));
        assertEquals("expect Cat rando to be returned", rando, shelter.dequeue(rando));
        assertEquals("expect Cat null to be returned", null, shelter.dequeue(rando));
    }
}