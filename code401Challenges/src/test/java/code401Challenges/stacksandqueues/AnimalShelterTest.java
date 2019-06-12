package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testEnqueue() {
        Cat mew = new Cat("mew");
        Cat pew = new Cat("qew");
        Cat tew = new Cat("rew");

        Dog doo = new Dog("barkStar");
        Dog eoo = new Dog("biteStar");
        Dog foo = new Dog("roamStar");

        AnimalShelter shelter = new AnimalShelter();
        assertEquals("This should be null", null, shelter.cat.peek());
        assertEquals("This should be null", null, shelter.dog.peek());
        shelter.enqueue(mew);
        assertEquals("", "mew", shelter.cat.peek().value.toString());
        shelter.enqueue(mew);
        shelter.enqueue(pew);
        shelter.enqueue(tew);
        assertEquals("This should return barkStar", "mew", shelter.cat.peek().value.toString());

        shelter.enqueue(doo);
        shelter.enqueue(eoo);
        shelter.enqueue(foo);
        assertEquals("This should return mew", "barkStar", shelter.dog.peek().value.toString());

    }

    @Test
    public void testDequeue() {
        Cat mew = new Cat("mew");
        Cat pew = new Cat("qew");
        Cat tew = new Cat("rew");
        Cat rando = new Cat("x");
        Dog doo = new Dog("barkStar");
        Dog eoo = new Dog("biteStar");
        Dog foo = new Dog("roamStar");
        Dog random = new Dog("y");

        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(mew);
        shelter.enqueue(pew);
        shelter.enqueue(tew);

        shelter.enqueue(doo);
        shelter.enqueue(eoo);
        shelter.enqueue(foo);

        shelter.enqueue(rando);
        shelter.enqueue(random);

        assertEquals("This should return mew",mew,shelter.dequeue(rando));
        assertEquals("This should return qew",doo,shelter.dequeue(random));

        assertEquals("This should return mew",pew,shelter.dequeue(rando));
        assertEquals("This should return qew",eoo,shelter.dequeue(random));

        assertEquals("This should return mew",tew,shelter.dequeue(rando));
        assertEquals("This should return qew",foo,shelter.dequeue(random));

        assertEquals("This should return rando",rando,shelter.dequeue(rando));
        assertEquals("This should return null", null,shelter.dequeue(rando));

    }
    @Test
    public void testEnDequeue() {
        Cat mew = new Cat("mew");
        Cat pew = new Cat("qew");
        Cat tew = new Cat("rew");
        Cat rando = new Cat("x");

        Dog doo = new Dog("barkStar");
        Dog eoo = new Dog("biteStar");
        Dog foo = new Dog("roamStar");
        Dog random = new Dog("y");

        AnimalShelter shelter = new AnimalShelter();
        assertEquals("This should be null",null,shelter.cat.peek());
        assertEquals("This should be null",null,shelter.dog.peek());
        shelter.enqueue(mew);
        assertEquals("", "mew", shelter.cat.peek().value.toString());
        assertEquals("This should be null",null,shelter.dog.peek());
        shelter.enqueue(pew);
        shelter.enqueue(tew);
        assertEquals("","mew",shelter.cat.peek().value.toString());

        shelter.dequeue(rando);
        assertEquals("",pew,shelter.dequeue(rando));
        shelter.dequeue(rando);
        assertEquals("",null,shelter.dequeue(rando));

        shelter.enqueue(doo);
        shelter.enqueue(eoo);
        shelter.enqueue(foo);
        shelter.enqueue(tew);
        assertEquals("",doo,shelter.dequeue(random));
        assertEquals("",eoo,shelter.dequeue(random));
        assertEquals("",foo,shelter.dequeue(random));
        assertEquals("",null,shelter.dequeue(random));


}
}