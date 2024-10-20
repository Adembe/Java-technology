package Seminar4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPerson {

    ArrayList<Person> personList = new ArrayList<Person>();
    Person person;
    public ReadPerson() throws FileNotFoundException, ParseException, PersonException {
        File file = new File("src/Seminar4/person.txt");
        Scanner scanner = new Scanner(file);
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);


        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(!scanner.hasNextLine())
                throw new PersonException("Moriin togsgold hvrsen");
            String[] array = line.split(" ");
            person.firstName = array[0];
            person.lastName = array[1];
            String date = array[2];
            person.date = dateFormat.parse(date);
            personList.add(person);
        }

        for (int i=0; i<personList.size(); i++){
            System.out.print(personList.get(i));
        }

    }



    public static void main(String[] args) {
        try {
            new ReadPerson();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (PersonException e) {
            throw new RuntimeException(e);
        }
    }
}
