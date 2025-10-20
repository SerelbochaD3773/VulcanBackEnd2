package feedback.models;

public class Feedback {
    private String email;
    private String phone;
    private String comment;

    public Feedback(){}
    
    public Feedback(String email, String phone, String comment){
        this.email = email;
        this.phone = phone;
        this.comment = comment;
    }

    // Setters
    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    // Getters
    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getComment(){
        return this.comment;
    }

}
