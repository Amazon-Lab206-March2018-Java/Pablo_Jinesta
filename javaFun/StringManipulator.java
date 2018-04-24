public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String str = str1.trim().concat(str2.trim());
        return str;
    }

    public Integer getIndexOrNull(String str, char letter){
        int index = str.indexOf(letter);
        if (index > -1) {
            return index;
        }
        return null;
    }

    public Integer getIndexOrNull(String str, String substr){
        int index = str.indexOf(substr);
        if (index > -1) {
            return index;
        }
        return null;
    }

    public String concatSubstring(String str1, int index1, int index2, String str2){
        String subStr = str1.substring (index1, index2);
        return subStr + str2;
    }
}