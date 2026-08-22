/*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, 
    List<String> queries) {
    // Write your code here
    for (String i:queries){
        int c=0;
        for (String j:stringList){
            if (i.equals(j)){
                c++;
            }
        }
        count.add(c);
    List<Integer> count= new ArrayList<>();
    }
    return count;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna