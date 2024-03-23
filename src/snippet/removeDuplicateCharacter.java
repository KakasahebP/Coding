package snippet;

public class removeDuplicateCharacter {
	public static void main(String[] args) {
		
		String s="kakasahebpawar";
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(c->sb.append((char)c));
		
		System.out.println(sb);
	}

}
