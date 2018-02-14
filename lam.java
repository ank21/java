class lam{

public static void main(String ar[]){

//StringLength sl=s->s.length();
//System.out.println(sl.getLen("ankit"));
StringLength s=(b,a)->a+b;
System.out.println(s.add(2,3));
}

interface StringLength{
//  int getLen(String s);
  int add(int a,int x);
}

}
