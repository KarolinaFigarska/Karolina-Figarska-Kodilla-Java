package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1,"Borys",'M',1999,12,15,7));
        theForumUsersList.add(new ForumUser(2,"Karina",'F',1989,1,2,6));
        theForumUsersList.add(new ForumUser(3,"Aleksander",'M',1987,6,29,3));
        theForumUsersList.add(new ForumUser(4,"Antoni",'M',2012,5,18,5));
        theForumUsersList.add(new ForumUser(5,"Zuzanna",'F',2009,9,3,8));
        theForumUsersList.add(new ForumUser(6,"Marcelina",'F',1984,7,18,2));
        theForumUsersList.add(new ForumUser(7,"Dariusz",'M',1991,10,9,0));
        theForumUsersList.add(new ForumUser(8,"Julian",'M',2014,2,24,6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
