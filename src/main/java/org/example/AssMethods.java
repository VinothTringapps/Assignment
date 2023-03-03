package org.example;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.*;
 public class AssMethods{
      int count=0;
      String name;
     Scanner sc = new Scanner(System.in);
    static Logger l = Logger.getLogger("Expection");
    String s = "----------------------------------";
     static String enterChoice ="Enter the Choice :";
     static String enterName="Enter the Name :";
    static String wrongChoice="Wrong Choice !";
    int choice;
     protected void bank(){
        l.info("Bank Application");
        l.info(s);
        int number;
        double amount;
        double depositAmount;
        double withDrawAmount;
        l.info(enterName);
        name = sc.nextLine();
        l.info("\nEnter the Account Number :");
        number = sc.nextInt();
        l.info("\nEnter the Balance :");
        amount = sc.nextDouble();
        Bank bank = new Bank(name, number, amount);
        l.info("Welcome TO The Bank");
        do {
            l.info("1.Deposit \n 2.Withdraw \n 3.Show");
            l.info(enterChoice
            );
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    l.info("Deposit :");
                    l.info(" Enter the Amount To Deposit :");
                    depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount);
                }
                case 2 -> {
                    l.info("WithDraw :");
                    l.info("Enter the Amount To Withdraw :");
                    withDrawAmount = sc.nextDouble();
                    bank.withDraw(withDrawAmount);
                }
                case 3 -> {
                    l.info("Show Details :");
                    bank.display();
                }
                default -> l.info("Enter the Correct Choice !");
            }
        } while (choice <= 3);
    }
    protected void shape(){
        l.info("Basic Shape");
        l.info(s);
        String shape;
        do {
            l.info("Triangle \tRectangle \tCircle");
            l.info("Enter the Type You Want :");
            shape = sc.nextLine();
            if (shape.equalsIgnoreCase("triangle")) {
                l.info("Enter the length of first Side :");
                double triangleLength1 = sc.nextDouble();
                l.info("Enter the Length of Second Side :");
                double triangleLength2 = sc.nextDouble();
                l.info("Enter the Length of Third Side :");
                double triangleLength3 = sc.nextDouble();
                BasicShape t = new BasicShape(shape, triangleLength1, triangleLength2, triangleLength3);
                l.info("\nTriangle \n-------");
                String area = "Area of the Triangle :" + t.triangleArea();
                l.info(area);
                String perimeter = "Perimeter of the Triangle :" + t.trianglePerimeter();
                l.info(perimeter);
                l.info(s);
                sc.nextLine();
            } else if (shape.equalsIgnoreCase("rectangle")) {
                l.info("Enter the Length of the Rectangle :");
                double rectangleLength = sc.nextDouble();
                l.info("Enter the Width of the Rectangle :");
                double rectangleWidth = sc.nextDouble();
                BasicShape r = new BasicShape(shape, rectangleLength, rectangleWidth);
                l.info("\n Rectangle\n---------");
                String area = "Area of the Rectangle :" + r.rectangleArea();
                l.info(area);
                String perimeter = "Perimeter of the Rectangle :" + r.rectanglePerimeter();
                l.info(perimeter);
                l.info(s);
                sc.nextLine();

            } else if (shape.equalsIgnoreCase("Circle")) {
                l.info("Enter the Radius of the Circle :");
                double circleRadius = sc.nextDouble();
                BasicShape c = new BasicShape(shape, circleRadius);
                l.info("\n Circle \n------");
                String area = "Area of the Circle :" + c.circleArea();
                l.info(area);
                String perimeter = "Perimeter of the Circle :" + c.circlePerimeter();
                l.info(perimeter);
                l.info(s);
                sc.nextLine();
            } else {
                l.info("Wrong shape !");
                l.info(s);

            }
        } while (shape.isEmpty());
    }
    protected void school(){
        l.info("School Test ");
        l.info(s);
        School school = new School(null, null, 0);
        String name1;
        String grade;
        double gradePoints;

        l.info(enterName);
        name1 = sc.nextLine();
        school.update();
        grade = school.grade;
        gradePoints = school.gradePoints;
        School s1 = new School(name1, grade, gradePoints);
         do {
            l.info("1.display /n 2.Update");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> s1.display();
                case 2 -> s1.update();
                default -> l.info(wrongChoice);
            }

        }while(choice<=2);
    }
    protected void connectionPool(){
        l.info("Connection Pool");
        l.info(s);
        do{
            l.info("1.Create Connection \t2.Close Connection");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    l.info("\nEnter the Database Name :");
                    String databaseName = sc.nextLine();
                    String url = "jdbc:mysql://localhost:3306/" + databaseName;
                    l.info("\nEnter the User Name :");
                    String userName = sc.nextLine();
                    l.info("\nEnter the Password :");
                    String userPassword = sc.nextLine();
                    ConnectionPool connection = ConnectionPool.getInstance();
                    connection.create(url, userName, userPassword);
                }
                case 2 -> {
                    ConnectionPool connection = ConnectionPool.getInstance();
                    connection.closeConnection();
                }
                default -> l.info("\n Enter the Correct Choice !");
            }

        }while (choice<=2);
    }
    protected void basicPoint(){
        l.info("Basic Point");
        l.info(s);
        double x;
        double y;
        l.info("Enter the Value of X :");
        x = sc.nextDouble();
        l.info("Enter the Value of Y :");
        y = sc.nextDouble();
        BasicPoint b = new BasicPoint(x, y);
        //Clone the b object into b1
        BasicPoint b1 = (BasicPoint) b.clone();
        l.info("Enter the Value of X :");
        x = sc.nextDouble();
        l.info("Enter the Value of Y :");
        y = sc.nextDouble();
        BasicPoint b2 = new BasicPoint(x, y);
        boolean eql = b1.eql(b2);
        String s1 = "Objects are b && b1 are Equal  : " + eql;
        l.info(s1);
    }
    protected void basicCreditCard(){
        l.info("Basic Credit Card");
        l.info(s);
        l.info("Enter the  Card Holder Name :");
        name = sc.nextLine();
        l.info("Enter the Card Number :");
        String cardNumber = sc.nextLine();
        l.info("Enter the Expiry Date :");
        String expiryDate = sc.nextLine();
        BasicCreditCard b = new BasicCreditCard(name, cardNumber, expiryDate);
        BasicCreditCard b2 = (BasicCreditCard) b.clone();
        l.info("Enter the Card holder Name :");
        String name2 = sc.nextLine();
        l.info("Enter the Card Number :");
        String cardNumber2 = sc.nextLine();
        l.info("Enter the Expiry Dated :");
        String expiryDate2 = sc.nextLine();
        BasicCreditCard b3 = new BasicCreditCard(name2, cardNumber2, expiryDate2);
        String checkEql = "Details are Equal : " + b2.checkEqual(b3);
        l.info(checkEql);
    }
     protected void arrayList(){
         ListMethods lm=new ListMethods();

         do{
             l.info("1.Insert \t 2.RemoveWithPosition \t 3.Clear \t 4.Display\t 5.Size");
             choice= sc.nextInt();
             switch (choice)
             {
                 case 1-> {
                     l.info("Enter the String :");
                     String a=sc.next();
                     lm.listAdd(a);}
                 case 2-> {
                     l.info("Enter the index :");
                     int a=sc.nextInt();
                     lm.listRemove(a);
                 }
                 case 3-> lm.listClear();
                 case 4-> lm.display();
                 case 5-> lm.size();
                 default -> l.info(wrongChoice);
             }
         }while (choice<6);

     }
     protected void linkedList(){
         LinkedListOneData linklist=new LinkedListOneData();

         int ch;
         String str="Enter the Position for LinkedList:";

         do{
             l.info("1.InsertFirst \n 2.InsertLast\n3.InsertAtPos\n4.RemoveFirst\n5.RemoveLast\n6.RemoveAtPos\n7.Display\n8.search by Name");
             l.info(enterChoice);
             ch= sc.nextInt();
             switch (ch){
                 case 1->{
                     l.info(enterName);
                     String nameInsertFirst= sc.next();
                     linklist.insertFirst(nameInsertFirst);
                 }
                 case 2->{
                     l.info(enterName);
                     String nameInsertLast= sc.next();
                     linklist.insertLast(nameInsertLast);
                 }
                 case 3->{
                     l.info(enterName);
                     String nameInsertAt=sc.next();
                     l.info(str);
                     int index=sc.nextInt();
                     linklist.insertAt(nameInsertAt,index);
                 }
                 case 4-> linklist.removeFirst();
                 case 5-> linklist.removeLast();
                 case 6-> {
                     l.info(str);
                     int index = sc.nextInt();
                     linklist.removeAt(index);
                 }
                 case 7->
                         linklist.display();
                 case 8->
                 {
                     l.info(enterName);
                     name=sc.next();
                     int res=linklist.search(name);
                     if(res>0)
                     {
                         l.log(Level.INFO,()->"Element is At Position :"+res);
                     }
                     else
                     {
                         l.info("The name is not found");
                     }

                 }

                 default ->
                         l.info(wrongChoice);

             }
         }while(ch!=9);
     }
     protected  void ticTacToe(){
         TicTacToe tic=new TicTacToe();

         tic.printBoard();
         name="Player 1";
         HumanPlayer player1=new HumanPlayer(name,'X');
         String name1="Player 2";
         HumanPlayer player2=new HumanPlayer(name1,'O');
         HumanPlayer cp;
         cp = player1;

         while(count<=8) {
             TicTacToe.l.println(cp.name + " Turn");
             cp.makeMove();
             count++;
             tic.printBoard();
             if(TicTacToe.checkRow() || TicTacToe.checkColumn() || TicTacToe.checkDiagonal() )
             {
                 TicTacToe.l.println(cp.name +" Win");
             }
             else
             {
                 if(cp==player1)
                 {
                     cp=player2;
                 }
                 else
                 {
                     cp=player1;
                 }
             }
         }
         if(count==9) {
             TicTacToe.l.println("Draw !");
         }
     }
     protected void calculator(){
         int getVariableA;
         int getVariableB;

         int ch;
         Cal c=null;
         do{
             l.info("1.Addition \n 2.Subraction \n 3.Multiplication \n4.Division");
             l.info(enterChoice
             );
             ch= sc.nextInt();
             l.info("Enter the First Number :");
             getVariableA=sc.nextInt();
             l.info("Enter the Second Number :");
             getVariableB=sc.nextInt();

             switch (ch){
                 case 1 ->
                         c= new Addition();

                 case 2->
                         c= new Subraction();

                 case 3->
                         c= new Multiplication();
                 case 4->
                         c= new Division();

                 default ->
                         l.info(wrongChoice);


             }

             c.setA(getVariableA);
             c.setB(getVariableB);
             int s1=c.getA();
             int s2=c.getB();
             String s3="the Value is "+c.setCal(s1,s2);
             l.info(s3);

         }while (ch<=5);

     }
     protected void treeSet(){
         TreeSet<String> animals=new TreeSet<>();
         animals.add("dog");
         animals.add("cow");
         animals.add("elephant");
         //don't allow Duplicates
         animals.add("cow");
         l.log(Level.INFO,()->String.valueOf(animals));
         TreeSet<String> animals1=new TreeSet<>();
         animals1.add("pandas");
         animals1.add("horses");
         animals1.add("cats");
         l.log(Level.INFO,()->String.valueOf(animals1));
         animals1.addAll(animals);
         l.log(Level.INFO,()->String.valueOf(animals1));
         l.log(Level.INFO,()->String.valueOf(animals1.contains("cow")));
         animals1.remove("cow");
         l.log(Level.INFO,()->String.valueOf(animals1));
         animals1.clear();
         l.log(Level.INFO,()->String.valueOf(animals1));
         l.log(Level.INFO,()->String.valueOf(animals.last()));
         l.log(Level.INFO,()->String.valueOf(animals.first()));

     }
     protected void hashSet(){
         HashSet<String> hash=new HashSet<>();
         l.info("Add");
         hash.add("vinoth");
         hash.add("Gopi");
         hash.add("virat");
         l.log(Level.INFO,()->String.valueOf(hash));
         l.info("Remove");
         hash.remove("virat");
         l.log(Level.INFO,()->String.valueOf(hash));
         HashSet<String> hash1=new HashSet<>();
         hash1.add("nitin");
         hash1.add("dhoni");
         hash1.addAll(hash);
         l.log(Level.INFO,()->String.valueOf(hash1));
         hash1.clear();
         l.log(Level.INFO,()->String.valueOf(hash1));
     }
     protected void hash(){

         int rollNo;
         HashMap <Integer,String> hash=new HashMap<>();
         do{
             l.info("1.Add\t2.size\t3.Remove\t4.display\n");
             l.info(enterChoice
             );
             choice= sc.nextInt();

             if(choice==1){
                 l.info("Add");

                 l.info("Enter the Roll No :");
                 rollNo=sc.nextInt();
                 sc.nextLine();
                 l.info(enterName);
                 name=sc.nextLine();

                 hash.put(rollNo,name);
             }
             else if(choice ==2){
                 l.log(Level.INFO,()->"Size ="+hash.size());


             }
             else if(choice ==3){
                 l.info("1.value Removal\t 2.Clear\n");
                 l.info(enterChoice
                 );
                 choice=sc.nextInt();


                 if(choice==1){
                     l.info("Enter the Value :");
                     rollNo=sc.nextInt();
                     String remove=hash.remove(rollNo);
                     l.log(Level.INFO,()->remove);
                 }
                 else {
                     hash.clear();
                 }

             }
             else{
                 l.info("1.value Display\n 2.Display");
                 choice=sc.nextInt();
                 sc.nextLine();
                 if(choice==1){
                     l.info("Enter the value : ");
                     rollNo=sc.nextInt();
                     String s2=hash.get(rollNo);
                     l.log(Level.INFO,()->s2);
                 }

                 else {
                     l.log(Level.INFO,()-> String.valueOf(hash));

                 }
             }

         }while (choice <=4);

     }
     protected void schoolGpaTest(){
         List<SchoolGpaTest> l1=new ArrayList<>();
         SchoolGpaTest s3=new SchoolGpaTest();
         SchoolGpaTest s1=new SchoolGpaTest();
         SchoolGpaTest s2=new SchoolGpaTest();
         Logger log=Logger.getLogger("StudentTest");


         s3.setDetails("vino",19,9.5);
         l1.add(s3);
         s1.setDetails("sri",20,10);
         l1.add(s1);
         s2.setDetails("arun",21,8.5);
         l1.add(s2);
         for (SchoolGpaTest li:l1){
             log.log(Level.INFO,()->li.getName()+"\t"+li.getAge()+"\t"+li.getGpa());
         }
         Comparator<SchoolGpaTest> cam=new Comparator<>() {
             public int compare(SchoolGpaTest s3,SchoolGpaTest s1){
                 if(s3.getGpa()<s1.getGpa()){
                     return 1;
                 }
                 else
                     return -1;

             }
         };
         Collections.sort(l1,cam);
         log.info("After Soring the GPA score Highest to Lowest ");
         for (SchoolGpaTest li:l1){
             log.log(Level.INFO,()->"Name :"+li.getName()+"\tGpa :"+li.getGpa());
         }
     }
     protected void frequency(){
         Map<String,Integer> words=new HashMap<>();
         try {
             CountWord.countWords("\\C:\\Users\\Tringapps-User20\\OneDrive\\Documents\\file.txt", words);
         }
         catch (FileNotFoundException e){
             l.info("File Not Found !");
         }
         l.log(Level.INFO,()->" "+ words);
         List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
         Collections.sort(list , new Comparator <Map.Entry<String, Integer>>(){
             public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                 return e2.getValue()-e1.getValue();
             }
         });
         l.info("Key          Values");
         for (Map.Entry<String, Integer> j: list) {
             l.log(Level.INFO,()->j.getKey()+"     -     "+j.getValue());
         }
     }

     protected void contact(){
         LinkedList list=new LinkedList();
         int ch;
         String s2="Enter the Email :";
         String s3="Enter the Number :";
         do{
             l.info("1.InsertFirst \n 2.InsertLast\n3.InsertAtPos\n4.RemoveFirst\n5.RemoveLast\n6.RemoveAtPos\n7.Display\n8.search by Name");
             l.info(enterChoice
             );
             ch= sc.nextInt();
             switch (ch){
                 case 1->{
                     l.info(enterName);
                     String nameInsertFirst= sc.next();
                     l.info(s2);
                     String emailInsertFirst=sc.next();
                     l.info(s3);
                     String numberInsertFirst=sc.next();
                     list.insertFirst(nameInsertFirst,emailInsertFirst,numberInsertFirst);
                 }
                 case 2->{
                     l.info(enterName);
                     String nameInsertLast= sc.next();
                     l.info(s2);
                     String emailInsertLast=sc.next();
                     l.info(s3);
                     String numberInsertLast=sc.next();
                     list.insertLast(nameInsertLast,emailInsertLast,numberInsertLast);
                 }
                 case 3->{
                     l.info(enterName);
                     String nameInsertAt=sc.next();
                     l.info(s2);
                     String emailInsertAt= sc.next();
                     l.info(s3);
                     String numberInsertAt=sc.next();
                     l.info("Enter the Position :");
                     int index=sc.nextInt();
                     list.insertAt(nameInsertAt,emailInsertAt,numberInsertAt,index);
                 }
                 case 4-> list.removeFirst();
                 case 5-> list.removeLast();
                 case 6-> {
                     l.info("Enter the Position :");
                     int index = sc.nextInt();
                     list.removeAt(index);
                 }
                 case 7->
                         list.display();
                 case 8->
                 {
                     l.info(enterName);
                     name=sc.next();
                     int res=list.search(name);
                     if(res>0)
                     {
                         l.log(Level.INFO,()->"Element is At Position :"+res);

                     }
                     else
                     {
                         l.info("The name is not found");
                     }

                 }

                 default ->
                         l.info(wrongChoice);

             }
         }while(ch!=9);
     }

 }
