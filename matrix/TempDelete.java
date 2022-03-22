package matrix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TempDelete {
public static void main(String arg[]){
	 String FILE3 = "\n" +
	            "\r\n\n" +
	            "Did you take cs 6300 last semester? I want to\n" +
	            "";
	w(FILE3,true,1);


}

private static void w(String paramString, boolean paramBoolean, int paramInt)
{
  int i = 0;
  int j = 0;
  int k = 0;
  Matcher localMatcher = Pattern.compile("(\\r\\n)|(\\n)|(\\r)").matcher(paramString);
  if ((paramString.isEmpty()) || (paramString.length() <= 1)) {
    return ;
  }
  String str2,str1;
  while (localMatcher.find())
  {
    j = localMatcher.start();
    if (j != 0)
    {
      str1 = paramString.substring(k, j);
      if (str1.isEmpty())
      {
        i = 10;
        return ;
      }
      int m = paramInt % str1.length();
      if (paramBoolean) {
        str2 = str1.substring(str1.length() - m) + str1.substring(0, str1.length() - m);
      } else {
        str2 = str1.substring(m) + str1.substring(0, m);
      }
      paramString = paramString.substring(0, k) + str2 + paramString.substring(j);
      k = localMatcher.end();
    }
  }
  j = paramString.length();
  if ((j == 0) || (j == k)) {
	  return ;
  }
  String str11 = paramString.substring(k, j);
  int m = paramInt % str11.length();
  if (paramBoolean) {
    str2 = str11.substring(str11.length() - m) + str11.substring(0, str11.length() - m);
  } else {
    str2 = str11.substring(m) + str11.substring(0, m);
  }
  paramString = paramString.substring(0, k) + str2 + paramString.substring(j);
  return ;
}


}



