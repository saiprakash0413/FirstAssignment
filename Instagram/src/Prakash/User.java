package Prakash;

public class User {
    private String name;
    private Account account = new Account();

    public User(String name) {
        super();
        this.name = name;
    }

    public void update()
    {
        System.out.println("Hey "+ name + ", Video Uploaded");
    }
    public void followAccount(Account ac)
    {
        account = ac;
    }
}
