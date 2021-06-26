package simple;

public class LongestCommonPrefix {
	//返回最长公共前缀
	public String longestCommonPrefix(String []strs) {
		if (strs==null || strs.length==0) {
			return "";
		}
		//初始化前缀
		String prefix = strs[0];
		int count = strs.length;

		//遍历字符串数组
		for (int i = 1; i < count; i++) {
			//获取到公共前缀
			prefix = longestCommonPrefix(prefix,strs[i]);
			if (prefix.length()==0) {
				break;
			}
		}

		return prefix;
	}
//获取两个字符串的公共前缀
	private String longestCommonPrefix(String prefix, String strs) {
		// TODO Auto-generated method stub
		int length = Math.min(prefix.length(),strs.length());
		int index = 0;
		//charAt返回对应索引的char
		while(index<length&&prefix.charAt(index)==strs.charAt(index)) {
			index++;
		}
		//substring切割字符串
		return prefix.substring(0,index);
	}

}
