package llds.stackOverFlow.entities;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public static int tracker = 0;

    private int id;
    private String question;
    private List<String> tags;
    private int vote;
    private SOFUser author;
    private List<Answer> answers = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    Question(String question, List<String> tags, SOFUser author){
        this.question = question;
        this.tags = tags;
        this.author =author;
        tracker++;
        this.id = tracker;
    }

    public List<String> getTags() {
        return tags;
    }

    public int getVote() {
        return vote;
    }

    public void upVote() {
        this.vote++;
    }

    public void downVote(){
        this.vote--;
    }

    public SOFUser getAuthor() {
        return author;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public int getId() {
        return id;
    }
}
