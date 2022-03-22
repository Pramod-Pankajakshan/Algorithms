package edu.gatech.seclass.encode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TempDelete2
{
  public static void main(String[] paramArrayOfString)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    String str1 = "";
    boolean bool = false;
    int i1 = 0;
    int i2 = 0;
    boolean[] arrayOfBoolean = new boolean[10];
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 1))
    {
      osuper();
      return;
    }
    String str2 = paramArrayOfString[(paramArrayOfString.length - 1)];
    if ((str2 == null) || (str2.isEmpty()))
    {
      osuper();
      return;
    }
    Path localPath = Paths.get(str2, new String[0]);
    String str3;
    String str4;
    try
    {
      str4 = str3 = new String(Files.readAllBytes(localPath), StandardCharsets.UTF_8);
    }
    catch (IOException localIOException1)
    {
      System.err.println("File Not Found");
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      System.err.println("Out of Memory");
      return;
    }
    Object localObject1;
    for (int i3 = 0; i3 < paramArrayOfString.length - 1; i3++)
    {
      localObject1 = paramArrayOfString[i3];
      int i5 = -1;
      switch (((String)localObject1).hashCode())
      {
      case 1505: 
        if (((String)localObject1).equals("-n")) {
          i5 = 0;
        }
        break;
      case 1509: 
        if (((String)localObject1).equals("-r")) {
          i5 = 1;
        }
        break;
      case 1503: 
        if (((String)localObject1).equals("-l")) {
          i5 = 2;
        }
        break;
      case 1495: 
        if (((String)localObject1).equals("-d")) {
          i5 = 3;
        }
        break;
      case 1494: 
        if (((String)localObject1).equals("-c")) {
          i5 = 4;
        }
        break;
      }
      switch (i5)
      {
      case 0: 
        i = 1;
        if (i3 + 1 < paramArrayOfString.length - 1) {
          try
          {
            int i6 = Integer.valueOf(paramArrayOfString[(i3 + 1)]).intValue();
            i3++;
            j = i6;
          }
          catch (NumberFormatException localNumberFormatException1) {}
        } else if (i3 + 1 == paramArrayOfString.length - 1) {
          throw new b(paramArrayOfString, str4, 7, new NumberFormatException().toString());
        }
        break;
      case 1: 
        if (bool) {
          arrayOfBoolean[2] = true;
        }
        bool = !bool;
        if ((i3 + 1 < paramArrayOfString.length - 1) && (i1 == 0))
        {
          try
          {
            int i7 = Integer.valueOf(paramArrayOfString[(i3 + 1)]).intValue();
            i3++;
            i2 = i7;
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            osuper();
            return;
          }
        }
        else
        {
          osuper();
          return;
        }
        break;
      case 2: 
        if (i1 != 0) {
          arrayOfBoolean[2] = true;
        }
        i1 = i1 == 0 ? 1 : 0;
        if ((i3 + 1 < paramArrayOfString.length - 1) && (!bool))
        {
          try
          {
            int i8 = Integer.valueOf(paramArrayOfString[(i3 + 1)]).intValue();
            i3++;
            i2 = i8;
          }
          catch (NumberFormatException localNumberFormatException3)
          {
            osuper();
            return;
          }
        }
        else
        {
          osuper();
          return;
        }
        break;
      case 3: 
        k = 1;
        if (i3 + 1 < paramArrayOfString.length - 1)
        {
          try
          {
            int i9 = Integer.valueOf(paramArrayOfString[(i3 + 1)]).intValue();
            i3++;
            m = i9;
          }
          catch (NumberFormatException localNumberFormatException4)
          {
            throw new _b(paramArrayOfString, str4, 5, localNumberFormatException4.toString());
          }
        }
        else
        {
          osuper();
          return;
        }
        break;
      case 4: 
        n = 1;
        if (i3 + 1 >= paramArrayOfString.length - 1)
        {
          osuper();
          return;
        }
        i3++;
        str1 = paramArrayOfString[i3];
        break;
      default: 
        try
        {
          int i10 = Integer.valueOf(paramArrayOfString[i3]).intValue();
          i3++;
          i = 1;
          m = i10;
          arrayOfBoolean[5] = true;
        }
        catch (NumberFormatException localNumberFormatException5)
        {
          osuper();
          return;
        }
      }
    }
    if ((k == 0) && (n == 0) && (!bool) && (i1 == 0) && (i == 0))
    {
      i = 1;
      j = 13;
    }
    if (k != 0)
    {
      localObject1 = _b4(str3, Integer.valueOf(m));
      str3 = ((_b)localObject1).new;
      if ((((_b)localObject1).osuper == 1) || (((_b)localObject1).osuper == 4)) {
        throw new b(paramArrayOfString, str4, ((_b)localObject1).osuper, new IndexOutOfBoundsException().toString());
      }
      if (((_b)localObject1).osuper > 0) {
        arrayOfBoolean[(localObject1.osuper - 1)] = true;
      }
    }
    if ((bool) || (i1 != 0))
    {
      if (i2 <= 0) {
        throw new b(paramArrayOfString, str4, 1, new IndexOutOfBoundsException().toString());
      }
      localObject1 = osuper(str3, bool, i2);
      str3 = ((_b)localObject1).new;
      if (((_b)localObject1).osuper == 10) {
        throw new b(paramArrayOfString, str4, 10, new ArithmeticException().toString());
      }
      if (((_b)localObject1).osuper > 0) {
        arrayOfBoolean[(localObject1.osuper - 1)] = true;
      }
    }
    if (n != 0)
    {
      localObject1 = osuper(str3, str1);
      str3 = ((_b)localObject1).new;
      if (((_b)localObject1).osuper > 0) {
        arrayOfBoolean[(localObject1.osuper - 1)] = true;
      }
      if (((_b)localObject1).osuper == 2) {
        throw new b(paramArrayOfString, str4, 2, new ArrayIndexOutOfBoundsException().toString());
      }
    }
    if (i != 0)
    {
      localObject1 = osuper(str3, j);
      str3 = ((_b)localObject1).new;
      if (((_b)localObject1).osuper > 0) {
        arrayOfBoolean[(localObject1.osuper - 1)] = true;
      }
    }
    try
    {
      localObject1 = new OutputStreamWriter(new FileOutputStream(localPath.toFile()), StandardCharsets.UTF_8);
      Object localObject2 = null;
      try
      {
        ((OutputStreamWriter)localObject1).write(str3);
      }
      catch (Throwable localThrowable2)
      {
        localObject2 = localThrowable2;
        throw localThrowable2;
      }
      finally
      {
        if (localObject1 != null) {
          if (localObject2 != null) {
            try
            {
              ((OutputStreamWriter)localObject1).close();
            }
            catch (Throwable localThrowable3)
            {
              ((Throwable)localObject2).addSuppressed(localThrowable3);
            }
          } else {
            ((OutputStreamWriter)localObject1).close();
          }
        }
      }
    }
    catch (IOException localIOException2)
    {
      System.err.println("File Not Writable");
      return;
    }
    for (int i4 = 0; i4 < 10; i4++) {
      if (arrayOfBoolean[i4] != 0) {
        throw new b(paramArrayOfString, str4, i4 + 1, str3);
      }
    }
  }
  
  private static _b _b1(String paramString, boolean paramBoolean, int paramInt)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    Matcher localMatcher = Pattern.compile("(\\r\\n)|(\\n)|(\\r)").matcher(paramString);
    if ((paramString.isEmpty()) || (paramString.length() <= 1)) {
      return new _b(paramString, i);
    }
    String str2;
    while (localMatcher.find())
    {
      j = localMatcher.start();
      if (j != 0)
      {
       String str1 = paramString.substring(k, j);
        if (str1.isEmpty())
        {
          i = 10;
          return new _b(paramString, i);
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
      return new _b(paramString, i);
    }
    String str1 = paramString.substring(k, j);
    int m = paramInt % str1.length();
    if (paramBoolean) {
      str2 = str1.substring(str1.length() - m) + str1.substring(0, str1.length() - m);
    } else {
      str2 = str1.substring(m) + str1.substring(0, m);
    }
    paramString = paramString.substring(0, k) + str2 + paramString.substring(j);
    return new _b(paramString, i);
  }
  
  private static _b _b2(String paramString1, String paramString2)
  {
    int i = 0;
    char[] arrayOfChar = paramString1.toCharArray();
    if (paramString2.length() == 0)
    {
      i = 2;
      return new _b(String.valueOf(arrayOfChar), i);
    }
    for (int j = 0; j < paramString2.length(); j++) {
      if ((paramString2.indexOf(paramString2.charAt(j)) == j) && (Character.isAlphabetic(paramString2.charAt(j)))) {
        if ((Character.isUpperCase(paramString2.charAt(j))) && (paramString2.indexOf(Character.toLowerCase(paramString2.charAt(j))) >= 0))
        {
          i = 9;
        }
        else if ((Character.isLowerCase(paramString2.charAt(j))) && (paramString2.indexOf(Character.toUpperCase(paramString2.charAt(j))) >= 0))
        {
          i = 9;
        }
        else
        {
          int k = paramString1.indexOf(Character.toLowerCase(paramString2.charAt(j)));
          int m = paramString1.indexOf(Character.toUpperCase(paramString2.charAt(j)));
          while (k >= 0)
          {
            arrayOfChar[k] = Character.toUpperCase(paramString2.charAt(j));
            k = paramString1.indexOf(Character.toLowerCase(paramString2.charAt(j)), k + 1);
          }
          while (m >= 0)
          {
            arrayOfChar[m] = Character.toLowerCase(paramString2.charAt(j));
            m = paramString1.indexOf(Character.toUpperCase(paramString2.charAt(j)), m + 1);
          }
        }
      }
    }
    return new _b(String.valueOf(arrayOfChar), i);
  }
  
  private static _b _b3(String paramString, int paramInt)
  {
    int i = 0;
    if ((paramInt >= 26) || (paramInt < 0)) {
      i = 8;
    }
    String str = paramString;
    for (char c : paramString.toCharArray()) {
      if ((('a' <= c) && (c <= 'z')) || (('A' <= c) && (c <= 'Z')))
      {
        int m;
        if (Character.isLowerCase(c))
        {
          m = c - 'a' + paramInt;
          if (m >= 26) {
            m -= 26;
          }
          if (m + 1 < 10) {
            str = str.replace(String.valueOf(c), "0" + Integer.toString(m + 1));
          } else {
            str = str.replace(String.valueOf(c), Integer.toString(m + 1));
          }
        }
        else
        {
          m = c - 'A' + paramInt;
          if (m >= 26) {
            m -= 26;
          }
          str = str.replace(String.valueOf(c), Integer.toString(m + 27));
        }
      }
    }
    return new _b(str, i);
  }
  
  private static _b _b4(String paramString, Integer paramInteger)
  {
    int i = 0;
    if (paramInteger.intValue() < 0)
    {
      i = 1;
      return new _b(paramString, i);
    }
    if (paramString.length() == 0)
    {
      i = 4;
      return new _b(paramString, i);
    }
    String str = "";
    if (paramInteger.intValue() == 0) {
      return new _b(str, i);
    }
    HashMap localHashMap = new HashMap();
    for (char c : paramString.toCharArray()) {
      if (localHashMap.containsKey(Character.valueOf(c)))
      {
        if (((Integer)localHashMap.get(Character.valueOf(c))).intValue() < paramInteger.intValue())
        {
          localHashMap.put(Character.valueOf(c), Integer.valueOf(((Integer)localHashMap.get(Character.valueOf(c))).intValue() + 1));
          str = str + c;
        }
      }
      else
      {
        localHashMap.put(Character.valueOf(c), Integer.valueOf(1));
        str = str + c;
      }
    }
    return new _b(String.valueOf(str), i);
  }
  
  private static void osuper()
  {
    System.err.println("Usage: encode [-n [int]] [-r int | -l int] [-c string] [-d int] <filename>");
  }
  
  static class _b
  {
    String a;
    int osuper;
    
    public _b(String paramString, int paramInt)
    {
      this.a = paramString;
      this.osuper = paramInt;
    }
  }




private static class b
  extends RuntimeException
{
  public b(String[] paramArrayOfString, String paramString1, int paramInt, String paramString2)
  {
    super("You found Bug #" + paramInt + ". \nArguments used: " + Arrays.toString(paramArrayOfString) + "\nFile: " + paramString1 + " \nEncode result: " + paramString2, null, true, false);
  }
}
}
