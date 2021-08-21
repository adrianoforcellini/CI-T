import java.lang.StringBuilder;

public class reverseWords {

  public static String reverseWords(final String original) {
    String[] array = original.split(" ");
    if (array.length == 0) return original; // case  expected:<[   ]> but was:<[]>
    int i = 0;
    for (String item : array) {
      array[i] = new StringBuilder(item).reverse().toString();
      i++;
    }

    return String.join(" ", array);
  }
}
