package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods {
    static void main() {
        //Index acces:
        //Alow Duplicates:duplicate elemnts are allowed
        //Maintains Insertion order: elements are sore in order they are inserted
        //Not Synchronized:ArrayList is not thred-sift
        int []arr={1,2,3,4,5,6};
        //System.out.println(arr);
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        list.add(11);
        list.add(12);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        System.out.println(list);//Printing list

        list.set(1,50);//changed the value at index 1 with the value 50
        System.out.println(list);

        System.out.println("Size of List: "+list.size());

        System.out.println("First Element : "+list.getFirst());//Print first emlement from the list

        System.out.println("Last Element : "+list.getLast());//Printing last element form the list

        list.remove(2);
        System.out.println("List aftyer removing 13 : "+list);

        System.out.println("Does List Contain 11 : "+list.contains(11));//checks wheither list contain 13 or not

        ArrayList<Integer> newList=new ArrayList<>();//copy list to another list
        newList.addAll(list);//using addAll function for copying elements from list
        System.out.println("Your Copyed List : "+newList);

        System.out.println("Pinting list using index:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("Printing list using value");
        for(Integer value: list){
            System.out.println(value);
        }

        System.out.print("Printing list using iterator.");
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        System.out.println("Revercing the list: ");
        for(int i =list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }

        System.out.print("Reversing List using revese fuction: ");
        System.out.println(list.reversed());//reverce the list

        int evencount=0,oddcount=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Total Even Numbers in List are: "+evencount);
        System.out.println("Total Odd Numbers in List are: "+oddcount);


        int count=0;
        for(Integer value: list)
            if(value%2==0)
              count++;

        System.out.println("Total Even Numbers in List are(Useing iterator ): "+count);

       int sum=0;
        for(Integer value: list)
            sum+=value;

        System.out.println("Sum of elements : "+sum);
        float avg =sum/list.size();
        System.out.println("Average of elements : "+avg);

        //Permenently reverce the list
        Collections.reverse(list);
        System.out.println("After useing Collection reverse: "+list);//Permenently reverce the list

        //Find largest and Smallest element
        Collections.sort(list);
        System.out.println("Smallest element is: "+ list.getFirst());
        System.out.println("Largest element is: "+ list.getLast());

/*Count frequency of each element
        ArrayList<Integer> count = new ArrayList<>();
        for(Iterator value: list){
            Integer currentvalue = count.get(value);
            count set(value,currentvalue);
        }*/

        System.out.println();
        list.clear();//removing all the elements from th elist
        System.out.println("List after clearing all elements : "+list);
        System.out.println(list.removeAll(list));


        //System.out.println(list.indexOf(13));//returns index of 13
        //System.out.println(list.lastIndexOf(6));
        //System.out.println(list.get(2));
        //System.out.println(list.isEmpty());
        Object[] ai  =list.toArray();
       for(Object ob : ai){
           System.out.print(ob + " ");
       }

    }
}
