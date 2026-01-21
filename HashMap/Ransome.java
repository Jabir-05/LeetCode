public class Ransome {
    public static boolean Ransome(String ransomeNote, String Megaznie){
        int [] count = new int[26];
        for(char ch:Megaznie.toCharArray())
            count[ch- 'a']++;
     for(char ch:ransomeNote.toCharArray()){
        count [ch -'a']--;
    if(count [ch -'a']< 0)
        return false;
    }
    return true;
}
    public static void main(String[] args) {
        String ransomeNote= "aa";
        String Megaznie =  "aab";
        System.out.println(Ransome(ransomeNote, Megaznie));
    }
}
