public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String GetName(){
        return name;
    }

    public String GetEmail(){
        return email;
    }

    public void SetEmail(){
        this.email = email;
    }

    public char GetGender(){
        return gender;
    }

    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
