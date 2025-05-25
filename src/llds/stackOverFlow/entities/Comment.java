package llds.stackOverFlow.entities;

public class Comment {
    private String comment;
    private SOFUser auther;

    public Comment(String comment, SOFUser auther) {
        this.comment = comment;
        this.auther = auther;
    }
}
