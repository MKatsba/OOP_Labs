public class TestAuthor {
    public static void main(String[] args){
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        System.out.print(author1);

        author1.setEmail("ahTeck@newmail.com");
        System.out.println(author1);

        Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
        System.out.println(author2);
    }
}
