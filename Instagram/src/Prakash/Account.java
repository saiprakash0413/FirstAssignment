package Prakash;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<User> resus = new ArrayList<>();
    private String title;

    public void follow(User resu)
    {
        resus.add(resu);
    }
    public void unfollow(User resu)
    {
        resus.remove(resu);
    }
    public void notifyfollowers()
    {
        for(User resu : resus)
        {
            resu.update();
        }
    }
    public void upload(String title)
    {
        this.title = title;
        notifyfollowers();
    }
}
