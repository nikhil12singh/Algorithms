public class Trie {
	static int ALPHABET_SIZE = 26;
	
	static class TrieNode{
		TrieNode children[] = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord = false;
		
		TrieNode()
		{
			for(int i=0;i<ALPHABET_SIZE;i++)
			{
				children[i] = null;
			}
			
		}
	}
		static TrieNode root = null;
		
		public static void insert(String str)
		{
			TrieNode node = root;
			
			for(int i=0;i<str.length();i++)
			{
				int child = str.charAt(i) - 'a';
				if(node.children[child] == null)
					node.children[child] = new TrieNode();
				node = node.children[child];
			}
			node.isEndOfWord = true;
		}
		
		public static boolean search(String str)
		{
			TrieNode node = root;
			
			for(int i=0;i<str.length();i++)
			{
				int child = str.charAt(i) - 'a';
				if(node.children[child]==null)
					return false;
				node = node.children[child];
			}
			return (node!=null && node.isEndOfWord==true);
		}
}
