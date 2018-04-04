public class FindPatternInString {

	public static void findPattern(String txt, String pat)
	{
		int lps[] = new int[pat.length()];
		
		computeLps(pat,lps);
		
		int j = 0;
		
		for(int i = 0;i< txt.length();)
		{
			if(txt.charAt(i)==pat.charAt(j))
			{
				i++;
				j++;
				
				if(j==pat.length())
				{
					System.out.println("Pattern found at index "+(i-j));
					j = lps[j-1];
				}
			}
			else if(i<txt.length() && txt.charAt(i)!=pat.charAt(j))
			{
				if(j!=0)
				j = lps[j-1];
				else
					i = i + 1;
			}	
		}
	}
	
	public static void computeLps(String pat, int lps[])
	{
		int len = 0;
		int i = 1;
		
		lps[0] = 0;
		
		for(i=1;i<pat.length();)
		{
		
		if(pat.charAt(i)==pat.charAt(len))
		{
			len++;
		    lps[i] = len;
		    i++;
		}
		else
		{
			if(len!=0)
			{
				len = lps[len-1];
			}
			else
			{
				lps[i] = 0;
				i++;
			}
		}
		}	
	}
}
