public class Assignment567 {

    public static void main(String[] args) {

        // 5. Java program to check whether an Alphabet is vowel or consonant.

        // char ch = 'z';
        char ch = 'A';

        switch (ch) {
            case 'a' & 'A': 
            case 'e' & 'E':
            case 'i' & 'I':
            case 'o' & 'O':
            case 'u' & 'U':

                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch + " is consonant");
        }

        // 6. Java program to find the largest among three numbers

        // declare a variable
        double n1 = 10.5;
        int n2 = 7;
        int n3 = 4;

        // If n1 greater then equal to n2 logical And (&&) n1 greater then equal to n3.
        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " Is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

        // 7. Java program to check whether a Character is Alphabet or Not

        // declare a variable
        // char r = 'a';
        char r = '*';

        // checks if r is an alphabet
        if (Character.isAlphabetic(r)) {
            System.out.println(r + " is an alphabet.");
        } else {
            System.out.println(r + " is not an alphabet.");
        }

    }

        }
