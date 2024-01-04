class a{

private x= 3;
  int get()
    {
    return x;
    
    }
}
class b{

main()
  {

  a obj = new a();

  System.out.println(obj.x);//error
System.out.print(obj.get());
  
  
  }
  
}
