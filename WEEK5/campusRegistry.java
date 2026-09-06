public class CampusRegistry
{
    private Person[] people;
    private int size;

    public CampusRegistry(int capacity) 
{
        people = new Person[capacity];
        size = 0;
    }
    public void addPerson(Person person)
{
        if (size < people.length) 
{
            people[size++] = person;
        } else {
            System.out.println("Registry is full. Cannot add more people.");
        }
    }
    public void displayAllPeople() 
{
        for (int i = 0; i < size; i++) 
{
            System.out.println(people[i]);
        }
    }
    

}
