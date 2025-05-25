package llds.stackOverFlow.entities;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    public static int tracker = 0;

    private int id;
    private String ans;
    private List<Comment> comments = new ArrayList<>();
    private int vote = 0;
    private SOFUser author;

    public Answer(String ans, SOFUser author) {
        this.ans = ans;
        this.author = author;
        tracker++;
        this.id = tracker;
    }

    public int getId() {
        return id;
    }

    public int getVote() {
        return vote;
    }

    public void upVote(){
        this.vote++;
    }

    public void downVote(){
        this.vote--;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
}
