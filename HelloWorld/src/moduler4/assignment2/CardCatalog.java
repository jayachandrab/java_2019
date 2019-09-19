package moduler4.assignment2;

public class CardCatalog {
    String title[];
    String author[];
    String subject[];
   static int count=0;
   Card cards[];
    CardCatalog(){
        this.title=new String[10];
        this.author=new String[10];
        this.subject=new String[10];
        this.cards=new Card[10];
    }
    public void  addACard(Card card){
        title[count]=card.title;
        author[count]=card.author;
        subject[count]= card.subject;
        cards[count]=card;
        count++;
    }

    public Card getATitle(String title){
        for(int i=0;i<cards.length;i++){
            if(cards[i].getTitle().equals(title)){
                return cards[i];
            }
        }
        return null;
    }
    public void getAnAuthor(){

    }

    public void getSubject(){

    }

    public void removeATitle(){

    }

    public void printTheCatalog(){

    }


}
