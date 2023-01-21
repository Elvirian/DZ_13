package phonebook;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

                Phonebook myPhonebook1 = new Phonebook();
                List<Integer> phoneNumber1 = new ArrayList<>();
                phoneNumber1.add(111111111);
                phoneNumber1.add(222222222);

                myPhonebook1.add("Test1", 123456789, 987654321);
                myPhonebook1.add(new Recording("Test2", phoneNumber1));

                List<Integer> phoneNumber2 = new ArrayList<>();
                phoneNumber2.add(333333333);
                phoneNumber2.add(444444444);
                List<Integer> phoneNumber3 = new ArrayList<>();
                phoneNumber3.add(555555555);
                phoneNumber3.add(666666666);
                List<Integer> phoneNumber4 = new ArrayList<>();
                phoneNumber4.add(777777777);
                phoneNumber4.add(888888888);

                List<Recording> myRecording = new ArrayList<>();
                myRecording.add(new Recording("Test3", phoneNumber2));
                myRecording.add(new Recording("Test4", phoneNumber3));
                myRecording.add(new Recording("Test5", phoneNumber4));

                Phonebook myPhonebook2 = new Phonebook(myRecording);

                System.out.print("Find Test2 in myPhonebook1: ");
                System.out.println(myPhonebook1.find("Test2"));

                System.out.print("Find Test3 in myPhonebook1: ");
                System.out.println(myPhonebook1.find("Test3"));

                System.out.print("Find Test5 in myPhonebook2: ");
                System.out.println(myPhonebook2.find("Test5"));

                System.out.print("Find Test in myPhonebook2: ");
                System.out.println(myPhonebook2.find("Test"));

                System.out.print("FindAll Test1, Test2, Test3 in myPhonebook1: ");
                System.out.println(myPhonebook1.findAll("Test1", "Test2", "Test3")); //null

                System.out.print("FindAll Test5, Test4, Test3 in myPhonebook2: ");
                System.out.println(myPhonebook2.findAll("Test5", "Test4", "Test3"));

                System.out.print("FindAll Test4 in myPhonebook2: ");
                System.out.println(myPhonebook2.findAll("Test4"));

                System.out.print("FindAll Test8 in myPhonebook2: ");
                System.out.println(myPhonebook2.findAll("Test8")); //null
            }
        }