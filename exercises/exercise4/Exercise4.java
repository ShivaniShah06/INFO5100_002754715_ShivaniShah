package exercises.exercise4;

import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {

        // Pattern1 example - Match a sentence starting with a `Hi` and `,`
        String comment1 = "====================EXAMPLE 1====================\nMATCH A SENTENCE STARTING WITH A `Hi` & `,`";
        String sentences[] = { "Hi, I am Shivani Shah and my NUID is 002743715.",
                "Hi! I am Shivani Shah, and my NUID no. is - 002754715." };
        String pattern1 = "^(Hi,)([a-zA-Z ]+)(\\d{9}\\.)";
        MatchPattern(sentences, pattern1, comment1);

        // Pattern2 example - northeastern email id
        String comment2 = "====================EXAMPLE 2====================\nMATCH NORTHEASTERN EMAIL ID WHICH MATCHES WITH northeastern.edu";
        String emails[] = { "shah.shivani@northeastern.edu", "shivanishahwork2@gmail.com" };
        String pattern2 = "([a-z]+)\\.([a-z0-9]+)\\@(northeastern.edu)$";
        MatchPattern(emails, pattern2, comment2);

        // Pattern3 example - Match indian mobile number with hyphens `-` and country
        // code
        String comment3 = "====================EXAMPLE 3====================\nMATCH INDIAN MOBILE NUMBER WITH HYPHENS `-` AND COUNTRY CODE";
        String mobileNumbers[] = { "+91-987-902-8833", "+1-510-244-0563" };
        String pattern3 = "(\\+91)\\-(\\d{3})\\-(\\d{3})\\-(\\d{4})";
        MatchPattern(mobileNumbers, pattern3, comment3);

        // Pattern4 example: Match a password with following scenario
        // 1. 6 to 12 characters in length
        // 2. Must have at least one uppercase letter
        // 3. Must have at least one lower case letter
        // 4. Must have at least one digit
        // 5. Should contain other characters
        String comment4 = "====================EXAMPLE 4====================\nMATCH  PASSWORD WITH FOLLOWING SCENARIO\n1. 6 to 15 characters in length \n2. Must have at least one uppercase letter\n3. Must have at least one lower case letter\n4. Must have at least one digit\n5. Should contain other characters\n";
        String Passwords[] = { "LikeAHusky@2022", "likeahusky@2022" };
        String pattern4 = "^(?=.*[A-Z])(?=.*\\d)(?=.*[a-z]).{6,15}";
        MatchPattern(Passwords, pattern4, comment4);

        // Pattern5 example: Match URL following below scenario
        // 1. Must start with http or https or ftp followed by ://
        // 2. Must match a valid domain name
        // 3. Could contain a port specification (http://www.sitepoint.com:80)
        // 4. Could contain digit, letter, dots, hyphens, forward slashes, multiple
        // times
        String comment5 = "====================EXAMPLE 5====================\nMATCH URL FOLLOWING BELOW SCENARIO\n1. Must start with http or https or ftp followed by ://\n2. Must match a valid domain name\n3. Could contain a port specification (http://www.sitepoint.com:80)\n4. Could contain digit, letter, dots, hyphens, forward slashes, multiple times\n";
        String URLs[] = { "https://northeastern.edu:80", "www.northeastern.edu" };
        String pattern5 = "^(http|https|ftp):[\\/]{2}([a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,4})(:[0-9]+)?\\/?([a-zA-Z0-9\\-\\._\\?\\,\\'\\/\\\\+&amp;%\\$#\\=~]*)";
        MatchPattern(URLs, pattern5, comment5);

        // Checking match for sentences
        // Can also be performed as below:
        // Matcher M1 = P1.matcher(sentence1);
        // if (M1.find()){
        // System.out.println("----------POSITIVE match case for sentence1----------");
        // System.out.println("Found match in sentence1 and the entire match is: "
        // +M1.group(0));
        // System.out.println("The regex used for this match is: " +P1);
        // System.out.println("group1 match is: " +M1.group(1));
        // System.out.println("group2 match is: " +M1.group(2));
        // System.out.println("group3 match is: " +M1.group(3));
        // }
        // else{
        // System.out.println("\n----------Negative match case for
        // sentence1----------");
        // System.out.println("No match found for sentence1");
        // }
    }

    // function or method for matching a pattern using regex
    public static void MatchPattern(String[] Inputs, String pattern, String comment) {
        Pattern P = Pattern.compile(pattern);
        System.out.println(comment);

        for (String Input : Inputs) {
            boolean found = P.matcher(Input).lookingAt();

            System.out.println("\n'" + P + "'" +
                    (found ? " matches '" : " doesn't match '") + Input + "'"
                    + (found ? " - POSITIVE MATCH!" : " - NEGATIVE MATCH!\n\n"));
        }
    }
}