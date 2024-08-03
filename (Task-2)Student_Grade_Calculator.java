import java.util.Scanner;

class Student_Grade_Calculator
{
    public static void Display_Menu()
    {
        System.out.println("                ---> Student Grade Calculator <---");
        System.out.println("                     ------------------------     ");
        System.out.println("              Select the Subjects as per your choice  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|  Subject List 1 :             |      Subject List 2 :         |");
        System.out.println("|-------------------------------|-------------------------------|");
        System.out.println("|  -> English                   |      -> English               |");
        System.out.println("|  -> Physics                   |      -> Economics             |");
        System.out.println("|  -> Chemistry                 |      -> Accounts              |");
        System.out.println("|  -> Mathematics               |      -> Management            |");
        System.out.println("|  -> Computer Science          |      -> Computer Science      |");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println("~ Enter '1' For Subject List 1 \n~ Enter '2' for Subject List 2 \n~ Enter '3' for Custom Subjects");
    }
    public static int sum(int target,int marks[])
    {
        int total=0;
        int i;
        for(i=0;i<target;i++)
        {
            total=total+marks[i];
        }
        return total;
    }
    public static double percentage(int total,int no_of_subjects)
    {
        double per=0.0d;
        per = total/no_of_subjects;
        return per;
    }
    public static String Grade(double per)
    {
        String grade=" ";
        if(per>=90)
        {
            grade="A+";
        }
        else if(per>=80 && per<90)
        {
            grade="A";
        }
        else if(per>=75 && per<80)
        {
            grade="B+";
        }
        else if(per>=70 && per<75)
        {
            grade="B";
        }
        else if(per>=60 && per<70)
        {
            grade="C";
        }
        else if(per>=50 && per<60)
        {
            grade="D";
        }
        else if(per>=40 && per<50)
        {
            grade="E";
        }
        else
        {
            grade="F";
        }
        return grade;
    }
    
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String ch2="N",na;
        int roll;
        System.out.print("Enter the Name of the Student : ");
        na = sc.nextLine();
        System.out.print("Enter the Roll Number : ");
        roll = sc.nextInt();
        do{
        int ch,i,n,target=0,total=0;
        String grade=" ";
        double per=0.0d;
        int marks[]=new int[50];
        String pcm[]=new String[5];
        String com[]=new String[5];
        String cus[]=new String[50];
        String arr[]=new String[50];
        System.out.println();
        Display_Menu();
        System.out.println();
        System.out.print("~ Enter Your choice : ");
        ch = sc.nextInt();
        System.out.println("-----------------------------------------------------");
        switch (ch) {
            case 1:  
                    pcm[0]="English";
                    pcm[1]="Physics";
                    pcm[2]="Chemistry";
                    pcm[3]="Mathematics";
                    pcm[4]="Computer Applications/Computer Science";
                    target=pcm.length;
                    for(i=0;i<target;i++)
                    {
                        System.out.print("Enter the marks in "+pcm[i]+" : ");
                        marks[i]=sc.nextInt();
                        arr[i]=pcm[i];
                    }
                    total = sum(target, marks);
                    per = percentage(total, target);
                    grade = Grade(per);
                break;
            case 2:
                    com[0]="English";
                    com[1]="Economics";
                    com[2]="Accounts";
                    com[3]="Management";
                    com[4]="Computer Applications/Computer Science";
                    target=com.length;
                    for(i=0;i<target;i++)
                    {
                        System.out.print("Enter the marks in "+com[i]+" : ");
                        marks[i]=sc.nextInt();
                        arr[i]=com[i];
                    }
                    total = sum(target, marks);
                    per = percentage(total, target);
                    grade = Grade(per);
                break;    
            case 3:
                    System.out.println("Enter the number of subjects :");
                    n=sc.nextInt();
                    int c=1;
                    target=n;
                    for(i=0;i<target;i++)
                    {
                        System.out.print("Enter the Name of Subject "+c+" : ");
                        cus[i]=sc.next();
                        arr[i]=cus[i];
                        c++;
                    }
                    for(i=0;i<target;i++)
                    {
                        System.out.print("Enter the marks in "+cus[i]+" : ");
                        marks[i]=sc.nextInt();
                    }
                    total = sum(target, marks);
                    per = percentage(total, target);
                    grade = Grade(per);
                break;
            default:
                 System.out.println("Invalid Choice!! Enter the choice from the menu!!");
        }
        
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.print("Name of Student : "+na+" \t\t");
        System.out.println("Roll no : "+roll);
        System.out.println("----------------------------------------------------");
        for(i=0;i<target;i++)
        {
        System.out.println("-> "+arr[i]+ " : "+ marks[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total Marks : "+total);
        System.out.println("Percenatge : "+per+"%");
        System.out.println("Grade : "+ grade);
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Do you want to try a different subject list? Enter 'Y' for Yes and 'N' for No");
        System.out.print("Your Choice : ");
        ch2=sc.next();
        if(ch2.equalsIgnoreCase("N"))
        {
            System.out.println("-----------------------------------------------------------------------");
        }
    }
    while(ch2.equalsIgnoreCase("Y"));
    sc.close();

}
} 
