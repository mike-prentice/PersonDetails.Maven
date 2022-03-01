package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int count = 0;// create a `counter`

        while(count < personArray.length) {// while `counter` is less than length of array
            result += personArray[count];// begin loop
            count++;
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

        }   // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            result += personArray[i];
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person name : personArray) {
            result += name;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
