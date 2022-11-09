package analyse;

public class StrUpcase implements StrAnalyser{
    @Override
    public int analyse(String str) {
        int count=0;
        for (int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
