package classAssignment2;

public class assignment {
	char[] strarry;
	void work(String str)
	{
		while(str.length() !=0)
		{
			strarry = str.toCharArray();
			char ch = strarry[0];
			int count =1;
			for(int i =1; i< strarry.length;i++)
			{
				if(ch==strarry[i])
				{
					count++;
				}
			}
			if(((ch != ' ')&&(ch != '\t')))
			{
				System.out.println(ch + " - "+count);
			}
			str = str.replace(""+ch, "");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment in = new assignment();
		in.work("hello word");

	}

}
