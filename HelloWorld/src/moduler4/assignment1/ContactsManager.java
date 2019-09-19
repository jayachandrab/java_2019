package moduler4.assignment1;

public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName)
    {
        for(int i=0; i<myFriends.length;i++)
        {
            if(myFriends[i]!=null){
                if(myFriends[i].name.equals(searchName))
                {

                    return myFriends[i];
                }
            }

        }
        return null;
    }


    /**
     * This method search for the contact based on the email of your friend
     * and gives the first occurance of the contact in your friends list.
     * @param searchName, the email of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        //  Your code goes here....
        for(int i=0; i<myFriends.length;i++)
        {
            if(myFriends[i]!=null){
                if(myFriends[i].email.equals(email))
                {

                    return myFriends[i];
                }
            }

        }
        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     *
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        //  Your code goes here....
        boolean flag=false;
        for(int i=0; i<myFriends.length;i++)
        {
            if(myFriends[i]!=null){
                if(myFriends[i].name.equals(searchName))
                {

                    myFriends[i]=null;
                    flag=true;
                    break;
                }
            }

        }

        return flag;
    }


}
