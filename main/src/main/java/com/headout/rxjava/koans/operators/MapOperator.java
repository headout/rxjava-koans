package com.headout.rxjava.koans.operators;


import com.headout.rxjava.koans.models.Person;
import rx.Observable;

import javax.validation.constraints.NotNull;

/**
 * Created by madki on 10/12/16.
 */
class MapOperator {

    @NotNull
    static Observable<Person> createPersons(Observable<String> fullNames) {
        // TODO use map operator to create Person objects given full names
        // use Person.create(String, String) to create Person object
        return Observable.empty();
    }

}
