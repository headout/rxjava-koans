package com.headout.rxjava.koans.operators;

import com.headout.rxjava.koans.models.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rx.Observable;
import rx.observers.TestSubscriber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by madki on 10/12/16.
 */
public class MapOperatorTest {
    private static List<Person> TEST_PERSONS = Arrays.asList(
            Person.create("Howard", "Roark"),
            Person.create("Hank", "Rearden"),
            Person.create("Gail", "Wynand")
    );

    @Test
    public void createPersons() throws Exception {
        Observable<String> fullNames = Observable.from(TEST_PERSONS.
                stream()
                .map(Person::getFullName)
                .collect(Collectors.toList())
        );
        TestSubscriber<Person> subscriber = TestSubscriber.create();

        MapOperator.createPersons(fullNames)
                .subscribe(subscriber);

        Assert.assertEquals(
                "Results are not equal",
                TEST_PERSONS,
                subscriber.getOnNextEvents()
        );
    }

}