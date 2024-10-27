package string;

import java.util.Stack;

public class BalancedSymbolsChecker {
	public static void main(String[] args) {
		System.out.println(isBaslaned("[{()}]"));
	}
	public static boolean isBaslaned(String s) {
		Stack<Character> stack= new Stack<>();
		for(char c:s.toCharArray()) {
			if(c=='('|| c=='{' || c=='[') {
				stack.push(c);
			}else if(c==')'|| c=='}' || c==']') {
				char lastelemnet = stack.pop();
				if(!isMatching(lastelemnet,c)) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	public static boolean isMatching(char open,char closed) {
		return (open =='('&& closed==')' ||
				open =='{'&& closed=='}' ||
				open =='['&& closed==']'
				
				);
	}

}
