package String;

public class min_word_dist {
	
	public static int word_dist(String [] words,String w1,String w2)
	{
		int dist;
		int ind1=0,ind2 = 0;
		
		for(int i=0;i<words.length;i++)
		{
			if(w1.equals(words[i]))
			{
				ind1=i;
			}
			if(w2.equals(words[i]))
			{
				ind2=i;
			}
		}
		dist = ind2-ind1;
		
		return Math.abs(dist);
	}
	
	public static void main(String[] args)
	{
		String [] words_list= {"the","quick","brown","fox","quick"};
		String word1 = "the";
		String word2 = "fox";
		
		int len = word_dist(words_list, word1, word2);
		
		System.out.println(len);
	}
}
