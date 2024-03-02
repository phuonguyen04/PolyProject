package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhs
 */
public class PersonList {

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public boolean addPersonList(Person ps) {
        if (ps.getName() != null) {
            personList.add(ps);
            return true;
        }
        return false;
    }
    
    public String displayList(){
        String s = "";
        for (Person ps : personList){
            s += "\n\nInformation of person you have entered:\n" + ps.toString();
        }
        return s;
    }
    
     public void sortArray() {
        // bubble sort
        int n = personList.size();
        Person temp;
        for (int i = 0; i < n -1 ; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (personList.get(j).getSalary() > personList.get(j+1).getSalary()) {
                    isSwap = true;
                    temp = personList.get(j);
                    personList.set(j, personList.get(j+1));
                    personList.set(j+1, temp);
                }
            }
            if (!isSwap){
                break;
            }
        }

    }

}
