interface sayable{
    void sayHello( String name);

}

public class FunctionalInterfaceExample implements sayable{
  @Override
  public void sayHello(String name){
  System.out.println(name);
  }
    

public static void main(String[] args){

    FunctionalInterfaceExample fr=new FunctionalInterfaceExample();
    fr.sayHello("hello"+ "" + " "+"rani");
  
    }
  }
  

