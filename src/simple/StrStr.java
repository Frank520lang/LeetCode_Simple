package simple;

public class StrStr {
  public static void main(String[] args) {
    String s1 = "";
    String s2 = "";
    int index = testStr(s1, s2);
    System.out.println("对应的索引下标：" + index);
  }

  private static int testStr(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    for (int i = 0; i + len2 <= len1; i++) {
      boolean flag = true;
      // 遍历待判断的字符串
      for (int j = 0; j < len2; j++) {
        // 返回对应索引的值
        /*
         * 代码优化
         * if (s1.charAt(i + j) == s2.charAt(j)) {
         * } else {
         * flag = false;
         * break;
         * }
         */
        if (s1.charAt(i + j) != s2.charAt(j)) {
          flag = false;
          break;
        }
      }
      if (flag) {
        return i;
      }
    }
    return -1;
  }
}
