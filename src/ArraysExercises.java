import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        Array Basics
//
//        Create a class inside of src named ArraysExercises.
//        Create a main method for this class to do your work.
//
//      What happens when you run the following code? Why is
//      Arrays.toString necessary? it shows the array, not the #
         /**
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(
        "without Arrays.toString(): " +
        numbers +
        "\n" +
        "with Arrays.toString(): " +
        Arrays.toString(numbers)
        );
         **/

         /**TODO:its not functioning correct... or is not being invoked correctly.
//      Create an array that holds 3 Person objects. Assign a new
//      instance of the Person class to each element. Iterate through
//      the array and print out the name of each person in the array.
        //  THIS CREATES THE NEW ARRAY, AND GIVES IT THE SET LENGTH.
        Person[] persons = new Person [3]; // this is 0-2, 0,1,2
        //SET THE ARRAY VALUES.
        persons[0] = new Person("Matthew");
        persons[1] = new Person("Mark");
        persons[2] = new Person("Luke");
        //DO THE FORLOOP OUT OF MAIN...
        //you want to make the function...method? out of main
        // and invoke it in main.
        //unless you use the method, you will get
        // out of range for the array.
        persons[3] = new Person("John");
        System.out.println(addPerson(persons, persons[3]));
          **/



//pull an element from each array...
        //string arrays, pull elements out of string arrays, make a concatenation
         /** x not this
        String[] threePeople = {"Daniel", "David", "Elijah"};
        for (String onePerson : threePeople) {
            System.out.println("this is forloop: " + onePerson);
        }
        addPerson(Arrays.toString(threePeople));
        }
         **/
//      Create a static method named addPerson. It should
//      accept an array of Person objects, as well as a
//      single person object to add to the passed array. It
//      should return an array whose length is 1 greater than
//      the passed array, with the passed person object at
//      the end of the array.
    /**

     Person[] persons = new Person[3];
     persons[0] = new Person("Justin");
     persons[1] = new Person("Dane");
     persons[2] = new Person("Javier");

     for (Person person : persons){
     System.out.println(person.getName());
     }
     Person[] newPersonsArray = ArraysExercises.addPerson(persons, new Person("Jay"));
     for(Person person: newPersonsArray){
     person.sayHello();
     }
     //override toString in person.java
     sout(Arrays.toString(newPersonsArray));

     **/
//        Server Name Generator
//
//        We are going to build a server name generator.
//        Create a class inside of src named ServerNameGenerator,
//        and follow the specs below.
//
//        Create two arrays whose elements are strings:
//        one with at least 10 adjectives, another with at
//        least 10 nouns.
//       Create a method that will return a random
//       element from an array of strings.
//       Add a main method, and inside of your main
//       method select and random noun and adjective






    }

    //person[] is person object.
    //TAKING IN A PERSON OBJECT.
    //with its value as the second parameter?
    //sout this later.

    /**
     * TODO:its not functioning correct... or is not being invoked correctly.
public static Person[] addPerson(Person[] persons, Person newPerson){
Person[] anyNameForNewArray = new Person[persons.length + 1];

    for (int i = 0; i < persons.length; i++) {
        anyNameForNewArray[i] = persons[i];
    }
    anyNameForNewArray[anyNameForNewArray.length - 1] = newPerson;
    return anyNameForNewArray;
}
     **/
    /** assuming you have person.java: do this out of main.
     public static Person[] addPerson(Person[] persons, Person n00b){
     Person[] newBiggerArray = new Person[persons.length + 1];
     for (int i = 0; i < persons.length; i++){
     newBiggerArray[i] = persons[i];
     }
     newBiggerArray[newBiggerArray.length-1] = n00b;
     return newBiggerArray;
     } **/

    //optional movie list, try to make server name generator.
}
