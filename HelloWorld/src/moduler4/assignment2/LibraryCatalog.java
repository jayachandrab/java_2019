package moduler4.assignment2;

import java.util.Scanner;

public class LibraryCatalog {

    public static void main(String args[]){

        int someint=20;
        float some=someint;
        double d=some;
        System.out.println(some);
        System.out.println(d);

        Scanner in=new Scanner(System.in);
        CardCatalog card=new CardCatalog();

        while(true){
            System.out.println("Enter your choice 1 for add card\n 2 get card by title \n 3 tot get books by author\n 4 for exit");
            int choice=in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter book title");
                    String title=in.next();
                    System.out.println("enter book author");
                    String author=in.next();
                    System.out.println("enter book subject");
                    String subject=in.next();
                    Card book=new Card(title,author,subject);

                    card.addACard(book);
                    break;
                case 2:
                    System.out.println("Enter title");

                    title=in.next();
                    System.out.println(card.getATitle(title));
                    break;
                case 3:
                    System.out.println("enter author name");
                    author=in.next();
                    String bk[]=card.getAnAuthor(author);
                    for(int i=0;i<bk.length;i++){
                        if(bk[i]!=null){
                            System.out.println(bk[i]);
                        }
                    }
                    break;

                case 4:
                    System.exit(1);
                default:
                    System.out.println("Please choice right option");
            }
        }
    }
}
