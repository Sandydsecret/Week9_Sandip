package Java_week_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//5. Write a Java program to iterate through all elements in an array list using Iterator.

public class Pro_5_IteratorArraylist {

    public static void main(String[] args) {

        List<String> jira = new ArrayList();
        jira.add("Maitry");
        jira.add("Sandip");
        jira.add("Arusa");
        jira.add("Nirmal");
        jira.add("Paryank");
        jira.add("Shreya");
        jira.add("Nikki");
        jira.add("Rashami");

        Iterator i = jira.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
