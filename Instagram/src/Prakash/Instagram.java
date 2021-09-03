package Prakash;

public class Instagram {

    public static void main(String[] args)
    {
        Account Prakash = new Account();
        User u1 = new User("akshay");
        User u2 = new User("surya");
        User u3 = new User("mahesh");
        User u4 = new User("venkat");
        User u5 = new User("prasad");

        Prakash.follow(u1);
        Prakash.follow(u2);
        Prakash.follow(u3);
        Prakash.follow(u4);
        Prakash.follow(u5);

        Prakash.unfollow(u3);

        u1.followAccount(Prakash);
        u2.followAccount(Prakash);
        u3.followAccount(Prakash);
        u4.followAccount(Prakash);
        u5.followAccount(Prakash);

        Prakash.upload("How to learn Music??");
    }
}
