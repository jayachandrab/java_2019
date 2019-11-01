package socialNetwork;
/*
Author: Jayachandra
 */
import java.util.*;

public class User {
    String userName;
    User connections[];
    int count;

    public User(String name, Object size[])
    {
        // TODO Auto-generated constructor stub
        //System.out.println("User construct");
        this.userName=name;

        if(size!=null) {
            this.connections=(User[]) size;
        }

    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User[] getConnections() {
        return connections;
    }

    public void setConnections(User[] connections) {
        this.connections = connections;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addConnection(User a,User u)
    {
        //System.out.println("==="+u);
        if(a.connections!=null)
        {
            User temp[]=a.connections;
            int tsize=temp.length;
            a.connections=new User[tsize+1];
            int i=0;
            for(i=0;i<tsize;i++) {
                a.connections[i]=temp[i];
            }
            a.connections[i]=u;
            count++;
        }
        else {
            a.connections=new User[1];
            a.connections[0]=u;
        }

    }
    @Override
    public String toString()
    {
        String s="[";
        if(connections!=null) {
            for(int i=0;i<connections.length;i++)
            {
                if(connections[i]!=null) {
                    if(connections[i].getUserName()!=null) {
                        s=s+connections[i].getUserName()+", ";
                    }
                }


            }
            s=s+"]";
        }else{
            //System.out.println("return : "+ getUserName());
            //s=s+getUserName()+" : ";
            return getUserName()+" : ";//Randy : ;
            //return null;
        }

        s=s.substring(0,s.length()-3);
        s=s+"]";

        return  userName +" : "+ s;
    }

}