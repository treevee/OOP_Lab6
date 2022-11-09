package analyse;

public class StrLowcase implements StrAnalyser{
    @Override
    public int analyse(String str) {
        int count=0;
        for (int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
