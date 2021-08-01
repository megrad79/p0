// Udacity - find the longest name in a string array
// Create findLongestName.java (max string length example)

public String findLongestName(String [] names){
    int size = names.length;
    String longestName = names[0];
    
    for(int i=1; i < size; i++){
        if(names[i].length() > longestName.length()){
            longestName = names[i];
        }
    }
    return longestName;
}
