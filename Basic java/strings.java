public class strings {
    public static void main(String[] args) {
        String name = "Arjun Sharma";
        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf("a"); // tell the first index number of the letter
        int lastindex = name.lastIndexOf("a");
        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.replace('A','N');  //replace a character by a character
        // name = name.replace("Arjun","Nandini");  //replace a word by a word
        // name.isEmpty();
        String email = "arjunbhushal2017@gmail.com";
        String username = email.substring(0,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') +1);

        

        System.err.println(domain);
        

      }
}
