import java.util.*;


class str {
    String sentance;
	String temp;
	int count[]=new int[50];

    public void read(){
        Scanner sc = new Scanner(System.in);
        sentance = sc.nextLine();
    }

    public void count(){
        String s = this.sentance;
		String[] arr = s.split(" ");
		int i,j,len;
		
		len=arr.length; 
		
		for(i=0;i<len;i++)
		{
			count[i]=1; 
		}
		for(i=0;i<len;i++)
		{
			temp=arr[i]; 
			for(j=i+1;j<len;j++)
			{
				if(temp.equals(arr[j])) //if match found
				{
					count[i]+=1;
					for(int k=j;k<len-1;k++)
						arr[k]=arr[k+1];
					len=len-1;
				}
			}

			System.out.println(temp+"  =  "+count[i]+" times");

		}
		
        
        
    }

    public void replace(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word that need to replace : ");
        String word = sc.nextLine();
        System.out.print("Enter the word that need to place : ");
        String rword = sc.nextLine();

        String sentannce = this.sentance;
        String sent="";
        String[] arrOfStr = sentannce.split(" ");

        for(int i=0;i<arrOfStr.length;i++){
            if((arrOfStr[i].compareTo(word))==0){
                arrOfStr[i] = rword;
            }
            sent = sent +  arrOfStr[i] + " ";
        }
        this.sentance = sent;

    }

    public void reverse(){
        String sentannce = this.sentance;
        String sent="";
        String temp;
        String[] arrOfStr = sentannce.split(" ");
        
        for(int i=0;i<arrOfStr.length;i++){;
            temp="";
            String[] temparray = arrOfStr[i].split("");
            for(int j=arrOfStr[i].length()-1;j>=0;j--){
                temp = temp + temparray[j];
            }
            sent = sent +  temp + " ";
        }
        this.sentance = sent;

    }

    public String dis(){
        return sentance;
    }

    public static void main(String[] args) {
        int opt;
        str Obj = new str();
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Enter Sentence");
            System.out.println("2) Display Sentence");
            System.out.println("3) Count of each word");
            System.out.println("4) Replace word");
            System.out.println("5) Reverse each word ");
			System.out.println("6) Exit");
			
    
            System.out.print("Option :: ");
            
            opt = Integer.parseInt(sc.nextLine());
            switch(opt){
                case 1:
                    System.out.print("Enter the sentance : ");
                    Obj.read();
                    break;
                case 2:
                    System.out.println("Sentance : "+Obj.dis());
                    break;
                case 3:
                    System.out.println("Counts");
                    Obj.count();
                    break;
                case 4:
                    System.out.println("Replace words");
                    Obj.replace();
                    break;
                case 5:
                    System.out.println("Reverse each word");
                    Obj.reverse();
                    break;
				case 6:
						System.exit(0);
                default:
                System.out.println("try another menu!");
                    
            }
        }
    }
}
