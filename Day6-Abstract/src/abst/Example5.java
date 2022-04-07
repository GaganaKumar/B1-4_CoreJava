package abst;

class Example5 
{
		Example5()
		{
			System.out.println("Animal is created");
		}
		}
		class Tiger extends Example5
		{
			Tiger(){
			super();
			System.out.println("Tiger is created");
			}
		}
		class Main
		{
			public static void main(String[] args) 
			{
				
		Tiger z=new Tiger();
			}

		}

