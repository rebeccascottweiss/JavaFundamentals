public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        return str1.trim().concat(str2.trim()); 
    }; 
    public Integer getIndexOrNull(String str, char elem){
        if(str.indexOf(elem) == -1){
            return null; 
        } else {
            return str.indexOf(elem); 
        }
    };
    public Integer getIndexOrNull(String str1, String str2){
        if(str1.indexOf(str2) == -1){
            return null; 
        } else {
            return str1.indexOf(str2);
        }
    };
    public String concatSubstring(String str1, int num1, int num2, String str2){
        String sub = str1.substring(num1, num2); 
        return sub.concat(str2); 
    };
}